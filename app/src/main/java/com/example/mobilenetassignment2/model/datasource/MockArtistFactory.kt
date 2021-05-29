package com.example.mobilenetassignment2.model.datasource

import com.example.mobilenetassignment2.model.entity.ArtistEntity
import com.example.mobilenetassignment2.model.entity.ArtistType

object MockArtistFactory {
    val artist1 = ArtistEntity(
        1,
        "Al Pacino",
        "04/25/1940",
        null,
        "https://i.guim.co.uk/img/static/sys-images/Guardian/Pix/pictures/2015/4/22/1429714377254/Al-Pacino-sits-his-face-l-009.jpg?width=700&quality=85&auto=format&fit=max&s=ceb094f866612efaef7aa3b47a13af53",
        "New York, United States",
        "American",
        ArtistType.Actor
        )

    val artist2 = ArtistEntity(
        2,
        "John Lennon",
        "10/09/1940",
        "12/08/1980",
        "https://e00-marca.uecdn.es/assets/multimedia/imagenes/2020/10/09/16022796931216.png",
        "Liverpool, United Kingdom",
        "British",
        ArtistType.Musician
    )

    val artist3 = ArtistEntity(
        3,
        "Vincent van Gogh",
        "03/30/1853",
        "07/29/1890",
        "https://assets.vangoghmuseum.nl/f9a7a187-484e-4821-b84a-79c836109029?w=1280&h=720&c=12f8ae08a908d9261f58a6bb1bfaa67e8daf061b56752678819c8c241a881bbe",
        "Zundert, Netherlands",
        "Dutch",
        ArtistType.Painter
    )

    val artist4 = ArtistEntity(
        4,
        "Emma Stone",
        "11/09/1988",
        null,
        "https://otakukart.com/wp-content/uploads/2021/02/emma-stone-1200x720.jpg",
        "Arizona, United States",
        "American",
        ArtistType.Actress
    )

    val artist5 = ArtistEntity(
        5,
        "Anthony Hopkins",
        "12/31/1937",
        null,
        "https://s.abcnews.com/images/Entertainment/WireAP_70ac02244e734c82b1084eb12065d8a7_16x9_992.jpg",
        "Margam, United Kingdom",
        "Welsh",
        ArtistType.Actor
    )

    val artist6 = ArtistEntity(
        6,
        "Gary Moore",
        "04/04/1952",
        "02/06/2011",
        "https://cdn.mos.cms.futurecdn.net/9Qb39cBNuPNyMNh5ewfZ3k.jpg",
        "Belfast, United Kingdom",
        "Northern Irish",
        ArtistType.Musician
    )

    val artist7 = ArtistEntity(
        7,
        "Taraneh Alidoosti",
        "01/12/1984",
        null,
        "https://miami.cbslocal.com/wp-content/uploads/sites/15909786/2017/01/gettyimages-533487778.jpg?w=640&h=360&crop=1",
        "Tehran",
        "Iranian",
        ArtistType.Actress
    )

    val artist8 = ArtistEntity(
        8,
        "Bob Marley",
        "02/06/1945",
        "05/11/19810,",
        "https://www.grammy.com/sites/com/files/styles/news_detail_header/public/bob_marley_gettyimages-96231752.jpg?itok=1QPkpDvT",
        "Nine Mile, Jamaica",
        "Jamaican",
        ArtistType.Musician
    )
}