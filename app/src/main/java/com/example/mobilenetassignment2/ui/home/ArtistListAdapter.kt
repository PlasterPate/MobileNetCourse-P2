package com.example.mobilenetassignment2.ui.home

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mobilenetassignment2.databinding.ItemArtistBinding
import com.example.mobilenetassignment2.model.entity.ArtistEntity
import com.squareup.picasso.Picasso

class ArtistListAdapter(private val onItemClickListener: OnItemClickListener) :
    ListAdapter<ArtistEntity, ArtistListAdapter.ArtistViewHolder>(ArtistDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistViewHolder {
        return ArtistViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ArtistViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item, onItemClickListener)
    }

    class ArtistViewHolder private constructor(private val binding: ItemArtistBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private val TAG = "ArtistViewHolder"

        fun bind(artistEntity: ArtistEntity, onItemClickListener: OnItemClickListener) {
            // Trying to load picture from url
            binding.artist = artistEntity
            binding.clickListener = onItemClickListener
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ArtistViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemArtistBinding.inflate(layoutInflater, parent, false)
                return ArtistViewHolder(binding)
            }
        }
    }
}

class ArtistDiffCallback : DiffUtil.ItemCallback<ArtistEntity>() {
    override fun areItemsTheSame(oldItem: ArtistEntity, newItem: ArtistEntity): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ArtistEntity, newItem: ArtistEntity): Boolean {
        return oldItem == newItem
    }
}