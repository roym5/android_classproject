package com.example.androidapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.androidapp.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_detail, container, false)
        if(arguments!=null){
            val name=requireArguments().getString("name")
            val health=requireArguments().getString("health")
            val description=requireArguments().getString("description")
            val location=requireArguments().getString("location")
            val drop=requireArguments().getString("drop")
            val image=requireArguments().getString("image")

           // view.findViewById<TextView>(R.id.eldenring_character_image)=image

        }
        return view
    }

}
