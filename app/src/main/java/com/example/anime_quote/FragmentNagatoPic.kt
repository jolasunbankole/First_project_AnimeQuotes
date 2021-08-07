package com.example.anime_quote

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.anime_quote.databinding.FragmentNagatoPicBinding


class FragmentNagatoPic : Fragment() {
    private var _binding: FragmentNagatoPicBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNagatoPicBinding.inflate(inflater, container, false)
        binding.imageView10.drawable
        binding.button10.setOnClickListener{
            val action = FragmentNagatoPicDirections.actionFragmentNagatoPicToFragmentSengokuPic()
            findNavController().navigate(action)
        }
        return binding.root
    }


}