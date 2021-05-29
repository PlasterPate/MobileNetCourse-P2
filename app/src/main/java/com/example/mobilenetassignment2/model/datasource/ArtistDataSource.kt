package com.example.mobilenetassignment2.model.datasource

import com.example.mobilenetassignment2.model.entity.ArtistEntity

object ArtistDataSource {

    fun getAllArtists(): List<ArtistEntity> {
        return listOf(
            MockArtistFactory.artist1,
            MockArtistFactory.artist2,
            MockArtistFactory.artist3,
            MockArtistFactory.artist4,
            MockArtistFactory.artist5,
            MockArtistFactory.artist6,
            MockArtistFactory.artist7,
            MockArtistFactory.artist8
        )
    }

    fun getArtist(id: Int): ArtistEntity{
        return getAllArtists().single{
            it.id == id
        }
    }
}