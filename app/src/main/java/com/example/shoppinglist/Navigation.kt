package com.example.shoppinglist

import kotlinx.serialization.Serializable

@Serializable
sealed class Destination {

    @Serializable
    data object Main : Destination()

}