package com.example.anime_quote

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.anime_quote.databinding.FragmentMadaraPicBinding


class FragmentMadaraPic : Fragment() {
    private var _binding: FragmentMadaraPicBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMadaraPicBinding.inflate(inflater, container, false)
        binding.imageView5.drawable
        binding.button6.setOnClickListener{
            val action = FragmentMadaraPicDirections.actionFragmentMadaraPicToFragmentLuffyPic()
            findNavController().navigate(action)
        }

        return binding.root
    }


}