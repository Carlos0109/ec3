package com.carlos.ec03_qrjc.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.carlos.ec03_qrjc.R
import com.carlos.ec03_qrjc.databinding.FragmentCouponDetailBinding

class CouponDetailFragment : Fragment() {

    private lateinit var binding: FragmentCouponDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentCouponDetailBinding.inflate(inflater, container, false)
        return binding.root
    }


}