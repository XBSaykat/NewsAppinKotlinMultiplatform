package com.saykat.newskmp.headlines.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saykat.newskmp.headlines.data.Article
import com.saykat.newskmp.utils.Resource
import com.saykat.newskmp.utils.articles
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HeadlineViewModel : ViewModel() {
    private val _headlineNews = MutableStateFlow<Resource<List<Article>>>(Resource.Idle)
    val headlineNews = _headlineNews.asStateFlow()

    init {
        getHeadlineNews()
    }

    private fun getHeadlineNews() {
        viewModelScope.launch(Dispatchers.Default) {
            _headlineNews.emit(Resource.Loading)
            delay(2000)
            try {
                val response = articles
                _headlineNews.emit(Resource.Success(response))
            }catch (e: Exception){
                _headlineNews.emit(Resource.Error(e.message.toString()))
            }
        }
    }
}