package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.playgroundapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtValue = findViewById<EditText>(R.id.edtValue)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val tvOutput = findViewById<TextView>(R.id.tvOutput)

        btnSubmit.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("name", edtValue.text.toString())
            startActivity(intent)
        }

        tvOutput.text = intent.getStringExtra("name")
    }
}