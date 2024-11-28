package com.saykat.newskmp.headlines.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.saykat.newskmp.headlines.data.Article
import com.saykat.newskmp.utils.Resource
import newsappinkotlinmultiplatform.composeapp.generated.resources.Res
import newsappinkotlinmultiplatform.composeapp.generated.resources.logo
import org.jetbrains.compose.resources.painterResource

@Composable
fun HeadlineScreen() {
    val headlineViewModel = HeadlineViewModel()
    val headlineNews by headlineViewModel.headlineNews.collectAsState()
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Headline") }
            )
        },
        modifier = Modifier.fillMaxSize()
    ) { padding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(padding)
        ) {
            //HeadLineList()
            when (headlineNews) {
                is Resource.Error -> {}
                Resource.Idle -> {}
                Resource.Loading -> {}
                is Resource.Success -> {
                    val listData = (headlineNews as Resource.Success).data
                    LazyColumn(modifier = Modifier.fillMaxSize()) {
                        items(listData) {
                            HeadLineList(it)
                        }
                    }

                }
            }
        }
    }
}

@Composable
fun HeadLineList(data: Article) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .border(
                width = 1.dp,
                color = MaterialTheme.colors.onSurface.copy(alpha = 0.12f),
                shape = RoundedCornerShape(4.dp)
            )
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        AsyncImage(
            contentScale = ContentScale.FillBounds,
            model = data.urlToImage,
            error = painterResource(Res.drawable.logo),
            contentDescription = null,
            modifier = Modifier.size(100.dp)
                .clip(RoundedCornerShape(8.dp))
                .border(
                    width = 1.dp,
                    color = MaterialTheme.colors.onSurface.copy(alpha = 0.05f),
                    shape = RoundedCornerShape(8.dp)
                )

        )

        Column(modifier = Modifier.weight(1f)) {
            Text(text = data.author ?: data.source.name, style = MaterialTheme.typography.overline)
            Text(text = data.title, style = MaterialTheme.typography.subtitle1)
            Text(text = data.publishedAt, style = MaterialTheme.typography.overline)
        }
    }
}

@Composable
fun HeadLineList() {
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .border(
                width = 1.dp,
                color = MaterialTheme.colors.onSurface.copy(alpha = 0.12f),
                shape = RoundedCornerShape(4.dp)
            )
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            contentScale = ContentScale.Fit,
            painter = painterResource(Res.drawable.logo),
            contentDescription = null,
            modifier = Modifier.size(120.dp)
                .clip(RoundedCornerShape(8.dp))
                .border(
                    width = 1.dp,
                    color = MaterialTheme.colors.onSurface.copy(alpha = 0.12f),
                    shape = RoundedCornerShape(8.dp)
                )
        )
        Column(modifier = Modifier.weight(1f)) {
            Text(text = "The Wall Street Journal", style = MaterialTheme.typography.overline)
            Text(
                text = "Wall Street Turns Skittish on Eve of Rate Cuts - The Wall Street Journal",
                style = MaterialTheme.typography.subtitle1
            )
            Text(text = "2024-09-15T04:00:00Z", style = MaterialTheme.typography.overline)
        }
    }
}