package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        binding.buttonResult.setOnClickListener {
            calculate()
        }

    }

    private fun calculate() {
        val number1str = binding.editTextNum1.text.toString().trim()
        val number2str = binding.editTextNum2.text.toString().trim()
        if (number1str.isEmpty()) {
            binding.editTextNum1.error = "No number"
            return
        }
        if (number2str.isEmpty()) {
            binding.editTextNum2.error = "No number"
            return
        }
        val number1 = number1str.toDouble()
        val number2 = number2str.toDouble()
        val result = number1 + number2
        val resultstr = result.toString()
        binding.textViewResult.text = resultstr
    }
}