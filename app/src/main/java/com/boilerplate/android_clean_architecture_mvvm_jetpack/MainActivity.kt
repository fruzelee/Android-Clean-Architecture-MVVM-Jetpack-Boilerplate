package com.boilerplate.android_clean_architecture_mvvm_jetpack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.boilerplate.android_clean_architecture_mvvm_jetpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val adapter = ProductCardListAdapter()

    private lateinit var binding: ActivityMainBinding

    private val viewModel = ProductListViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.viewProductList.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.viewProductList.adapter = adapter
        /*updateUI(ProductListViewState.Content((1..3).map {
            ProductCardViewState(
                "Playstation $it",
                "This is a nice console! Check it out",
                "200US$"
            )
        }))*/
        viewModel.viewState.observe(this) { viewState ->
            updateUI(viewState)
        }
        viewModel.loadProductList()
    }

    private fun updateUI(viewState: ProductListViewState) {
        when (viewState) {
            is ProductListViewState.Content -> {
                binding.errorView.isVisible = false
                binding.loadingView.isVisible = false
                adapter.setData(viewState.productList)
            }
            ProductListViewState.Error -> {
                binding.viewProductList.isVisible = false
                binding.errorView.isVisible = true
                binding.loadingView.isVisible = false
            }
            ProductListViewState.Loading -> {
                binding.viewProductList.isVisible = false
                binding.errorView.isVisible = false
                binding.loadingView.isVisible = true
            }
        }

    }
}