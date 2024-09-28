package com.example.superheros.model

import com.example.superheros.R


object HeroRepository {
    val heroes = listOf(
        Hero(
            heroName = R.string.hero1,
            heroDescription = R.string.description1,
            heroImage = R.drawable.android_superhero1
        ),
        Hero(
            heroName = R.string.hero2,
            heroDescription = R.string.description2,
            heroImage = R.drawable.android_superhero2
        ),
        Hero(
            heroName = R.string.hero3,
            heroDescription = R.string.description3,
            heroImage = R.drawable.android_superhero3
        ),
        Hero(
            heroName = R.string.hero4,
            heroDescription = R.string.description4,
            heroImage = R.drawable.android_superhero4
        ),
        Hero(
            heroName = R.string.hero5,
            heroDescription = R.string.description5,
            heroImage = R.drawable.android_superhero5
        ),
        Hero(
            heroName = R.string.hero6,
            heroDescription = R.string.description6,
            heroImage = R.drawable.android_superhero6
        )
    )
}