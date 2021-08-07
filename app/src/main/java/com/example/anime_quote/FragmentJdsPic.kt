package com.example.anime_quote

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.anime_quote.databinding.FragmentJdsPicBinding


class FragmentJdsPic : Fragment() {
    private var _binding: FragmentJdsPicBinding? = null
    private val binding get()  = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentJdsPicBinding.inflate(inflater, container, false)
        binding.imageView8.drawable
        binding.button9.setOnClickListener{
            val action = FragmentJdsPicDirections.actionFragmentJdsPicToFragmentNagatoPic()
            findNavController().navigate(action)
        }
        return binding.root
    }


}