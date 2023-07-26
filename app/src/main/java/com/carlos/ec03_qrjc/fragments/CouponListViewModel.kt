package com.carlos.ec03_qrjc.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.carlos.ec03_qrjc.data.retrofit.repository.CouponsRepository
import com.carlos.ec03_qrjc.data.retrofit.response.ApiResponse
import com.carlos.ec03_qrjc.model.Coupon
import com.carlos.ec03_qrjc.model.getData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CouponListViewModel: ViewModel() {

    val repository = CouponsRepository()
    val couponList: MutableLiveData<List<Coupon>> = MutableLiveData<List<Coupon>>()

    fun getCouponList(){
        val data = getData()
        couponList.value = data
    }
    fun getCouponsFromService(){
        viewModelScope.launch(Dispatchers.IO){
            val response= repository.getCoupons()
            when(response){
                is ApiResponse.Error ->{
                    // colocar error
                }
                is ApiResponse.Success ->{
                    couponList.postValue(response.data.coupons)
                }
            }
        }
    }
}