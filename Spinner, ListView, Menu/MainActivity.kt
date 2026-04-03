package com.example.lifecycle

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import com.example.playgroundapp.R

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sp1 = findViewById<Spinner>(R.id.spinner1)
        val sp2 = findViewById<Spinner>(R.id.spinner2)
        val btnClick = findViewById<Button>(R.id.btn_click)
        val tvSpinnerOutput = findViewById<TextView>(R.id.tvSpinnerOutput)
        val lv = findViewById<ListView>(R.id.listView)
        val tvListViewOutput = findViewById<TextView>(R.id.tvListViewOutput)

        val lst = ArrayList<String>()
        lst.add("ABC")
        lst.add("PQR")
        lst.add("XYZ")

        val os = arrayOf<String>("Windows","IOS","Linux","Android")

        val adp1 = ArrayAdapter(this, android.R.layout.simple_spinner_item,lst)
        adp1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        sp1.adapter = adp1

        val adp2 = ArrayAdapter.createFromResource(this,
            R.array.country_name,android.R.layout.simple_spinner_item)
        adp2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        sp2.adapter = adp2

        val adp3 = ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,os)
        lv.adapter = adp3

        btnClick.setOnClickListener {
            val str1 = sp1.selectedItem.toString()
            val str2 = sp2.selectedItem.toString()
            tvSpinnerOutput.text = "Data from Spinner1 = $str1 \nData from Spinner2 = $str2"
        }

        lv.setOnItemClickListener { adapterView, view, i, l ->
            val str3 = adapterView.getItemAtPosition(i) as String
            tvListViewOutput.text = "Data from ListView = $str3"
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mymenu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val tvMenuOutput = findViewById<TextView>(R.id.tvMenuOutput)
        when (item.itemId){
            R.id.bm -> tvMenuOutput.text = "Bookmarks Selected"
            R.id.sr -> tvMenuOutput.text = "Search Selected"
            R.id.sa -> tvMenuOutput.text = "Save Selected"
            R.id.sh -> tvMenuOutput.text = "Share Selected"
            R.id.dlt -> tvMenuOutput.text = "Delete Selected"
        }
        return super.onOptionsItemSelected(item)
    }
}
