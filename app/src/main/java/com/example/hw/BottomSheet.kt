package com.example.hw

import android.os.Bundle
import android.view.View
import com.example.hw.databinding.DialogBottomSheetBinding
import com.example.hw.recyclerView.BasicHolderData
import com.example.hw.recyclerView.MultipleHoldersData
import com.example.hw.recyclerView.Repository
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
                repeat(count) {
                    listLength = adapter?.listLength ?: 0
                    adapter?.addItem((1..<listLength).random(), generate())
                }
            }
            btnRemove.setOnClickListener(){
                count = etBottomSheet.text.toString().toIntOrNull() ?: 0
                listLength = adapter?.listLength ?: 0
                if (count > listLength) {
                    count = listLength - 1
                }
                repeat(count) {
                    listLength = adapter?.listLength ?: 0
                    adapter?.removeItem((1..<listLength).random())
                }
            }
            btnAddOne.setOnClickListener() {
                listLength = adapter?.listLength ?: 0
                position = (1..<listLength).random()
                adapter?.addItem(position, generate())
            }
            btnRemoveOne.setOnClickListener() {
                listLength = adapter?.listLength ?: 0
                position = (1..<listLength).random()
                adapter?.removeItem(position)
            }
        }
    }

    companion object {
        const val TEXT_TAG = "BOTTOM_SHEET_TAG"
    }

    private fun generate(): MultipleHoldersData {
        val listLength = (parentFragment as? FirstScreenFragment)?.adapter?.listLength ?: 0
        return  BasicHolderData(
            id = (listLength + 1).toString(),
            title = Repository.getRandomTitle(),
            description = Repository.getRandomDesc(),
            imageUrl = Repository.getRandomImage()
        )
    }
}