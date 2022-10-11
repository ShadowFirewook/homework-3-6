package com.example.homework_3_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_3_6.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val args = intent.extras
        val song = args?.get("key")
        binding.song.text = song.toString()
    }
}