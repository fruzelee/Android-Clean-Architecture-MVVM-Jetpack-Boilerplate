package com.boilerplate.android

import com.boilerplate.android.product_list.business.ProductCardViewState

sealed class ProductListViewState {
    object Loading : ProductListViewState()
    data class Content(val productList: List<ProductCardViewState>) : ProductListViewState()
    object Error : ProductListViewState()
}
