package com.example.retrofitpractice.repository

import com.example.retrofitpractice.MainActivity
import com.example.retrofitpractice.Baemin
import com.example.retrofitpractice.network.BaeminClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BaeminRepository {
    fun loadBaeminNotice(page : Int, mCallback : MainActivity) {
        val call = BaeminClient.service.loadNotice(page.toString())

        call.enqueue(object : Callback<Baemin> {
            override fun onResponse(call: Call<Baemin>, response: Response<Baemin>) {
                if(response.isSuccessful()){
                    mCallback.loadComplete(response.body()!!.data)
                }
                else{
                    // 통신에 성공했으나 문제가 있는 경우
                }
            }

            override fun onFailure(call: Call<Baemin>, t: Throwable) {
                // 통신에 실패한 경우
            }
        })
    }
}