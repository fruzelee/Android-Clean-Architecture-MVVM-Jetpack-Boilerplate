package com.boilerplate.android

import com.boilerplate.android.product_list.data.ProductEntity
import retrofit2.http.GET

interface ProductService {

    @GET("products")
    suspend fun getProductList(): List<ProductEntity>

}