package com.carlos.ec03_qrjc.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.carlos.ec03_qrjc.data.retrofit.response.ApiResponse
import com.carlos.ec03_qrjc.model.Coupon
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CouponFavoriteViewModel: ViewModel(){
    private val _coupon = MutableLiveData<Coupon>()
    val coupon: LiveData<Coupon>
        get() = _coupon

    fun getCouponFromService(name: String) {
        val couponData = getCouponDataFromService(name)
        val coupon = Coupon(couponData.name, couponData.level, couponData.img)
        _coupon.value = coupon
    }
    private fun getCouponDataFromService(name: String): Coupon {
        return Coupon("Motimon", "https://digimon.shadowsmith.com/img/motimon.jpg","In Training" )
    }
}