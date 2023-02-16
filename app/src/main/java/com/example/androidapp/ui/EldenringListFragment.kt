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
        image = "https://static.wikia.nocookie.net/eldenring/images/4/43/ER_Godrick_the_Grafted.jpg/revision/latest?cb=20220417190541"
    )

    private fun createCharacter2() = EldenRing(
        health = 9572,
        name = "General Radahn",
        description = "General Radahn was the most powerful demigod and a ferocious warrior, who warred with his siblings for control of the Great Runes.",
        drop = 70000,
        location = "Redmane Castle",
        image = "https://static.wikia.nocookie.net/eldenring/images/3/32/ER_General_Radahn.jpg/revision/latest?cb=20220217022220"
    )

    private fun createCharacter3() = EldenRing(
        health = 11170,
        name = "Astel, Naturalborn of the Void",
        description = "A strange alien lifeform comprised of many-colored star debris which landed in the Lands Between long ago",
        drop = 80000,
        location = "Lake of Rot",
        image = "https://eldenring.wiki.fextralife.com/file/Elden-Ring/astel-naturalborn-of-the-void-1-hq-elden-ring-wiki-guide.jpg"
    )

    private fun createCharacter4() = EldenRing(
        health = 13339,
        name = "Radagon of the Golden Order",
        description = "A tall, fractured god wielding the hammer that shattered the Elden Ring",
        drop = 0,
        location = "Elden Throne",
        image = "https://eldenring.wiki.fextralife.com/file/Elden-Ring/radagon-of-the-golden-order-boss-elden-ring-wiki-guide.jpg"
    )

}