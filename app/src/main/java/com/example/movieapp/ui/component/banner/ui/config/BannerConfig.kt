package com.example.movieapp.ui.component.banner.ui.config

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class BannerConfig(
    var bannerHeight: Dp = 195.dp,
    var bannerImagePadding: Dp = 5.dp,
    var shape: Shape = RoundedCornerShape(16.dp),
    var intervalTime: Long = 5000,
    var contentScale: ContentScale = ContentScale.Crop,
    var repeat: Boolean = true,
    var itemSpacing: Dp = 0.dp,
    var contentPadding: PaddingValues = PaddingValues(0.dp),
)