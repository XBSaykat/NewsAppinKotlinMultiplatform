package com.saykat.newskmp.utils

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import com.saykat.newskmp.headlines.data.Article
import com.saykat.newskmp.headlines.data.Source

const val BASE_URL = "https://newsapi.org/v2/"
const val DB_Name = "myNewsDB"
const val dataStoreFileName = "setting.preferences_pb"
//val API_KEY = BuildKonfig.API_KEY
val categoryList = arrayListOf(
    "Business",
    "Entertainment",
    "General",
    "Health",
    "Science",
    "Sports",
    "Technology")




val FadeIn = fadeIn(animationSpec = tween(220, delayMillis = 90)) +
        scaleIn(
            initialScale = 0.92f,
            animationSpec = tween(220, delayMillis = 90)
        )

val FadeOut = fadeOut(animationSpec = tween(90))


val articles: List<Article> = listOf(
    Article(
        source = Source(
            id = "the-wall-street-journal",
            name = "The Wall Street Journal"
        ),
        author = "The Wall Street Journal",
        title = "Wall Street Turns Skittish on Eve of Rate Cuts - The Wall Street Journal",
        description = null,
        url = "https://www.wsj.com/finance/wall-street-turns-skittish-on-eve-of-rate-cuts-5e97c19c",
        urlToImage = "https://ichef.bbci.co.uk/news/1024/branded_news/f50e/live/0e4b6f60-71ec-11ef-b282-4535eb84fe4b.jpg",
        publishedAt = "2024-09-15T04:00:00Z",
        content = null
    ),
    Article(
        source = Source(
            id = null,
            name = "BBC News"
        ),
        author = null,
        title = "How the world’s smelliest fruit is making coffee more expensive - BBC.com",
        description = "A \"perfect storm\" of economic and environmental factors in coffee-producing regions is pushing up prices.",
        url = "https://www.bbc.com/news/articles/c5y37dvlr70o",
        urlToImage = "https://www.indystar.com/gcdn/-mm-/14f6a20ea46ef7239967ac8489f4a4c91147820c/c=0-243-2394-1596/local/-/media/2017/02/23/INGroup/Indianapolis/636234288375686944-3-Powerball.jpg?width=2394&height=1353&fit=crop&format=pjpg&auto=webp",
        publishedAt = "2024-09-15T03:14:47Z",
        content = "How much is too much for a caffeine fix?"
    ),
    Article(
        source = Source(
            id = "cbs-news",
            name = "CBS News"
        ),
        author = "CBS News",
        title = "Why the United Auto Workers union is poised to strike major car makers - CBS News",
        description = "Nearly 150,000 auto workers are prepared to strike as they negotiate for better pay and benefits.",
        url = "https://www.cbsnews.com/news/uaw-strike-auto-workers-union-strike-ford-gm-stellantis/",
        urlToImage = "https://fortune.com/img-assets/wp-content/uploads/2024/09/GettyImages-1530052512-e1726344484903.jpg?resize=1200,600",
        publishedAt = "2024-09-15T01:00:00Z",
        content = null
    ),
    Article(
        source = Source(
            id = "nbc-news",
            name = "NBC News"
        ),
        author = "NBC News",
        title = "A Republican governor rebuked Trump in his debut. Few noticed. - NBC News",
        description = "An early 2024 contender, Governor Sununu is increasingly a thorn in Trump's side.",
        url = "https://www.nbcnews.com/politics/2024-election/republican-governor-rebuked-trump-debut-few-noticed-rcna104553",
        urlToImage = "https://assets.bwbx.io/images/users/iqjWHBFdfxIU/iZ6Fk3qlaPcw/v0/1200x762.jpg",
        publishedAt = "2024-09-15T02:32:00Z",
        content = null
    ),
    Article(
        source = Source(
            id = null,
            name = "ESPN"
        ),
        author = "John Doe",
        title = "FIFA unveils World Cup 2026 logo - ESPN",
        description = "The official logo for the 2026 FIFA World Cup has been revealed.",
        url = "https://www.espn.com/soccer/fifa-world-cup/story/2345678/fifa-unveils-world-cup-2026-logo",
        urlToImage = "https://cdn.abcotvs.com/dip/images/15300346_tesla-fire.png?w=1600",
        publishedAt = "2024-09-14T22:00:00Z",
        content = null
    ),
    Article(
        source = Source(
            id = null,
            name = "TechCrunch"
        ),
        author = "Jane Roe",
        title = "Apple's September 2024 Event Recap - TechCrunch",
        description = "Apple announces the latest iPhones, Apple Watch, and more.",
        url = "https://techcrunch.com/apple-september-event-2024-recap",
        urlToImage = "https://assets.bwbx.io/images/users/iqjWHBFdfxIU/iHD_mhx6_P_k/v0/1200x778.jpg",
        publishedAt = "2024-09-12T18:00:00Z",
        content = "Everything announced at Apple's big event."
    ),
    Article(
        source = Source(
            id = "the-wall-street-journal",
            name = "The Wall Street Journal"
        ),
        author = "The Wall Street Journal",
        title = "Wall Street Turns Skittish on Eve of Rate Cuts - The Wall Street Journal",
        description = null,
        url = "https://www.wsj.com/finance/wall-street-turns-skittish-on-eve-of-rate-cuts-5e97c19c",
        urlToImage = "https://ichef.bbci.co.uk/news/1024/branded_news/f50e/live/0e4b6f60-71ec-11ef-b282-4535eb84fe4b.jpg",
        publishedAt = "2024-09-15T04:00:00Z",
        content = null
    ),
    Article(
        source = Source(
            id = null,
            name = "BBC News"
        ),
        author = null,
        title = "How the world’s smelliest fruit is making coffee more expensive - BBC.com",
        description = "A \"perfect storm\" of economic and environmental factors in coffee-producing regions is pushing up prices.",
        url = "https://www.bbc.com/news/articles/c5y37dvlr70o",
        urlToImage = "https://www.indystar.com/gcdn/-mm-/14f6a20ea46ef7239967ac8489f4a4c91147820c/c=0-243-2394-1596/local/-/media/2017/02/23/INGroup/Indianapolis/636234288375686944-3-Powerball.jpg?width=2394&height=1353&fit=crop&format=pjpg&auto=webp",
        publishedAt = "2024-09-15T03:14:47Z",
        content = "How much is too much for a caffeine fix?"
    ),
    Article(
        source = Source(
            id = "cbs-news",
            name = "CBS News"
        ),
        author = "CBS News",
        title = "Why the United Auto Workers union is poised to strike major car makers - CBS News",
        description = "Nearly 150,000 auto workers are prepared to strike as they negotiate for better pay and benefits.",
        url = "https://www.cbsnews.com/news/uaw-strike-auto-workers-union-strike-ford-gm-stellantis/",
        urlToImage = "https://fortune.com/img-assets/wp-content/uploads/2024/09/GettyImages-1530052512-e1726344484903.jpg?resize=1200,600",
        publishedAt = "2024-09-15T01:00:00Z",
        content = null
    ),
    Article(
        source = Source(
            id = "nbc-news",
            name = "NBC News"
        ),
        author = "NBC News",
        title = "A Republican governor rebuked Trump in his debut. Few noticed. - NBC News",
        description = "An early 2024 contender, Governor Sununu is increasingly a thorn in Trump's side.",
        url = "https://www.nbcnews.com/politics/2024-election/republican-governor-rebuked-trump-debut-few-noticed-rcna104553",
        urlToImage = "https://assets.bwbx.io/images/users/iqjWHBFdfxIU/iZ6Fk3qlaPcw/v0/1200x762.jpg",
        publishedAt = "2024-09-15T02:32:00Z",
        content = null
    ),
    Article(
        source = Source(
            id = null,
            name = "ESPN"
        ),
        author = "John Doe",
        title = "FIFA unveils World Cup 2026 logo - ESPN",
        description = "The official logo for the 2026 FIFA World Cup has been revealed.",
        url = "https://www.espn.com/soccer/fifa-world-cup/story/2345678/fifa-unveils-world-cup-2026-logo",
        urlToImage = "https://cdn.abcotvs.com/dip/images/15300346_tesla-fire.png?w=1600",
        publishedAt = "2024-09-14T22:00:00Z",
        content = null
    ),
    Article(
        source = Source(
            id = null,
            name = "TechCrunch"
        ),
        author = "Jane Roe",
        title = "Apple's September 2024 Event Recap - TechCrunch",
        description = "Apple announces the latest iPhones, Apple Watch, and more.",
        url = "https://techcrunch.com/apple-september-event-2024-recap",
        urlToImage = "https://assets.bwbx.io/images/users/iqjWHBFdfxIU/iHD_mhx6_P_k/v0/1200x778.jpg",
        publishedAt = "2024-09-12T18:00:00Z",
        content = "Everything announced at Apple's big event."
    )
)