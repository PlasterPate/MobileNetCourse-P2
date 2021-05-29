package com.example.mobilenetassignment2.model.repository

import com.example.mobilenetassignment2.model.datasource.ArtistDataSource
import com.example.mobilenetassignment2.model.entity.ArtistEntity

object ArtistRepository {

    fun getAllArtists(): List<ArtistEntity>{
        return ArtistDataSource.getAllArtists()
    }

    fun getArtist(id: Int): ArtistEntity{
        return ArtistDataSource.getArtist(id)
    }
}