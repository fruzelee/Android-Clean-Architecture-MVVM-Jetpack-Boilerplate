package com.boilerplate.android.di

import com.boilerplate.android.ApiClient
import com.boilerplate.android.shared.data.repository.ProductRepository
import com.boilerplate.android.ProductRepositoryAPI
import com.boilerplate.android.ProductService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
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