package com.example.hw.recyclerView

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.hw.databinding.ItemBasicBinding

class BaseHolder(
    private val viewBinding: ItemBasicBinding,
    private val requestManager: RequestManager,
    private val action: (String) -> Unit,
    private val adapter: MultipleHoldersAdapter
) : RecyclerView.ViewHolder(viewBinding.root) {

    init {
        viewBinding.root.setOnClickListener {
            action.invoke(adapter.getItemIdFromPosition(adapterPosition))
        }
    }

    private val requestOptions = RequestOptions
        .diskCacheStrategyOf(
            DiskCacheStrategy.ALL
        )

    fun bindItem(itemData: BasicHolderData) {
        viewBinding.tvItem.text = itemData.title
        requestManager.load(itemData.imageUrl)
            .apply(requestOptions)
            .into(viewBinding.ivItem)
    }
}