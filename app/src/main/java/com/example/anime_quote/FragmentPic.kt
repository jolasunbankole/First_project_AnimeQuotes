package com.example.anime_quote

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.anime_quote.databinding.FragmentPicBinding


class FragmentPic : Fragment() {

    private var _binding: FragmentPicBinding? = null
    private val binding  get()= _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPicBinding.inflate(inflater, container, false)
        binding.imageView.drawable
        binding.button2.setOnClickListener{
            val action = FragmentPicDirections.actionFragmentPicToFragmentEnelPic()
            findNavController().navigate(action)

        }
      return binding.root
        }

}
