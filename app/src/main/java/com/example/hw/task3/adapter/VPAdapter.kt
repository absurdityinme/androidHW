package com.example.hw.task3.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.hw.task3.model.QAModel
import com.example.hw.task3.screens.QuestionnaireFragment

class VPAdapter(
    manager: FragmentManager,
    lifecycle: Lifecycle,
    val items: List<QAModel>
): FragmentStateAdapter(manager, lifecycle) {

    override fun createFragment(position: Int): Fragment {
        return QuestionnaireFragment.getInstance(items[position].id)
    }

    override fun getItemCount(): Int = items.size
}
