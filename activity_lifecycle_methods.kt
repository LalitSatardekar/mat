package com.example.playgroundapp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle" , "OnStart() Invoked")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle" , "onPause() Invoked")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle" , "onRestart() Invoked")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle" , "onResume() Invoked")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle" , "onStop() Invoked")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle" , "onDestroy() Invoked")
    }



}