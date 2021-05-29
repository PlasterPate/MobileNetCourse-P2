package com.example.mobilenetassignment2.ui

import android.text.SpannableStringBuilder
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.core.text.bold
import androidx.databinding.BindingAdapter
import com.example.mobilenetassignment2.R
import com.example.mobilenetassignment2.model.entity.ArtistEntity
import com.squareup.picasso.Picasso
import java.util.*


@BindingAdapter("subtitleFormatted")
fun TextView.setArtistSubtitle(artistEntity: ArtistEntity){
    "${artistEntity.nationality} ${artistEntity.type.toString().toLowerCase(Locale.ENGLISH)}"
        .apply { text = this }
}

@BindingAdapter("deathDate")
fun TextView.setDeathDate(artistEntity: ArtistEntity){
    text = artistEntity.deathDate ?: context.getString(R.string.still_alive)
}

@BindingAdapter("lifeDate")
fun TextView.setLifeDate(artistEntity: ArtistEntity){
    text = SpannableStringBuilder()
        .append(context.getString(R.string.from))
        .bold { append(artistEntity.birthDate) }
        .append(context.getString(R.string.to))
        .bold { append(artistEntity.deathDate ?: context.getString(R.string.now)) }
}

@BindingAdapter("artistImage")
fun ImageView.setImage(artistEntity: ArtistEntity){
    try {
        Picasso.get().load(artistEntity.image?.toUri()).into(this)
    } catch (e: Exception) { }
}
