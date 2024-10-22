package com.example.pokedex.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.data.Pokemon
import com.example.pokedex.data.remote.PokemonListResponse
import com.example.pokedex.databinding.PokemonListItemBinding

public class PokemonListAdapter: ListAdapter<PokemonListResponse, PokemonListAdapter.PokemonViewHolder>() {
    class PokemonViewHolder(
        private val binding: PokemonListItemBinding): RecyclerView.ViewHolder(binding.root){
            fun bind(pokemon: Pokemon){
                binding.pokemonName.text = pokemon.name
                binding.pokemonImage.load(pokemon.imageUrl)

            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val binding = PokemonListItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PokemonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.bind(getItem(position))
    }


}