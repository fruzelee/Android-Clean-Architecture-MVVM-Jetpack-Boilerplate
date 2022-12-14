package com.boilerplate.android_clean_architecture_mvvm_jetpack

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProductRepository {

    private val client = ApiClient().getClient()

    suspend fun getProductList(): List<ProductCardViewState> {
        return withContext(Dispatchers.IO) {
            /*delay(2000)
            (1..3).map {
                ProductCardViewState(
                    "Playstation $it",
                    "This is a nice console! Check it out",
                    "200US$"
                )
            }*/

            //get a reference to our client instead of returning mock data
            client.getProductList()
        }
    }
}