package com.boilerplate.android

import com.boilerplate.android.product_details.data.ProductDetailsEntity
import com.boilerplate.android.product_list.data.ProductEntity
import retrofit2.http.GET
import retrofit2.http.Query

interface ProductService {

    @GET("products")
    suspend fun getProductList(): List<ProductEntity>

    @GET("productDetails")
    suspend fun getProductDetails(@Query("productId") productId: String): ProductDetailsEntity
}