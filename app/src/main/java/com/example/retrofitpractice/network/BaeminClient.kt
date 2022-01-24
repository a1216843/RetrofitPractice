package com.example.retrofitpractice.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object BaeminClient {
    const val baseUrl = "https:/ceo.baemin.com/cms/v1/"
    val retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val service = retrofit.create(BaeminService::class.java)
}