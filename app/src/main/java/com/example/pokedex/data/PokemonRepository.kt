package com.example.pokedex.data

import com.example.pokedex.data.remote.PokemonListResponse

interface PokemonRepository {

    suspend fun readAll(): PokemonListResponse
    suspend fun readOne(): String

}