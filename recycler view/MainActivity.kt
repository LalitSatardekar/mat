package com.example.recyclerview 
 
import android.os.Bundle 
import androidx.appcompat.app.AppCompatActivity 
import androidx.recyclerview.widget.LinearLayoutManager 
import androidx.recyclerview.widget.RecyclerView 
 
class MainActivity : AppCompatActivity() { 
 
    override fun onCreate(savedInstanceState: Bundle?) { 
        super.onCreate(savedInstanceState) 
        setContentView(R.layout.activity_main) 
 
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView) 
 
        val firstNames = listOf( 
            "Krish", "Aarav", "Arjun", "Rohan", "Aditya", 
            "Aarya", "Ananya", "Isha", "Neha", "Pooja" 
        ) 
 
        val lastNames = listOf( 
            "Sharma", "Patel", "Mehta", "Singh", "Verma", 
            "Gupta", "Joshi", "Kulkarni", "Desai", "Iyer" 
        ) 
 
        val nameList = List(100) { 
            "${firstNames.random()} ${lastNames.random()}" 
        } 
 
        recyclerView.layoutManager = LinearLayoutManager(this) 
        recyclerView.adapter = MyAdapter(nameList) 
    } 
} 