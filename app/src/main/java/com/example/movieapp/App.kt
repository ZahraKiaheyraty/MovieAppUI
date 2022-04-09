package com.example.movieapp

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.movieapp.ui.component.movies.data.Movie
import com.example.movieapp.ui.component.movies.details.HomeContent

@Composable
fun MyApp(navigateToProfile: (Movie) -> Unit) {
    Scaffold(
        content = {
            HomeContent(navigateToProfile = navigateToProfile)
        }
    )
}

@Preview("app")
@Composable
fun APP() {
    MyApp {}
}
