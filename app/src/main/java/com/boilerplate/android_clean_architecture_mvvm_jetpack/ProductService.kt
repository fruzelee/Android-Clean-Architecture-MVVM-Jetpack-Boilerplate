package com.boilerplate.android_clean_architecture_mvvm_jetpack

import retrofit2.http.GET

interface ProductService {

    @GET
    suspend fun getProductList(): List<ProductEntity>

}