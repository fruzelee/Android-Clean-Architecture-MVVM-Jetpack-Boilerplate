package com.boilerplate.android

import com.boilerplate.android.product_details.business.ProductDetails
import com.boilerplate.android.product_list.business.Product

interface ProductRepository {
    suspend fun getProductList(): List<Product>
    suspend fun getProductDetails(productId: String): ProductDetails
}