package com.example.hw

import android.os.Bundle
import android.view.View
import com.example.hw.databinding.DialogBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheet: BottomSheetDialogFragment(R.layout.dialog_bottom_sheet) {
    private var binding: DialogBottomSheetBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DialogBottomSheetBinding.bind(view)
        init()
    }

    private fun init() {
        binding?.apply {
            var listLength = 0
            val adapter = (parentFragment as? FirstScreenFragment)?.adapter

            var count: Int
            var position: Int

            btnAdd.setOnClickListener() {
                count = etBottomSheet.text.toString().toIntOrNull() ?: 0
                adapter?.addItems(count)
            }
            btnRemove.setOnClickListener(){
                count = etBottomSheet.text.toString().toIntOrNull() ?: 0
                listLength = adapter?.listLength ?: 0
                if (count > listLength) {
                    count = listLength - 1
                }
                adapter?.removeItems(count)
            }
            btnAddOne.setOnClickListener() {
                listLength = adapter?.listLength ?: 0
                if (listLength > 1) {
                    position = (1..<listLength).random()
                    adapter?.addItem(position)
                }
                else {
                    position = 1
                    adapter?.addItem(position)
                }
            }
            btnRemoveOne.setOnClickListener() {
                listLength = adapter?.listLength ?: 0
                if (listLength > 1) {
                    position = (1..<listLength).random()
                    adapter?.removeItem(position)
                }
            }
        }
    }

    companion object {
        const val TEXT_TAG = "BOTTOM_SHEET_TAG"
    }
}