package com.boilerplate.android.wishlist.data.repository

interface WishListRepository {

    fun isFavourite(productId: String): Boolean
    fun addToWishList(productId: String)
    fun removeFromWishList(productId: String)

}