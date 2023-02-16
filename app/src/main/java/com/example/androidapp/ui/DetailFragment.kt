package com.example.androidapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.androidapp.R


class DetailFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_detail, container, false)
        if (arguments != null) {
            val name = requireArguments().getString("name")
            val health = requireArguments().getInt("health")
            val description = requireArguments().getString("description")
            val location = requireArguments().getString("location")
            val drop = requireArguments().getInt("drop")
            val image = requireArguments().getString("image")

            view.findViewById<TextView>(R.id.character_name).text = name
            view.findViewById<TextView>(R.id.character_health).text = health.toString()
            view.findViewById<TextView>(R.id.character_description).text = description
            view.findViewById<TextView>(R.id.character_location).text = location
            view.findViewById<TextView>(R.id.character_drop).text = drop.toString()

            val imageview = view.findViewById<ImageView>(R.id.character_image)
            Glide.with(this).load(image).into(imageview);
        }
        return view
    }

}
