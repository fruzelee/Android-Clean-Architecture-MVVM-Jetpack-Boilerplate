package com.boilerplate.android

import com.boilerplate.android.product_list.business.Product

interface ProductRepository {
    suspend fun getProductList(): List<Product>
}