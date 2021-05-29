package com.example.mobilenetassignment2.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mobilenetassignment2.model.entity.ArtistEntity
import com.example.mobilenetassignment2.model.repository.ArtistRepository

class HomeViewModel : ViewModel() {

    private val _artists = MutableLiveData<List<ArtistEntity>>().apply {
        value = ArtistRepository.getAllArtists()
    }
    val artists: LiveData<List<ArtistEntity>> = _artists

}
