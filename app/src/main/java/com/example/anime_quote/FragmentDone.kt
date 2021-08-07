package com.example.anime_quote

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.anime_quote.databinding.FragmentDoneBinding


class FragmentDone : Fragment() {
    private var _binding: FragmentDoneBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDoneBinding.inflate(inflater, container, false)
        binding.text4.text
        binding.button12.setOnClickListener {
            val action = FragmentDoneDirections.actionFragmentDoneToFragmentMain()
            findNavController().navigate(action)
        }
        return binding.root
    }


}