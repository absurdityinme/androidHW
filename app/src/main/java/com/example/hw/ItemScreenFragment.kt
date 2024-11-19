package com.example.hw

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.hw.databinding.FragmentScreenItemBinding
import com.example.hw.recyclerView.BasicHolderData
import com.example.hw.recyclerView.MultipleHoldersAdapter
import com.example.hw.recyclerView.MultipleHoldersData

class ItemScreenFragment: Fragment(R.layout.fragment_screen_item) {

    private var viewBinding: FragmentScreenItemBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding = FragmentScreenItemBinding.bind(view)
        val glide = Glide.with(requireContext())
        init(requestManager = glide)
    }

    private val requestOptions = RequestOptions
        .diskCacheStrategyOf(
            DiskCacheStrategy.ALL
        )

    private fun init(requestManager: RequestManager) {
        viewBinding?.apply {
            val itemId = arguments?.getString(ID_TAG) ?: "1"
            val items = arguments?.getSerializable(LIST_TAG) as? List<MultipleHoldersData>
            val item = items?.find {
                it.id == itemId
            }
            (item as? BasicHolderData)?.apply {
                tvTitle.text = this.title
                tvDesc.text = this.description
                requestManager.load(item.imageUrl)
                    .apply(requestOptions)
                    .into(ivItem)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewBinding = null
    }

    companion object {
        const val ID_TAG = "ITEM_ID_TAG"
        const val LIST_TAG = "LIST_TAG"

        fun getInstance(bundle: Bundle) =
            ItemScreenFragment().apply {
                arguments = bundle
                }
    }
}