package com.example.movieapp.ui.component.movies.details

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movieapp.ui.component.MovieListItem
import com.example.movieapp.ui.component.movies.data.DataProvider
import com.example.movieapp.ui.component.movies.data.Movie
import com.example.movieapp.ui.component.PopularListItem
import com.example.movieapp.ui.component.SerialListItem
import com.example.movieapp.ui.component.banner.BannerUi
import com.example.movieapp.ui.theme.bCard

@Composable
fun HomeContent(navigateToProfile: (Movie) -> Unit) {
    val context = LocalContext.current
    val scroller = rememberScrollState()

    Column(
    ) {
        Column(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
        ) {
            Card(
            ) {
                BannerUi()
            }
        }

        Spacer(modifier = Modifier.padding(top = 2.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .verticalScroll(
                    state = rememberScrollState()
                ),
        ) {
            //Popular
            Card(
                shape = RoundedCornerShape(corner = CornerSize(10.dp)),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        shape = RoundedCornerShape(corner = CornerSize(10.dp)),

                        brush = Brush.verticalGradient(
                            colors = listOf(
                                bCard,
                                Color.White
                            )
                        )
                    )
                    .padding(8.dp),
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 5.dp,
                            start = 18.dp
                        ),
                    text = "Popular",
                    style = MaterialTheme.typography.h6,
                    textAlign = TextAlign.Left,
                    color = Color.Black,
                    fontSize = 18.sp
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                ) {
                    val actions = remember { DataProvider.popularList }
                    LazyRow(

                    ) {
                        items(
                            items = actions,
                            itemContent = {
                                PopularListItem(movie = it, navigateToProfile)
                            }
                        )
                    }
                }
            }

            //serial
            Spacer(modifier = Modifier.padding(top = 5.dp))
            Card(
                shape = RoundedCornerShape(corner = CornerSize(10.dp)),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        shape = RoundedCornerShape(corner = CornerSize(10.dp)),

                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.White,
                                Color.White
                            )
                        )
                    )
                    .padding(8.dp),
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 5.dp,
                            start = 18.dp
                        ),
                    text = "Serials",
                    style = MaterialTheme.typography.h6,
                    textAlign = TextAlign.Left,
                    color = Color.Black,
                    fontSize = 18.sp
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                ) {
                    val serials = remember { DataProvider.serialList }
                    LazyRow(

                    ) {
                        items(
                            items = serials,
                            itemContent = {
                                SerialListItem(movie = it, navigateToProfile)
                            }
                        )
                    }
                }
            }

            //comedy&action
            Spacer(modifier = Modifier.padding(top = 5.dp))
            Card(
                shape = RoundedCornerShape(corner = CornerSize(10.dp)),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        shape = RoundedCornerShape(corner = CornerSize(10.dp)),
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                White,
                                bCard
                            )
                        )
                    )
                    .padding(8.dp),
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 5.dp,
                            start = 18.dp
                        ),
                    text = "Comedy & Action",
                    style = MaterialTheme.typography.h6,
                    textAlign = TextAlign.Left,
                    color = Color.Black,
                    fontSize = 18.sp
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                ) {
                    val movies = remember { DataProvider.newList }
                    LazyRow(

                    ) {
                        items(
                            items = movies,
                            itemContent = {
                                MovieListItem(movie = it, navigateToProfile)
                            }
                        )
                    }
                }
            }
        }
    }
}