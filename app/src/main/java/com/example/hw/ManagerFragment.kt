package com.example.hw

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

interface ManagerFragment {

    fun navigateReplace(
        fragmentManager: FragmentManager,
        containerId: Int = MainActivity.mainContainerId,
        fragment: Fragment,
        tag: String? = null,
        addToBackStack: Boolean = true
    ) {
        fragmentManager.beginTransaction()
            .replace(containerId, fragment).let {
            if (addToBackStack) it.addToBackStack(tag).commit()
                else it.commit()

        }
    }

}