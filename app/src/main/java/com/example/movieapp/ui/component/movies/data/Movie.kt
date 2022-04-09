package com.example.movieapp.ui.component.movies.data

import java.io.Serializable

data class Movie(
    val id: Int,
    val name: String,
    val director: String,
    val movieImageId: Int = 0
) : Serializable
