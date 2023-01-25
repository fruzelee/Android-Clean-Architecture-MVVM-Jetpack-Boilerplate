package com.boilerplate.android.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.boilerplate.android.databinding.FragmentProductDetailsBinding
import com.bumptech.glide.Glide

class ProductDetailsFragment : Fragment() {

    private lateinit var binding: FragmentProductDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductDetailsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            viewProductTitle.text = "Fresh Vegetables"
            viewPrice.text = "250 TK"
            viewFullDescription.text =
                "Locally sourced. Few foods are as cool as a cucumber. While most people think of cucumbers as vegetables, they are actually a fruit. Cucumbers are naturally low in calories, carbohydrates, sodium, fat and cholesterol & hydrating properties."
            Glide.with(requireContext())
                .load("https://picsum.photos/200")
                .into(viewProductImage)
        }
    }
}