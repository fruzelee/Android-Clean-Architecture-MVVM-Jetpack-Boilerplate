package com.boilerplate.android.product_list.presentation

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.boilerplate.android.R
import com.boilerplate.android.databinding.ProductCardBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.BitmapImageViewTarget

class ProductCardListAdapter(private val context: Context?, val onItemClicked: (ProductCardViewState) -> Unit) :
    RecyclerView.Adapter<ProductCardListAdapter.ViewHolder>() {

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

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(productCardViewState: ProductCardViewState) {

            val bind = ProductCardBinding.bind(itemView)
            itemView.setOnClickListener {
                onItemClicked(productCardViewState)
            }

            //assign dummy data
            /*bind.viewProductName.text = "Product 1"
            bind.viewProductDescription.text = "Description of product"
            bind.productPrice.text = "100 US$"*/

            bind.apply {

                //test
                //Toast.makeText(context, "id: "+ productCardViewState.id, Toast.LENGTH_SHORT).show()

                //assign data via view state
                viewProductName.text = productCardViewState.title
                viewProductDescription.text = productCardViewState.description
                productPrice.text = productCardViewState.price
                viewWishlistIcon.setImageDrawable(
                    if (productCardViewState.isFavorite) {
                        ResourcesCompat.getDrawable(
                            viewWishlistIcon.resources,
                            R.drawable.baseline_favorite_24,
                            null
                        )
                    } else {
                        ResourcesCompat.getDrawable(
                            viewWishlistIcon.resources,
                            R.drawable.baseline_favorite_border_24,
                            null
                        )
                    }
                )

                //showing product image via glide
                Glide.with(productImage)
                    .asBitmap()
                    .load(productCardViewState.imageUrl)
                    .into(BitmapImageViewTarget(productImage))
            }
        }
    }
}
