package com.boilerplate.android.wishlist.data.repository

interface WishlistRepository {

    fun isFavourite(productId: String): Boolean
    fun addToWishList(productId: String)
    fun removeFromWishList(productId: String)

}