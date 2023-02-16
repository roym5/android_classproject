package com.example.androidapp

import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.androidapp.ui.DetailFragment

class Elden_Ring_Character_Adapter(private val characters: List<EldenRing>) :
    RecyclerView.Adapter<Elden_Ring_Character_Adapter.EldenRingCharacterViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            EldenRingCharacterViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.eledenring_character_view, parent, false)
        return EldenRingCharacterViewHolder(view) { position ->
            val character = characters[position]
            val bundle = bundleOf(
                "name" to character.name,
                "description" to character.description,
                "location" to character.location,
                "health" to character.health,
                "drop" to character.drop,
                "image" to character.image
            )
            val detailFragment = DetailFragment()
            detailFragment.arguments = bundle
            val activity = view.context as AppCompatActivity

            activity.supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace(R.id.fragment_container_view, detailFragment)
                addToBackStack(null)
            }
        }
    }

    inner class EldenRingCharacterViewHolder(
        itemView: View,
        private val onItemClick: (adapterPosition: Int) -> Unit
    ) : RecyclerView.ViewHolder(itemView) {
        val eldenringImage: ImageView = itemView.findViewById(R.id.eldenring_character_image)
        val eldenringLocation: TextView = itemView.findViewById(R.id.eldenring_character_location)

        // val eldenringDescription: TextView =
        //     itemView.findViewById(R.id.eldenring_character_description)
        val eldenringName: TextView = itemView.findViewById(R.id.eldenring_character_name)
        //val eldenringDrop: TextView = itemView.findViewById(R.id.eldenring_character_drop)
        //val eldenringHealth: TextView = itemView.findViewById(R.id.eldenring_character_health)

        init {
            itemView.setOnClickListener { onItemClick(adapterPosition) }
        }
    }


    override fun onBindViewHolder(holder: EldenRingCharacterViewHolder, position: Int) {
        val eldenringCharacter = characters[position]
        //Glide.with(holder.itemView.context).load(eldenringCharacter.image).into(holder.eldenringImage)
        Glide.with(holder.itemView.context)
            .load("https://image.api.playstation.com/vulcan/ap/rnd/202110/2000/phvVT0qZfcRms5qDAk0SI3CM.png")
            .into(holder.eldenringImage)
        //holder.eldenringDescription.text = eldenringCharacter.description
        holder.eldenringLocation.text = "Found in ".plus(eldenringCharacter.location)
        holder.eldenringName.text = eldenringCharacter.name
        // holder.eldenringDrop.text = "Drop: ".plus(eldenringCharacter.drop.toString().plus(" Runes"))
        // holder.eldenringHealth.text = "Health: ".plus(eldenringCharacter.health.toString())
        //holder.eldenringImage.setImageResource(eldenringCharacter.image)

    }

    override fun getItemCount() = characters.size
}