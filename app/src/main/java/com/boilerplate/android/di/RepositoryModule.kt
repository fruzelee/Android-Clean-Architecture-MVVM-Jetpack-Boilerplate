package com.boilerplate.android.di

import com.boilerplate.android.shared.data.repository.api.ApiClient
import com.boilerplate.android.shared.data.repository.ProductRepository
import com.boilerplate.android.shared.data.repository.api.ProductRepositoryAPI
import com.boilerplate.android.shared.data.repository.api.ProductService
import com.boilerplate.android.wishlist.data.repository.WishlistDatabaseRepository
import com.boilerplate.android.wishlist.data.repository.WishlistRepository
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

    @Provides
    fun providesWishlistRepository(
        databaseRepository: WishlistDatabaseRepository
    ): WishlistRepository = databaseRepository
}