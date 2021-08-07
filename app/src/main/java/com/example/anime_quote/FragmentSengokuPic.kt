package com.example.anime_quote

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.anime_quote.databinding.FragmentSengokuPicBinding

class FragmentSengokuPic : Fragment() {
    private var _binding: FragmentSengokuPicBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSengokuPicBinding.inflate(inflater, container, false)
        binding.imageView11.drawable
        binding.button11.setOnClickListener{
            val action = FragmentSengokuPicDirections.actionFragmentSengokuPicToFragmentDone()
            findNavController().navigate(action)
        }
        return binding.root
    }


}