package com.example.androidapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.androidapp.databinding.FragmentDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        if (arguments != null) {
            val name = requireArguments().getString("name")
            val health = requireArguments().getInt("health")
            val description = requireArguments().getString("description")
            val location = requireArguments().getString("location")
            val drop = requireArguments().getInt("drop")
            val image = requireArguments().getString("image")


            binding.characterName.text=name
            binding.characterHealth.text=health.toString()
            binding.characterDescription.text=description
            binding.characterLocation.text=location
            binding.characterDrop.text=drop.toString()



            binding.characterImage.let { imageView ->
                Glide.with(this)
                    .load(image)
                    .into(imageView)
            }
        }
        return  binding.root
    }

}
