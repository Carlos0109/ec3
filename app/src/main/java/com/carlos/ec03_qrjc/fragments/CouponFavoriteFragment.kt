package com.carlos.ec03_qrjc.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.carlos.ec03_qrjc.R
import com.carlos.ec03_qrjc.databinding.FragmentCouponFavoriteBinding

class CouponFavoriteFragment : Fragment() {

    private lateinit var binding:FragmentCouponFavoriteBinding
    private lateinit var viewModel: CouponFavoriteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentCouponFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.coupon.observe(requireActivity()) { coupon ->
            binding.txtName.text = coupon.name
            binding.txtLevel.text = coupon.level
            Glide.with(binding.root)
                .load(coupon.img)
                .into(binding.imageview)
        }
        viewModel.getCouponFromService("Coupon Name")
    }

}