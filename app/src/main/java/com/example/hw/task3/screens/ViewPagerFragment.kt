package com.example.hw.task3.screens

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.hw.R
import com.example.hw.databinding.FragmentViewPagerBinding
import com.example.hw.task3.adapter.VPAdapter
import com.example.hw.task3.utils.QARepository
import com.google.android.material.snackbar.Snackbar

class ViewPagerFragment: Fragment(R.layout.fragment_view_pager) {
    private val viewBinding: FragmentViewPagerBinding by viewBinding(FragmentViewPagerBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        val adapter = VPAdapter(
            manager = parentFragmentManager,
            lifecycle = this.lifecycle,
            items = QARepository.getQAs()
        )

        viewBinding.apply {
            vp.adapter = adapter

            vp.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    when (position) {
                        (adapter.itemCount - 1) -> {
                            btnNext.text = "Done"
                            btnNext.setBackgroundColor(Color.parseColor("#BE8DC6"))
                        }
                        else -> {
                            btnNext.text = "Next"
                            btnNext.setBackgroundColor(Color.parseColor("#CFB0D4"))
                        }
                    }

                    btnPrev.isEnabled = when(position) {
                        0 -> false
                        else -> true
                    }
                }
            })

            btnPrev.setOnClickListener {
                if (vp.currentItem > 0) {
                    vp.currentItem -= 1
                }
            }

            btnNext.setOnClickListener {
                if (vp.currentItem < adapter.itemCount - 1) {
                    vp.currentItem += 1
                } else {
                    Snackbar.make(viewBinding.root, "Answers are accepted", Snackbar.LENGTH_SHORT).show()
                }
            }
        }
    }
}