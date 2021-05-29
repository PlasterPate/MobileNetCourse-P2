package com.example.mobilenetassignment2.model.entity

data class ArtistEntity(
    val id: Int,
    val name: String,
    val birthDate: String,
    val deathDate: String?,
    val image: String?,
    val birthPlace: String,
    val nationality: String,
    val type: ArtistType
)