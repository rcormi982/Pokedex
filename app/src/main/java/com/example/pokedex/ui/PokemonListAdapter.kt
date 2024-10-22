package com.example.pokedex.ui

import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.data.remote.PokemonListResponse
import com.example.pokedex.databinding.PokemonListItemBinding

class PokemonListAdapter {
    private val pokemonList = mutableListOf<PokemonListResponse>()

    inner class PokemonViewHolder(private val binding: PokemonListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        //fun bind(pokemonListResponse: PokemonListResponse)
    }
}