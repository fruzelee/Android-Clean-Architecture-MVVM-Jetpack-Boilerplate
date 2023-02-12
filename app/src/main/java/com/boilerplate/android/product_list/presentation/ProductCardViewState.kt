package com.boilerplate.android.product_list.presentation

data class ProductCardViewState(
    val title: String,
    val description: String,
    val price: String,
    val imageUrl: String,
    val isFavorite: Boolean
)
