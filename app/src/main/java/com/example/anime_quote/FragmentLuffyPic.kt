package com.example.anime_quote

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.anime_quote.databinding.FragmentLuffyPicBinding


class FragmentLuffyPic : Fragment() {
    private var _binding: FragmentLuffyPicBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLuffyPicBinding.inflate(inflater, container, false)
        binding.imageView6.drawable
        binding.button7.setOnClickListener{
            val action = FragmentLuffyPicDirections.actionFragmentLuffyPicToFragmentNarutoPic()
            findNavController().navigate(action)
        }
        return binding.root
    }


}