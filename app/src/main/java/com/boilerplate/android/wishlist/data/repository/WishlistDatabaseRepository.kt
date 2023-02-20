package com.boilerplate.android.wishlist.data.repository

import javax.inject.Inject

class WishlistDatabaseRepository @Inject constructor() : WishlistRepository {
    override fun isFavourite(productId: String): Boolean {
        return true
    }

    override fun addToWishList(productId: String) {
    }

    override fun removeFromWishList(productId: String) {
    }

}
