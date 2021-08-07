package com.example.anime_quote

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.anime_quote.databinding.FragmentLawPicBinding


class FragmentLawPic : Fragment() {

    private var _binding: FragmentLawPicBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLawPicBinding.inflate(inflater, container, false)
        binding.imageView3.drawable
        binding.button4.setOnClickListener {
            val action = FragmentLawPicDirections.actionFragmentLawPicToFragmentBbPic()
            findNavController().navigate(action)
        }
        return binding.root
    }




}