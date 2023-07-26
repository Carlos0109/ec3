package com.carlos.ec03_qrjc.model

import com.google.gson.annotations.SerializedName


data class Coupon(
    val name: String,
    @SerializedName("https://digimon.shadowsmith.com/img/koromon.jpg")
    val img: String,
    val level: String
)

fun getData(): List<Coupon> =
    listOf(
        Coupon("Koromon","https://digimon.shadowsmith.com/img/koromon.jpg","In Training"),
        Coupon("Tsunomon","https://digimon.shadowsmith.com/img/tsunomon.jpg","In Training"),
        Coupon("Yokomon","https://digimon.shadowsmith.com/img/yokomon.jpg","In Training"),
        Coupon("Motimon","https://digimon.shadowsmith.com/img/motimon.jpg","In Training"),
        Coupon("Tanemon","https://digimon.shadowsmith.com/img/tanemon.jpg","In Training"),
        Coupon("Bukamon","https://digimon.shadowsmith.com/img/bukamon.jpg","In Training"),
        Coupon("Agumon","https://digimon.shadowsmith.com/img/agumon.jpg","Rookie")
    )



