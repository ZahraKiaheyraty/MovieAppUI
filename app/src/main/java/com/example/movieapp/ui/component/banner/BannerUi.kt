package com.example.movieapp.ui.component.banner

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.movieapp.R
import com.example.movieapp.ui.component.banner.model.BaseBannerBean


data class BannerBean(
    override val data: Any? = null
) : BaseBannerBean()

@Composable
fun BannerUi() {
    val context = LocalContext.current
    val scroller = rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scroller)) {

        val itemsBanner = arrayListOf(
            BannerBean(R.drawable.b_peakyblinders),
            BannerBean(R.drawable.b_spider_man),
            BannerBean(R.drawable.b_coda),
            BannerBean(R.drawable.b_free_guy),
        )

        BannerPager(
            modifier = Modifier.padding(top = 10.dp),
            items = itemsBanner,
            indicatorGravity = Alignment.BottomEnd
        ) { item ->
            Toast.makeText(context, "item:$item", Toast.LENGTH_SHORT).show()
        }
    }
}