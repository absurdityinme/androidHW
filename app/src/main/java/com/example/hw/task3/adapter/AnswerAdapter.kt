package com.example.hw.task3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw.databinding.ItemVpBinding
import com.example.hw.task3.holder.AnswerHolder
import com.example.hw.task3.model.AnswerModel

class AnswerAdapter(
    private val items: List<AnswerModel>,
    private val action: (Int) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var selectedPosition: Int = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return AnswerHolder(
            viewBinding = ItemVpBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            action = { position ->
                if (selectedPosition != position) {
                    val previousPosition = selectedPosition
                    selectedPosition = position
                    notifyItemChanged(previousPosition, false)
                    notifyItemChanged(selectedPosition, true)
                    action.invoke(position)
                }
            }
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val isSelected = (position == selectedPosition)
        (holder as? AnswerHolder)?.bindItemData(items[position], isSelected)
    }

    override fun onBindViewHolder(
        holder: RecyclerView.ViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, position, payloads)
        } else {
            val isSelected = payloads.first() as Boolean
            (holder as? AnswerHolder)?.updateItem(isSelected)
        }
    }

    fun restoreSelection(position: Int) {
        if (position in items.indices) {
            selectedPosition = position
            notifyItemChanged(selectedPosition, true)
        }
    }
}