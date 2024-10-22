package com.example.pokedex.ui

import androidx.lifecycle.ViewModel
import com.example.pokedex.data.PokemonRepository
import com.example.pokedex.data.remote.PokemonListResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val repository: PokemonRepository
):ViewModel() {
    suspend fun read():PokemonListResponse {
        return repository.readAll()
    }
}