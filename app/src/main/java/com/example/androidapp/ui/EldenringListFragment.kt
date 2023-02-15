package com.example.androidapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidapp.EldenRing
import com.example.androidapp.Elden_Ring_Character_Adapter
import com.example.androidapp.R

class EldenringListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_eldenring_list, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.eldenring_recylcer_view)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val characters = mutableListOf<EldenRing>()
        characters.add(createCharacter1())
        characters.add(createCharacter2())
        characters.add(createCharacter3())
        characters.add(createCharacter4())

        val adapter = Elden_Ring_Character_Adapter(characters)
        recyclerView.adapter = adapter


        return view
    }

    private fun createCharacter1() = EldenRing(
        health = 25100,
        name = "Godrick the grafted",
        description = "Lord of Stormveil Castle",
        drop = 10000,
        location = "Stormveil Castle",
        image = R.drawable.godrick_the_grafted
    )

    private fun createCharacter2() = EldenRing(
        health = 9572,
        name = "General Radahn",
        description = "General Radahn was the most powerful demigod and a ferocious warrior, who warred with his siblings for control of the Great Runes.",
        drop = 70000,
        location = "Redmane Castle",
        image = R.drawable.general_radahn
    )

    private fun createCharacter3() = EldenRing(
        health = 11170,
        name = "Astel, Naturalborn of the Void",
        description = "A strange alien lifeform comprised of many-colored star debris which landed in the Lands Between long ago",
        drop = 80000,
        location = "Lake of Rot",
        image = R.drawable.astel
    )

    private fun createCharacter4() = EldenRing(
        health = 13339,
        name = "Radagon of the Golden Order",
        description = "A tall, fractured god wielding the hammer that shattered the Elden Ring",
        drop = 0,
        location = "Elden Throne",
        image = R.drawable.radagon
    )

}