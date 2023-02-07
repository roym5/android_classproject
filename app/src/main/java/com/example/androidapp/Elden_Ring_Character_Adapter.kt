package com.example.androidapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Elden_Ring_Character_Adapter(private val characters:List<EldenRing>):RecyclerView.Adapter<Elden_Ring_Character_Adapter.EldenRingCharacterViewHolder>() {


    class EldenRingCharacterViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val eldenringImage: ImageView=itemView.findViewById(R.id.eldenring_character_image)
        val eldenringLocation: TextView=itemView.findViewById(R.id.location)
        val eldenringDescription: TextView=itemView.findViewById(R.id.description)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int = EldenRingCharacterViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.eledenring_character_view,parent,false)
        return EldenRingCharacterViewHolder(view)
    }

    override fun onBindViewHolder(holder: EldenRingCharacterViewHolder, position: Int) {
        val eldenringCharacter=characters[position]
        holder.eldenring_character_image.setImageResource(eldenringCharacter.image)
        holder.eldenring_character_description.text=eldenringCharacter.description
        holder.eldenring_character_location.text=eldenringCharacter.location.toString()
    }

    override fun getItemCount()=characters.size
}