package com.carlos.ec03_qrjc.data.retrofit.repository

import com.carlos.ec03_qrjc.data.retrofit.RetrofitInstance
import com.carlos.ec03_qrjc.data.retrofit.response.ApiResponse
import com.carlos.ec03_qrjc.data.retrofit.response.CouponListResponse


class CouponsRepository {
    suspend fun getCoupons(): ApiResponse<CouponListResponse>{
        return try {
            val response = RetrofitInstance.getCouponService().getCoupons()
            ApiResponse.Success(response)
        } catch (e:Exception){
            ApiResponse.Error(e)
        }
    }
}