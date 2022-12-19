package com.example.qualificationvk.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.qualificationvk.databinding.ActivitySplashBinding
import kotlinx.coroutines.delay

class SplashActivity: AppCompatActivity() {

    lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        lifecycleScope.launchWhenCreated {
//            delay(3000)
//
//            val intent = Intent(this@SplashActivity, MainActivity::class.java)
//            startActivity(intent)
//        }
    }

}