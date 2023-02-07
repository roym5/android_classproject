package com.example.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.eldenring_recylcer_view)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val characters = mutableListOf<EldenRing>()
        for (i in 0..30) {
            characters.add(createCharacters())
        }
    }

    private fun createCharacters() = EldenRing(
        name = "Matthew",
        description = "blah",
        drop = Random.nextInt(10000, 20000),
        location = "blahblah",
        image = R.drawable.ic_android_black_24dp
    )



}