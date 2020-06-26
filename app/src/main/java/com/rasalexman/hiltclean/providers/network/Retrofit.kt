package com.rasalexman.hiltclean.providers.network

import com.ihsanbal.logging.Level
import com.rasalexman.hiltclean.BuildConfig
import com.squareup.moshi.Moshi
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.internal.platform.Platform
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.security.SecureRandom
import java.security.cert.CertificateException
import java.security.cert.X509Certificate
import java.util.*
import java.util.concurrent.TimeUnit
import javax.net.ssl.SSLContext
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager

private val SERVER_ERROR_CODES = listOf(404, 504, 400, 401, 500, 403)

///-------------- NETWORK CONSTANTS ----////
const val NETWORK_AVAILABLE_AGE = 60

fun getUnsafeOkHttpClient(): OkHttpClient.Builder {
    try {
        // Create a trust manager that does not validate certificate chains
        return OkHttpClient.Builder().apply {
            val trustAllCerts = arrayOf<TrustManager>(object : X509TrustManager {
                override fun getAcceptedIssuers(): Array<X509Certificate> = arrayOf()

                @Throws(CertificateException::class)
                override fun checkClientTrusted(chain: Array<X509Certificate>, authType: String) =
                    Unit

                @Throws(CertificateException::class)
                override fun checkServerTrusted(chain: Array<X509Certificate>, authType: String) =
                    Unit
            })

            val sslContext = SSLContext.getInstance("SSL").apply {
                init(null, trustAllCerts, SecureRandom())
            }
            sslSocketFactory(sslContext.socketFactory, trustAllCerts[0] as X509TrustManager)
            hostnameVerifier { _, _ -> true }
        }
    } catch (e: Exception) {
        println("-----> Error with Socket SSL Factory $e")
        return OkHttpClient.Builder()
    }
}

fun createOkHttpClient(
    cache: Cache? = null
): OkHttpClient {
    val httpClient = getUnsafeOkHttpClient()
    httpClient.connectTimeout(30, TimeUnit.SECONDS)
    httpClient.writeTimeout(30, TimeUnit.SECONDS)
    httpClient.readTimeout(30, TimeUnit.SECONDS)

    // coil cache
    cache?.let {
        httpClient.cache(it)
    }

    /*
    httpClient.addInterceptor { chain ->
        if(mContext.isInternetAvailable()) {
            val request = chain.request()
            chain.proceed(request.newBuilder().build())
        } else {
            throw QException.NoInternetConnectionException()
        }
    }
    */

    httpClient.addInterceptor { chain ->
        val request = chain.request()
        val originalHttpUrl = request.url()

        val url = originalHttpUrl.newBuilder().build()

        chain.proceed(
            request.newBuilder()
                .url(url)
                .removeHeader("Pragma")
                .addHeader("Content-type", "application/json")
                .addHeader("Cache-Control", "public, max-age=$NETWORK_AVAILABLE_AGE")
                .addHeader("client", "android")
                .addHeader("Language", Locale.getDefault().language)
                .build()
        )
    }

    httpClient.addNetworkInterceptor { chain ->
        val originalResponse = chain.proceed(chain.request())
        val responceCode = originalResponse.code()
        return@addNetworkInterceptor when {
            SERVER_ERROR_CODES.contains(responceCode) -> {
                return@addNetworkInterceptor originalResponse.newBuilder().code(200)
                    .body(originalResponse.body()).build()
            }
            else -> originalResponse
        }
    }

    if (BuildConfig.DEBUG) {
        val logging = com.ihsanbal.logging.LoggingInterceptor.Builder()
            .loggable(BuildConfig.DEBUG)
            .setLevel(Level.BASIC)
            .log(Platform.INFO)
            .request("Request")
            .response("Response")
            .build()
        // add logging as last interceptor
        httpClient.addInterceptor(logging)  // <-- this is the important line!
    }

    return httpClient.build()
}

inline fun <reified F> createWebServiceApi(okHttpClient: OkHttpClient): F {
    val moshi = Moshi.Builder().build()
    val retrofit = Retrofit.Builder()
        .baseUrl(BuildConfig.SERVER_URL)
        .client(okHttpClient)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()
    return retrofit.create(F::class.java)
}