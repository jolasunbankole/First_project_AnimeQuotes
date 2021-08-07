package com.example.anime_quote

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.anime_quote.databinding.FragmentNarutoPicBinding


class FragmentNarutoPic : Fragment() {
    private var _binding: FragmentNarutoPicBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNarutoPicBinding.inflate(inflater, container, false )
        binding.imageView7.drawable
        binding.button8.setOnClickListener{
            val action = FragmentNarutoPicDirections.actionFragmentNarutoPicToFragmentJdsPic()
            findNavController().navigate(action)
        }
        return binding.root
    }


}