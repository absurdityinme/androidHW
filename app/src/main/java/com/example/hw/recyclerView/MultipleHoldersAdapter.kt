package com.example.hw.recyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.hw.R
import com.example.hw.databinding.ItemBasicBinding
import com.example.hw.databinding.ItemButtonsBinding
import com.example.hw.utils.MyDiffUtil

class MultipleHoldersAdapter(
    private val requestManager: RequestManager,
    private val actionOnItem: (String) -> Unit,
    private val actionToList: () -> Unit,
    private val actionToGrid: () -> Unit,
    items: List<MultipleHoldersData>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val dataList = mutableListOf<MultipleHoldersData>()
    var listLength: Int = 0

    init {
        dataList.addAll(items)
        listLength = dataList.size
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            R.layout.item_buttons -> {
                ButtonsHolder(
                    viewBinding = ItemButtonsBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    ),
                    actionToList = actionToList,
                    actionToGrid = actionToGrid
                )
            }

            R.layout.item_basic -> {
                BaseHolder(
                    viewBinding = ItemBasicBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    ),
                    requestManager = requestManager,
                    action = actionOnItem,
                    adapter = this
                )
            }

            else -> throw IllegalStateException("Unknown holder")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (dataList[position]) {
            is ButtonHolderData -> {
                (holder as? ButtonsHolder)?.bindItem(itemData = dataList[position] as ButtonHolderData)
            }

            is BasicHolderData -> {
                (holder as? BaseHolder)?.bindItem(itemData = dataList[position] as BasicHolderData)
            }

            else -> Unit
        }
    }

    override fun getItemCount(): Int = dataList.size

    override fun getItemViewType(position: Int): Int {
        val item = dataList[position]
        return when (item) {
            is ButtonHolderData -> {
                R.layout.item_buttons
            }

            is BasicHolderData -> {
                R.layout.item_basic
            }

            else -> throw IllegalStateException("Incorrect holder type")
        }
    }

    fun addItem(position: Int) {
        dataList.add(position, generate())
        listLength++
        notifyItemInserted(position)
    }

    fun addItems(count: Int) {
        val newList = dataList.toMutableList()
        repeat(count) {
            if (listLength > 1) {
                newList.add((1..<listLength).random(), generate())
            }
            else {
                newList.add(1, generate())
            }
            listLength++
        }
        updateData(newList)
    }

    fun removeItems(count: Int) {
        val newList = dataList.toMutableList()
        repeat(count) {
            newList.removeAt((1..<listLength).random())
            listLength--
        }
        updateData(newList)
    }

    fun removeItem(position: Int) {
        dataList.removeAt(position)
        listLength--
        notifyItemRemoved(position)
    }

    fun getItemIdFromPosition(position: Int): String {
        return dataList[position].id
    }

    fun updateData(newList: List<MultipleHoldersData>) {
        val diffCallback = MyDiffUtil(
            oldList = dataList,
            newList = newList
        )
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        diffResult.dispatchUpdatesTo(this)
        dataList.clear()
        dataList.addAll(newList)
    }

    private fun generate(): MultipleHoldersData {
        return  BasicHolderData(
            id = (listLength + 1).toString(),
            title = Repository.getRandomTitle(),
            description = Repository.getRandomDesc(),
            imageUrl = Repository.getRandomImage()
        )
    }
}