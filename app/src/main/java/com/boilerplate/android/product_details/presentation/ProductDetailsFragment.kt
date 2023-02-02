package com.boilerplate.android.product_details.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.boilerplate.android.databinding.FragmentProductDetailsBinding
import com.bumptech.glide.Glide

class ProductDetailsFragment : Fragment() {

    private lateinit var binding: FragmentProductDetailsBinding
    private val viewModel: ProductDetailsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductDetailsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /*with(binding) {
            viewProductTitle.text = "Fresh Vegetables"
            viewPrice.text = "250 TK"
            viewFullDescription.text =
                "Locally sourced. Few foods are as cool as a cucumber. While most people think of cucumbers as vegetables, they are actually a fruit. Cucumbers are naturally low in calories, carbohydrates, sodium, fat and cholesterol & hydrating properties."
            Glide.with(requireContext())
                .load("https://picsum.photos/200")
                .into(viewProductImage)
        }*/

        // using observable pattern to update the ui
        viewModel.loadProduct("someProductId")
        viewModel.viewState.observe(viewLifecycleOwner){
            updateUi(it)
        }
    }

    private fun updateUi(viewState: ProductDetailsViewState) {
        when(viewState){
            is ProductDetailsViewState.Content -> {
                with(binding){
                    binding.loadingView.isVisible = false
                    val product = viewState.product
                    viewProductTitle.text = product.title
                    Glide.with(requireContext()).
                    load(product.imageUrl)
                        .into(viewProductImage)
                    binding.viewPrice.text = product.price
                    binding.viewFullDescription.text = product.fullDescription
                }
            }
            ProductDetailsViewState.Error -> {
                binding.loadingView.isVisible = false
            }
            ProductDetailsViewState.Loading -> {
                binding.loadingView.isVisible = true
            }
        }
    }
}