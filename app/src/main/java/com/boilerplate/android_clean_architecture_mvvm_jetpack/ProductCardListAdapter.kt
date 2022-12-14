package com.boilerplate.android_clean_architecture_mvvm_jetpack

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.boilerplate.android_clean_architecture_mvvm_jetpack.databinding.ProductCardBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.BitmapImageViewTarget

class ProductCardListAdapter : RecyclerView.Adapter<ProductCardListAdapter.ViewHolder>() {

    private var data: List<ProductCardViewState> = emptyList()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.product_card, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        /*holder.bind(
            ProductCardViewState(
                "Playstation",
                "This is a nice console! Check it out",
                "200US$"
            )
        )*/
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
//        return 3
        return data.size
    }

    fun setData(productList: List<ProductCardViewState>) {
        this.data = productList
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(productCardViewState: ProductCardViewState) {

            val bind = ProductCardBinding.bind(itemView)

            //assign dummy data
            /*bind.viewProductName.text = "Product 1"
            bind.viewProductDescription.text = "Description of product"
            bind.productPrice.text = "100 US$"*/

            //assign data via view state
            bind.viewProductName.text = productCardViewState.title
            bind.viewProductDescription.text = productCardViewState.description
            bind.productPrice.text = productCardViewState.price

            //showing product image via glide
            Glide.with(bind.productImage)
                .asBitmap()
                .load(productCardViewState.imageUrl)
                .into(BitmapImageViewTarget(bind.productImage))
        }
    }

}