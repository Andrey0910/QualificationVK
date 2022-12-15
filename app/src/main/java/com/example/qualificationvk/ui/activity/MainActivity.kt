package com.example.qualificationvk.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.qualificationvk.R
import com.example.qualificationvk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
}