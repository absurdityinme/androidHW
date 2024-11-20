package com.example.hw

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.example.hw.databinding.FragmentScreenFirstBinding
import com.example.hw.recyclerView.MultipleHoldersAdapter
import com.example.hw.recyclerView.Repository
import com.example.hw.utils.MyDecoration
import com.example.hw.utils.getValueInDp

class FirstScreenFragment: Fragment(R.layout.fragment_screen_first) {

    private var viewBinding: FragmentScreenFirstBinding? = null
    var adapter: MultipleHoldersAdapter? = null
    private var recyclerType: String = LIST

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding = FragmentScreenFirstBinding.bind(view)
        recyclerType = savedInstanceState?.getString(RECYCLER_TYPE) ?: LIST
        val glide = Glide.with(requireContext())
        initRecyclerView(requestManager = glide)
        setLayout(recyclerType)
        init()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(RECYCLER_TYPE, recyclerType)
    }

    private fun initRecyclerView(requestManager: RequestManager) {
        val dataList =
            Repository.getItemList()
        adapter = MultipleHoldersAdapter(
            requestManager = requestManager,
            actionOnItem = ::onItemClick,
            actionToList = ::onBtnListClick,
            actionToGrid = ::onBtnGridClick,
            items = dataList
        )
        viewBinding?.apply {
            recycler.adapter = adapter

            recycler.addItemDecoration(
                MyDecoration(
                    margin = getValueInDp(value = 4f, requireContext()).toInt()
                )
            )
        }
    }

    private fun init() {
        viewBinding?.apply {
            btnFloating.setOnClickListener() {
                val dialog = BottomSheet()
                dialog.show(childFragmentManager, BottomSheet.TEXT_TAG)
            }
        }
    }

    private fun setLayout(type: String) {
        when(type) {
            LIST -> setListLayout()
            GRID -> setGridLayout()
        }
    }

    private fun onItemClick(itemId: String) {
        val bundle = Bundle().apply {
            putSerializable(ItemScreenFragment.LIST_TAG, adapter?.dataList?.let { ArrayList(it) })
            putString(ItemScreenFragment.ID_TAG, itemId)
        }

        parentFragmentManager.beginTransaction()
            .hide(this)
            .add(MainActivity.mainContainerId, ItemScreenFragment.getInstance(
                bundle = bundle
            ))
            .addToBackStack(null)
            .commit()

    }

    private fun onBtnListClick() {
        setListLayout()
        recyclerType = LIST
    }

    private fun onBtnGridClick() {
        setGridLayout()
        recyclerType = GRID
    }

    private fun setListLayout() {
        viewBinding?.apply {
            recycler.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
        }
    }

    private fun setGridLayout() {
        viewBinding?.apply {
            val gridLayoutManager = GridLayoutManager(requireContext(), 3, RecyclerView.VERTICAL, false)
            gridLayoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
                override fun getSpanSize(position: Int): Int {
                    return when (adapter?.getItemViewType(position)) {
                        R.layout.item_buttons -> 3
                        R.layout.item_basic -> 1
                        else -> 1
                    }
                }
            }
            recycler.layoutManager = gridLayoutManager
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewBinding?.recycler?.adapter = null
        viewBinding = null
        adapter = null
    }

    companion object {
        private const val RECYCLER_TYPE = "RECYCLER_TYPE"
        private const val LIST = "LIST"
        private const val GRID = "GRID"
    }
}