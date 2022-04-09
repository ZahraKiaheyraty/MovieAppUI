package com.example.movieapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.movieapp.ui.component.movies.data.DataProvider
import com.example.movieapp.ui.component.movies.data.Movie
import com.example.movieapp.ui.theme.bCard

@Composable
fun MovieListItem(movie: Movie, navigateToProfile: (Movie) -> Unit) {
    ConstraintLayout(
        modifier = Modifier
            .padding(top = 30.dp, start = 10.dp, bottom = 10.dp)
            .background(
                shape = RoundedCornerShape(corner = CornerSize(10.dp)),
                brush = Brush.verticalGradient(
                    colors = listOf(
                        bCard,
                        Color.White
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier
                .height(215.dp)
                .width(150.dp)
        ) {
            MovieImage(movie)
            Text(
                modifier = Modifier
                    .padding(start = 8.dp),
                textAlign = TextAlign.Center,
                text = movie.name,
                fontSize = 12.sp, style = typography.h6
            )
            Text(
                modifier = Modifier
                    .padding(start = 5.dp),
                textAlign = TextAlign.Center,
                text = movie.director,
                fontSize = 8.sp,
                style = typography.caption
            )
        }
    }
}

@Composable
private fun MovieImage(movie: Movie) {
    Image(
        painter = painterResource(id = movie.movieImageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(10.dp)
            .size(150.dp)
            .clip(RoundedCornerShape(corner = CornerSize(10.dp)))
    )
}

@Preview
@Composable
fun PreviewMvItem() {
    val mv = DataProvider.newmovie
    MovieListItem(movie = mv, navigateToProfile = {})
}
