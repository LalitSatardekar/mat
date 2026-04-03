package com.example.playgroundapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val edtName = findViewById<EditText>(R.id.edtName)
        val readiobtngrp = findViewById<RadioGroup>(R.id.radiobtngrp)
        val genderMale = findViewById<RadioButton>(R.id.genderMale)
        val genderFemale = findViewById<RadioButton>(R.id.genderFemale)
        val genderOther = findViewById<RadioButton>(R.id.genderOther)
        val hobbyCoding = findViewById<CheckBox>(R.id.hobbyCoding)
        val hobbySinging = findViewById<CheckBox>(R.id.hobbySinging)
        val hobbyDrawing = findViewById<CheckBox>(R.id.hobbyDrawing)
        val btnOk = findViewById<Button>(R.id.btnOk)
        val tvName = findViewById<TextView>(R.id.tvName)
        val tvGender = findViewById<TextView>(R.id.tvGender)
        val tvHobby = findViewById<TextView>(R.id.tvHobby)
        val imgbtn = findViewById<ImageButton>(R.id.imgbtn)
        val togglebtn = findViewById<ToggleButton>(R.id.togglebtn)
        var s = ""

        btnOk.setOnClickListener {
            tvName.text = edtName.text
            if(genderMale.isChecked) tvGender.text = genderMale.text
            else if(genderFemale.isChecked) tvGender.text = genderFemale.text
            else tvGender.text = genderOther.text

            if (hobbyDrawing.isChecked) s = hobbyDrawing.text as String
            if (hobbySinging.isChecked) s = s + " , " + hobbySinging.text as String
            if (hobbyCoding.isChecked) s =  s + " , " + hobbyCoding.text as String
            tvHobby.text = s


        }
        imgbtn.setOnClickListener {
            tvName.setText("")
            tvGender.setText("")
            tvHobby.setText("")
            genderMale.isChecked = false
            genderFemale.isChecked = false
            genderOther.isChecked = false
            hobbySinging.isChecked = false
            hobbyCoding.isChecked = false
            hobbyDrawing.isChecked = false

        }

       togglebtn.setOnCheckedChangeListener { _, isChecked ->

           if(isChecked){
               Toast.makeText(this , "Toggle Button is ON" , Toast.LENGTH_LONG).show()
           }
           else
               {
                   Toast.makeText(this , "Toggle Button is OFF" , Toast.LENGTH_LONG).show()
               }

       }

    }





}