package com.example.pokedex.data

import retrofit2.http.Url

class Pokemon (
    val id: Int,
    val name: String,
    val imageUrl: String="\"https://picsum.photos/200/300\""
)