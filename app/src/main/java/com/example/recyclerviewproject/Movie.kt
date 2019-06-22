package com.example.recyclerviewproject

import android.media.Rating

data class Movie(
    val id: Int,
    val image: String,
    val rating: String,
    val likePercent: Int,
    val voteCount: Int,
    val title: String,
    val language: String,
    val type: String,
    val isNew: Boolean
)