package com.boilerplate.android

import com.boilerplate.android.product_list.business.ProductCardViewState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ProductRepositoryAPI @Inject constructor(private val service: ProductService) :
    ProductRepository {

    override suspend fun getProductList(): List<ProductCardViewState> {
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
            service.getProductList().map {
                ProductCardViewState(
                    it.title,
                    it.description,
                    "TK ${it.price * 104.59}", //1 US Dollar = 104.59 Taka Dec 19, 2:01AM UTC
                    it.imageUrl
                )
            }
        }
    }
}