package com.example.androidapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Elden_Ring_Character_Adapter(private val characters:List<EldenRing>):RecyclerView.Adapter<Elden_Ring_Character_Adapter.EldenRingCharacterViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = EldenRingCharacterViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.eledenring_character_view,parent,false))

    class EldenRingCharacterViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val eldenringImage: ImageView=itemView.findViewById(R.id.eldenring_character_image)
        val eldenringLocation: TextView=itemView.findViewById(R.id.eldenring_character_location)
        val eldenringDescription: TextView=itemView.findViewById(R.id.eldenring_character_description)
        val eldenringName:TextView=itemView.findViewById(R.id.eldenring_character_name)
        val eldenringDrop:TextView=itemView.findViewById(R.id.eldenring_character_drop)
        val eldenringHealth:TextView=itemView.findViewById(R.id.eldenring_character_health)

    }



    override fun onBindViewHolder(holder: EldenRingCharacterViewHolder, position: Int) {
        val eldenringCharacter=characters[position]
        holder.eldenringImage.setImageResource(eldenringCharacter.image)
        holder.eldenringDescription.text=eldenringCharacter.description
        holder.eldenringLocation.text=eldenringCharacter.location
        holder.eldenringName.text=eldenringCharacter.name
        holder.eldenringDrop.text="Drop: ".plus(eldenringCharacter.drop.toString().plus(" Runes"))
        holder.eldenringHealth.text= "Health: ".plus(eldenringCharacter.health.toString())
    }

    override fun getItemCount()=characters.size
}