package com.example.hw

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.hw.databinding.FragmentScreenSecondBinding

class SecondScreenFragment: Fragment(R.layout.fragment_screen_second), ManagerFragment {
    private var binding: FragmentScreenSecondBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentScreenSecondBinding.bind(view)
        init()
    }

    private fun init() {
        binding?.apply {
            val argString = arguments?.getString(TEXT_TAG)
            tvSecondScreen.text =
                if (argString.isNullOrBlank()) {
                    Const.DEFAULT_TEXT
                }
                else {
                    argString
                }

            btnToThirdFromSecond.setOnClickListener() {
                navigateReplace(
                    fragmentManager = parentFragmentManager,
                    fragment = ThirdScreenFragment.getInstance(
                        tvSecondScreen.text?.toString())
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        const val TEXT_TAG = "SECOND_TEXT_TAG"

        fun getInstance(text: String?) =
            SecondScreenFragment().apply {
                arguments = Bundle().apply {
                    putString(TEXT_TAG, text)
                }
            }
    }
}