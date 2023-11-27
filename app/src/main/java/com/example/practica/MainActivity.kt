package com.example.practica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBotones()
    }

    private fun setupBotones() {

        binding.btn1.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }

        binding.btn2.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity3::class.java)
            startActivity(intent)
        }

    }
}