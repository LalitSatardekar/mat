package com.example.fragments
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// Set default fragment (Home) 
        if (savedInstanceState == null) {
            loadFragment(HomeFragment())
        }
// Get button references 
        val btnHome = findViewById<Button>(R.id.btnHome)
        val btnProfile = findViewById<Button>(R.id.btnProfile)
        val btnAbout = findViewById<Button>(R.id.btnAbout)
// Set click listeners 
        btnHome.setOnClickListener {
            loadFragment(HomeFragment())
        }
        btnProfile.setOnClickListener {
            loadFragment(ProfileFragment())
        }
        btnAbout.setOnClickListener {
            loadFragment(AboutFragment1())
        }
    }
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}