package com.example.hw.task3.holder

import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import com.example.hw.R
import com.example.hw.databinding.ItemVpBinding
import com.example.hw.task3.model.AnswerModel

class AnswerHolder(
    private val viewBinding: ItemVpBinding,
    private val action: (Int) -> Unit
) : RecyclerView.ViewHolder(viewBinding.root) {

    init {
        viewBinding.root.setOnClickListener {
            action.invoke(adapterPosition)
        }
    }

    fun bindItemData(data: AnswerModel, isSelected: Boolean) {
        viewBinding.tvItem.text = data.answer
        updateItem(isSelected)
    }

    fun updateItem(isSelected: Boolean) {
        val backgroundColor: Int
        val imageRes: Int
        when(isSelected) {
            true -> {
                backgroundColor = Color.parseColor("#E6E0E6")
                imageRes = R.drawable.baseline_radio_button_checked_30
            }
            false -> {
                backgroundColor = Color.WHITE
                imageRes = R.drawable.baseline_radio_button_unchecked_30
            }
        }
        viewBinding.root.setCardBackgroundColor(backgroundColor)
        viewBinding.ivCheck.setImageResource(imageRes)
    }
}