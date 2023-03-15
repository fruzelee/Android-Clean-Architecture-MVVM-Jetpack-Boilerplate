package com.boilerplate.android.shared.data.repository.api

import com.boilerplate.android.product_details.business.ProductDetails
import com.boilerplate.android.product_list.business.Product
import com.boilerplate.android.shared.data.repository.ProductRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ProductRepositoryAPI @Inject constructor(private val service: ProductService) :
    ProductRepository {

    override suspend fun getProductList(): List<Product> {
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
                Product(
                    it.title,
                    it.description,
//                    "TK ${it.price * 104.59}", //1 US Dollar = 104.59 Taka Dec 19, 2:01AM UTC
                    it.price * 104.59, //1 US Dollar = 104.59 Taka Dec 19, 2:01AM UTC
                    it.imageUrl,
                    it.id
                )
            }
        }
    }

    override suspend fun getProductDetails(productId: String): ProductDetails {
        return withContext(Dispatchers.IO) {
            service.getProductDetails(productId).run {
                ProductDetails(
                    this.title,
                    this.description,
                    this.full_description,
                    "TK ${this.price}",
                    this.imageUrl,
                    this.pros,
                    this.cons
                )
            }
        }
    }
}
