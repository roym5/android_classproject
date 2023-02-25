package com.example.androidapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.androidapp.databinding.EldenringCharacterViewBinding
import com.example.androidapp.model.EldenRing


class EldenRingCharacterAdapter(
    private val characters: List<EldenRing>,
    private val onItemClick: (adapterPosition: Int) -> Unit
) : RecyclerView.Adapter<EldenRingCharacterAdapter.EldenRingCharacterViewHolder>() {



        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
                EldenRingCharacterViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = EldenringCharacterViewBinding.inflate(layoutInflater, parent, false)

            return EldenRingCharacterViewHolder(binding) { position ->
                onItemClick(position)
            }
        }

        inner class EldenRingCharacterViewHolder(
            private val binding: EldenringCharacterViewBinding,
            private val onItemClick: (adapterPosition: Int) -> Unit
        ) : RecyclerView.ViewHolder(binding.root) {


            init {
                itemView.setOnClickListener { onItemClick(adapterPosition) }
            }
            fun bind(character: EldenRing) {
                Glide
                    .with(binding.root)
                    .load(character.image)
                    .into(binding.eldenringCharacterImage)

                binding.eldenringCharacterName.text = character.name
                binding.eldenringCharacterLocation.text = character.location
            }
        }


        override fun onBindViewHolder(holder: EldenRingCharacterViewHolder, position: Int) {
            val character = characters[position]
            holder.bind(character)
        }

        override fun getItemCount() = characters.size
    }