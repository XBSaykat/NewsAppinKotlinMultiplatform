package com.saykat.newskmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "News App in Kotlin Multiplatform",
    ) {
        App()
    }
}