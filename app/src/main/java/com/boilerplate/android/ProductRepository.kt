package com.boilerplate.android

import com.boilerplate.android.product_list.presentation.ProductCardViewState

interface ProductRepository {
    suspend fun getProductList(): List<ProductCardViewState>
}