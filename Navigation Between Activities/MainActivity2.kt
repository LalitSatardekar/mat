package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.playgroundapp.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val edtValue = findViewById<EditText>(R.id.edtValue)
        val btnReturn = findViewById<Button>(R.id.btnReturn)
        val tvOutput = findViewById<TextView>(R.id.tvOutput)

        tvOutput.text = intent.getStringExtra("name")

        btnReturn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("name", edtValue.text.toString())
            startActivity(intent)
        }
    }
}