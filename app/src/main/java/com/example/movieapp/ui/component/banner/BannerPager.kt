package com.example.movieapp.ui.component.banner

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import com.example.movieapp.ui.component.banner.model.BaseBannerBean
import com.example.movieapp.ui.component.banner.ui.BannerCard
import com.example.movieapp.ui.component.banner.ui.config.BannerConfig
import com.google.accompanist.pager.*
import kotlinx.coroutines.launch
import java.util.*
import kotlin.math.absoluteValue

@OptIn(ExperimentalPagerApi::class)
@Composable
fun <T : BaseBannerBean> BannerPager(
    modifier: Modifier = Modifier,
    items: List<T> = arrayListOf(),
    config: BannerConfig = BannerConfig(),
    indicatorIsVertical: Boolean = false,
    indicatorGravity: Alignment = Alignment.BottomCenter,
    onBannerClick: (T) -> Unit
) {
    if (items.isEmpty()) {
        throw NullPointerException("items is not null")
    }

    val pagerState = rememberPagerState()
    if (config.repeat) {
        StartBanner(pagerState, config.intervalTime)
    }

    Box(modifier = modifier.height(config.bannerHeight)) {
        HorizontalPager(
            count = items.size,
            state = pagerState,
            itemSpacing = config.itemSpacing,
            contentPadding = config.contentPadding
        ) { page ->
            val item = items[page]
            BannerCard(
                bean = item,
                modifier = Modifier
                    .graphicsLayer {
                        val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue
                        lerp(
                            start = 1f,
                            stop = 1f,
                            fraction = 1f - pageOffset.coerceIn(0f, 1f)
                        ).also { scale ->
                            scaleX = scale
                            scaleY = scale
                        }
                        alpha = lerp(
                            start = 0.5f,
                            stop = 1f,
                            fraction = 1f - pageOffset.coerceIn(0f, 1f)
                        )
                    }
                    .fillMaxSize()
                    .padding(config.bannerImagePadding),
                shape = config.shape,
                contentScale = config.contentScale
            ) {
                onBannerClick(item)
            }
        }
        if (indicatorIsVertical) {
            VerticalPagerIndicator(
                pagerState = pagerState,
                modifier = Modifier
                    .align(indicatorGravity)
                    .padding(15.dp),
            )
        } else {
            HorizontalPagerIndicator(
                pagerState = pagerState,
                modifier = Modifier
                    .align(indicatorGravity)
                    .padding(15.dp),
            )
        }
    }
}

@ExperimentalPagerApi
@Composable
fun StartBanner(pagerState: PagerState, intervalTime: Long) {
    val coroutineScope = rememberCoroutineScope()
    val timer = Timer()
    val timerTask = object : TimerTask() {
        override fun run() {
            coroutineScope.launch {
                pagerState.animateScrollToPage((pagerState.currentPage + 1) % pagerState.pageCount)
            }
        }
    }
    timer.schedule(timerTask, intervalTime, intervalTime)
}