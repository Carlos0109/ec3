package com.carlos.ec03_qrjc.data.retrofit

import com.carlos.ec03_qrjc.data.retrofit.response.CouponListResponse
import retrofit2.http.GET

interface CouponService {
    @GET("api/digimon")
    suspend fun getCoupons(): CouponListResponse
}