package com.example.conversoreurodolar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.conversoreurodolar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //evento de clique
        binding.buttonConverter.setOnClickListener{

            val euros = binding.editEuro.text.toString().toDouble()
            //val dolares = euros * 0.8
            //val dolares = String.format("%.2f", euros * 0.8).toDouble()
            val dolares = String.format("%.2f", euros * 0.8)

            //binding.textDolares.text = dolares.toString()
            binding.textDolares.text = "${dolares} $"
        }

    }
}