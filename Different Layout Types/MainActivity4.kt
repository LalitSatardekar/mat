package com.example.playgroundapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val btnLV = findViewById<Button>(R.id.btnLV)
        val btnLH = findViewById<Button>(R.id.btnLH)
        val btnRL = findViewById<Button>(R.id.btnRL)


        btnRL.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        btnLH.setOnClickListener {
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
        }

        btnLV.setOnClickListener {
            val intent = Intent(this , MainActivity2::class.java)
            startActivity(intent)
        }
    }
}