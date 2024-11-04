package com.example.hw

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView
import com.example.hw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        if (savedInstanceState == null) { init() }
    }

    private fun init() {
        supportFragmentManager.beginTransaction()
            .add(mainContainerId, FirstScreenFragment())
            .commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    companion object {
        val mainContainerId: Int = R.id.main_container
    }
}