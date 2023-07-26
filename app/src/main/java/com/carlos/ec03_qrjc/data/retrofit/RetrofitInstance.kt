package com.carlos.ec03_qrjc.data.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit = Retrofit.Builder().baseUrl("https://digimon-api.vercel.app/").client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getCouponService(): CouponService = retrofit.create(CouponService::class.java)
}