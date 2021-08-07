package com.example.anime_quote

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.anime_quote.databinding.FragmentEnelPicBinding


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentEnelPic.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentEnelPic : Fragment() {

    private var _binding: FragmentEnelPicBinding? = null
    private val binding get()= _binding!!




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEnelPicBinding.inflate(inflater, container, false)


        binding.Quote2.text
        binding.imageView2.drawable
        binding.button3.setOnClickListener{
            val action = FragmentEnelPicDirections.actionFragmentEnelPicToFragmentLawPic()
            findNavController().navigate(action)
        }
        return binding.root
    }





}


