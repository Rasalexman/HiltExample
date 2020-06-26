package com.rasalexman.hiltclean.model.remote

import com.google.gson.annotations.SerializedName

data class TranslateResponse(
    @SerializedName("responseData")
    val responseData: ResponseData
)