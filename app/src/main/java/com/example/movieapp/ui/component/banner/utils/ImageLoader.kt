package com.example.movieapp.ui.component.banner.utils

import android.graphics.BitmapFactory
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import coil.compose.rememberAsyncImagePainter

@Composable
fun ImageLoader(
    data: Any?,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Crop,
) {
    when (data) {
        is String -> {
            val painter = if (data.contains("https://") || data.contains("http://")) {
                rememberAsyncImagePainter(
                    model = data,
                )
            } else {
                val bitmap = BitmapFactory.decodeFile(data)
                BitmapPainter(bitmap.asImageBitmap())
            }
            Image(
                modifier = modifier,
                painter = painter,
                contentDescription = "",
                contentScale = contentScale
            )
        }
        is Int -> {
            Image(
                modifier = modifier,
                painter = painterResource(data),
                contentDescription = "",
                contentScale = contentScale
            )
        }
        else -> {
            throw IllegalArgumentException("path file drawable id")
        }
    }
}