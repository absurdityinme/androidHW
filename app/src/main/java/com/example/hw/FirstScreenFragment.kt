package com.example.hw

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.hw.databinding.FragmentScreenFirstBinding

class FirstScreenFragment: Fragment(R.layout.fragment_screen_first), ManagerFragment {
    private var binding: FragmentScreenFirstBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentScreenFirstBinding.bind(view)
        init()
    }

    private fun init() {
        binding?.apply {
            btnToSecondFromFirst.setOnClickListener() {
                navigateReplace(
                    fragment = SecondScreenFragment.getInstance(
                        etInput.text?.toString()
                    ),
                    fragmentManager = parentFragmentManager
                )
            }

            btnToThirdFromFirst.setOnClickListener() {
                navigateReplace(
                    fragmentManager = parentFragmentManager,
                    fragment = SecondScreenFragment.getInstance(
                        etInput.text?.toString()
                    )
                )
                navigateReplace(
                    fragment = ThirdScreenFragment.getInstance(
                        etInput.text?.toString()
                    ),
                    fragmentManager = parentFragmentManager
                )
            }

            btnToBottomSheet.setOnClickListener() {
                val dialog = BottomSheet()
                dialog.show(childFragmentManager, BottomSheet.TEXT_TAG)
            }
        }
    }

    fun updateEt(updateText: String) {
        binding?.apply {
            etInput.setText(updateText)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}