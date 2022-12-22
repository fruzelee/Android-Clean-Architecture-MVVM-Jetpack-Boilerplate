package com.boilerplate.android_clean_architecture_mvvm_jetpack.di

import com.boilerplate.android_clean_architecture_mvvm_jetpack.ApiClient
import com.boilerplate.android_clean_architecture_mvvm_jetpack.ProductRepository
import com.boilerplate.android_clean_architecture_mvvm_jetpack.ProductRepositoryAPI
import com.boilerplate.android_clean_architecture_mvvm_jetpack.ProductService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

@Module
@InstallIn()
class RepositoryModule {

    @Provides
    fun providesProductServices(): ProductService = ApiClient.getService()

    @Provides
    fun providesProductRepositoryAPI(service: ProductService): ProductRepositoryAPI =
        ProductRepositoryAPI(service)

    @Provides
    fun providesProductRepository(productRepositoryAPI: ProductRepositoryAPI):
            ProductRepository = productRepositoryAPI
}