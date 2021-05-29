package com.example.mobilenetassignment2.ui.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mobilenetassignment2.model.entity.ArtistEntity
import com.example.mobilenetassignment2.model.repository.ArtistRepository

class DetailsViewModel : ViewModel() {
    private var _artistEntity = MutableLiveData<ArtistEntity>()
    val artistEntity: LiveData<ArtistEntity> = _artistEntity

    fun fetchArtist(id: Int){
        _artistEntity.value = ArtistRepository.getArtist(id)
    }
}
