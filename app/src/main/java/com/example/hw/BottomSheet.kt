package com.example.hw

import android.os.Bundle
import android.view.View
import androidx.core.widget.doOnTextChanged
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
            btnBottomSheet.isEnabled = false
            etInputBottomSheet.doOnTextChanged { text, _, _, _ ->
                btnBottomSheet.isEnabled = !text.isNullOrBlank()
            }
            btnBottomSheet.setOnClickListener() {
                (parentFragment as? FirstScreenFragment)?.updateEt(etInputBottomSheet.text.toString())
            }
        }
    }

    companion object {
        const val TEXT_TAG = "BOTTOM_SHEET_TAG"
    }
}