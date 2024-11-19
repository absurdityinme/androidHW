package com.example.hw.utils

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.hw.recyclerView.BaseHolder

class MyDecoration(
    private val margin: Int

): RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        val holder = parent.getChildViewHolder(view)
        if (holder is BaseHolder) {
            outRect.apply {
                left = margin
                right = margin
                bottom = margin
                top = margin
            }
        }
    }
}