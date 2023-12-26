package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val console = Console()
        val cs = ConsoleService()
        cs.console = console
        cs.textView = binding.consoleTextView
        cs.refresh()
        binding.mybutton.setOnClickListener {
            cs.add(binding.inputForm.text.toString())
        }
        binding.clearButton.setOnClickListener {
            cs.clear()
        }
    }
}