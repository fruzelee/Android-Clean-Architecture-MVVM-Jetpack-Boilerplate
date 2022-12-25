package com.boilerplate.android_clean_architecture_mvvm_jetpack

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductListViewModel @Inject constructor(private val repository: ProductRepository) :
    ViewModel() {

    private val _viewState = MutableLiveData<ProductListViewState>()
    val viewState: LiveData<ProductListViewState> get() = _viewState

    fun loadProductList() {
        viewModelScope.launch {
            _viewState.postValue(ProductListViewState.Loading)
            // Data call to fetch products
            val productList = repository.getProductList()
            _viewState.postValue(ProductListViewState.Content(productList))

            /*_viewState.postValue(ProductListViewState.Content((1..3).map {
                ProductCardViewState(
                    "Playstation $it",
                    "This is a nice console! Check it out",
                    "200US$"
                )
            }))*/
        }
    }
}