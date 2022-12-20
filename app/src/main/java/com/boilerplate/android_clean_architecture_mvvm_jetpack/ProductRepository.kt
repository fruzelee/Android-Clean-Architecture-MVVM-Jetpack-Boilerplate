package com.boilerplate.android_clean_architecture_mvvm_jetpack

interface ProductRepository {
    suspend fun getProductList(): List<ProductCardViewState>
}