package com.example.hw

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.hw.SecondScreenFragment.Companion
import com.example.hw.databinding.FragmentScreenThirdBinding

class ThirdScreenFragment: Fragment(R.layout.fragment_screen_third) {
    private var binding: FragmentScreenThirdBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentScreenThirdBinding.bind(view)
        init()
    }

    private fun init() {
        binding?.apply {
            val argString = arguments?.getString(TEXT_TAG)
            tvThirdScreen.text =
                if (argString.isNullOrBlank()) {
                    Const.DEFAULT_TEXT
                }
                else {
                    argString
                }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        const val TEXT_TAG = "THIRD_TEXT_TAG"

        fun getInstance(text: String?) =
            ThirdScreenFragment().apply {
                arguments = Bundle().apply {
                    putString(TEXT_TAG, text)
                }
            }
    }
}