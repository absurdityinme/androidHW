package com.example.hw.recyclerView

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.hw.databinding.ItemButtonsBinding

class ButtonsHolder(
    private val viewBinding: ItemButtonsBinding,
    private val actionToList: () -> Unit,
    private val actionToGrid: () -> Unit
) : RecyclerView.ViewHolder(viewBinding.root) {

    init {
        viewBinding.btnList.setOnClickListener {
            actionToList.invoke()
        }
        viewBinding.btnGrid.setOnClickListener {
            actionToGrid.invoke()
        }
    }

    private val requestOptions = RequestOptions
        .diskCacheStrategyOf(
            DiskCacheStrategy.ALL
        )

    fun bindItem(itemData: ButtonHolderData) {
        viewBinding.apply {
            btnList.text = itemData.btn1
            btnGrid.text = itemData.btn2
        }
    }
}