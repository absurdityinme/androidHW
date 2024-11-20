package com.example.hw.utils

import androidx.recyclerview.widget.DiffUtil
import com.example.hw.recyclerView.BasicHolderData
import com.example.hw.recyclerView.MultipleHoldersData

class MyDiffUtil(
    private val oldList: List<MultipleHoldersData>,
    private val newList: List<MultipleHoldersData>,
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldList[oldItemPosition]
        val newItem = newList[newItemPosition]
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldList[oldItemPosition]
        val newItem = newList[newItemPosition]

        if (oldItem is BasicHolderData && newItem is BasicHolderData) {
            return oldItem.imageUrl == newItem.imageUrl && oldItem.title == newItem.title
        }
        return oldItem.id == newItem.id
    }
}