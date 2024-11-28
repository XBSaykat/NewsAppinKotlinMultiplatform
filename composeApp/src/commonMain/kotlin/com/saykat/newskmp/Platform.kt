package com.saykat.newskmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform