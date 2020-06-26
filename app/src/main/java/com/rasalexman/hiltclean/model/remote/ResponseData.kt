package com.rasalexman.hiltclean.model.remote

import com.google.gson.annotations.SerializedName

data class ResponseData (
	@SerializedName("translatedText")
	val translatedText : String,
	@SerializedName("match")
	val match : Float,
    @SerializedName("matches")
    val matches: List<Matches>?
)