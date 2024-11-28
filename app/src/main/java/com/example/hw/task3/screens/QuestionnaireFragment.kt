package com.example.hw.task3.screens

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SimpleItemAnimator
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.hw.R
import com.example.hw.databinding.FragmentQuestionnaireBinding
import com.example.hw.task3.adapter.AnswerAdapter
import com.example.hw.task3.model.AnswerModel
import com.example.hw.task3.utils.QARepository

class QuestionnaireFragment : Fragment(R.layout.fragment_questionnaire) {

    private val viewBinding: FragmentQuestionnaireBinding by viewBinding(FragmentQuestionnaireBinding::bind)
    private var adapter: AnswerAdapter? = null
    private var selectedPosition = -1

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        selectedPosition = savedInstanceState?.getInt(SELECTED_POSITION_KEY) ?: -1
        init()
    }
    private fun init() {
        arguments?.getString(ITEM_ID_KEY)?.let { id ->
            QARepository.getQAs().find { it.id == id }?.let { model ->
                viewBinding.apply {
                    tvQuestion.text = model.question
                    tvNumberOfQuestion.text = "${QARepository.getQAs().indexOf(model) + 1}/${QARepository.getQAs().size}"
                }
                initRV(model.answers)
            }
        }
    }

    private fun initRV(answers: List<AnswerModel>) {
        adapter = AnswerAdapter(answers) { position ->
            selectedPosition = position
        }
        viewBinding.rvQuestions.apply {
            itemAnimator = null
            adapter = this@QuestionnaireFragment.adapter
            layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
            (itemAnimator as? SimpleItemAnimator)?.supportsChangeAnimations = false
        }
        adapter?.restoreSelection(selectedPosition)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(SELECTED_POSITION_KEY, selectedPosition)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        adapter = null
    }

    companion object {
        private const val ITEM_ID_KEY = "ITEM_ID_KEY"
        private const val SELECTED_POSITION_KEY = "SELECTED_POSITION_KEY"

        fun getInstance(itemId: String) = QuestionnaireFragment().apply {
            arguments = bundleOf(ITEM_ID_KEY to itemId)
        }
    }
}