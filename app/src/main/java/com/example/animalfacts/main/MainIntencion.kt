package com.example.animalfacts.main

sealed class MainIntencion {

    data object Refrescar: MainIntencion()
    data object RomperTodo: MainIntencion()

}