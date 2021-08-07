package com.example.anime_quote

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.anime_quote.databinding.FragmentBbPicBinding


class FragmentBbPic : Fragment() {
    private var _binding: FragmentBbPicBinding? = null
    private val binding get() = _binding!!




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBbPicBinding.inflate(inflater, container, false)
        binding.imageView4.drawable
        binding.button5.setOnClickListener{
            val action = FragmentBbPicDirections.actionFragmentBbPicToFragmentMadaraPic()
            findNavController().navigate(action)
        }
        return binding.root
    }


}