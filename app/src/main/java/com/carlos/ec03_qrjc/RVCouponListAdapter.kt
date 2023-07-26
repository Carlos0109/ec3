package com.carlos.ec03_qrjc

import android.R
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.Target
import com.carlos.ec03_qrjc.databinding.ItemCouponBinding
import com.carlos.ec03_qrjc.model.Coupon


class RVCouponListAdapter(var coupons:List<Coupon>):RecyclerView.Adapter<CouponVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CouponVH {
        val binding = ItemCouponBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CouponVH(binding)
    }

    override fun getItemCount(): Int = coupons.size

    override fun onBindViewHolder(holder: CouponVH, position: Int) {
        holder.bind(coupons[position])
    }
}


class CouponVH(private val binding: ItemCouponBinding):RecyclerView.ViewHolder(binding.root){
    fun bind(coupon: Coupon){
        binding.txtName.text = coupon.name
        Glide.with(binding.root)
            .load("https://digimon.shadowsmith.com/img/agumon.jpg")
            .into(binding.imageview)
        binding.txtLevel.text = coupon.level

    }
}