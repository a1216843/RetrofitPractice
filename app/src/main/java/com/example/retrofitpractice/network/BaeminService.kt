package com.example.retrofitpractice.network

import com.example.retrofitpractice.Baemin
import retrofit2.http.GET
import retrofit2.http.Query

interface BaeminService {
    @GET("contents?typeCode=notice&size=10")
    fun loadNotice(@Query("page") page: String): retrofit2.Call<Baemin>
}