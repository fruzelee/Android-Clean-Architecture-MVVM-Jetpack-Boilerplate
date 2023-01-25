package com.boilerplate.android

interface ProductRepository {
    suspend fun getProductList(): List<ProductCardViewState>
}