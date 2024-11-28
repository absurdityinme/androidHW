package com.example.hw.task3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.hw.R
import com.example.hw.databinding.ActivityMainBinding
import com.example.hw.task3.screens.ViewPagerFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) { init() }
    }

    private fun init() {
        supportFragmentManager.beginTransaction()
            .add(mainContainerId, ViewPagerFragment())
            .commit()
    }

    companion object {
        val mainContainerId: Int = R.id.main_container
    }
}