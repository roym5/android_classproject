package com.example.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.commit
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidapp.ui.DetailFragment
import com.example.androidapp.ui.EldenringListFragment
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.fragment_container_view, EldenringListFragment())
            addToBackStack(null)
        }

    }
/*
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
*/

}