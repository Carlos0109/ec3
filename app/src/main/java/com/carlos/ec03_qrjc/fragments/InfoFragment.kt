package com.carlos.ec03_qrjc.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.carlos.ec03_qrjc.R
import com.carlos.ec03_qrjc.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: FragmentInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentInfoBinding.inflate(layoutInflater, container,false)
        return binding.root
    }


}