package com.example.simpletransactionapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnNext = findViewById<Button>(R.id.btn_next)
        btnNext.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }
    }
}