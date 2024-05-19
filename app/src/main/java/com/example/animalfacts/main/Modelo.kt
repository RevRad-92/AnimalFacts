package com.example.animalfacts.main

import kotlinx.serialization.Serializable

@Serializable
data class Modelo(
    val type: Byte,
    val text: String
)