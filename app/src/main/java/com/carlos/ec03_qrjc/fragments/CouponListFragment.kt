package com.carlos.ec03_qrjc.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.carlos.ec03_qrjc.RVCouponListAdapter
import com.carlos.ec03_qrjc.databinding.FragmentCouponListBinding
import com.carlos.ec03_qrjc.model.getData

class CouponListFragment : Fragment() {

    private lateinit var binding: FragmentCouponListBinding
    private lateinit var viewModel: CouponListViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(CouponListViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentCouponListBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RVCouponListAdapter(listOf())
        binding.rvCouponList.adapter = adapter
        binding.rvCouponList.adapter = RVCouponListAdapter(getData())
        binding.rvCouponList.layoutManager = GridLayoutManager(requireContext(),2, RecyclerView.VERTICAL, false)
        viewModel.couponList.observe(requireActivity()){
            adapter.coupons = it
            adapter.notifyDataSetChanged()
        }
        viewModel.getCouponsFromService()

    }

}