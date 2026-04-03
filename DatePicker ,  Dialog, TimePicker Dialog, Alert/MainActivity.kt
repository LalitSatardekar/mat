package com.example.myapplication

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.icu.text.DateFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.DateFormat.is24HourFormat
import android.widget.*
import com.example.playgroundapp.R
import java.util.Calendar

class MainActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener,
    TimePickerDialog.OnTimeSetListener {

    lateinit var btnPickDate: Button
    lateinit var tvDate: TextView
    lateinit var btnPickTime: Button
    lateinit var tvTime: TextView
    lateinit var btnClickMe: Button
    lateinit var tvAlertDialog: TextView
    var day: Int = 0
    var month: Int = 0
    var year: Int = 0
    var hour: Int = 0
    var minute: Int = 0
    var myDay: Int = 0
    var myMonth: Int = 0
    var myYear: Int = 0
    var myHour: Int = 0
    var myMinute: Int = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPickDate = findViewById(R.id.btnPickDate)
        tvDate = findViewById(R.id.tvDate)
        btnPickTime = findViewById(R.id.btnPickTime)
        tvTime = findViewById(R.id.tvTime)
        btnClickMe = findViewById(R.id.btnClickMe)
        tvAlertDialog = findViewById(R.id.tvAlertDialog)

        btnPickDate.setOnClickListener {
            val calender = Calendar.getInstance()
            day = calender.get(Calendar.DAY_OF_MONTH)
            month = calender.get(Calendar.MONTH)
            year = calender.get(Calendar.YEAR)
            val datePickerDialog = DatePickerDialog(this@MainActivity, this@MainActivity,
                year, month, day)
            datePickerDialog.show()
        }

        btnPickTime.setOnClickListener {
            val calender = Calendar.getInstance()
            hour = calender.get(Calendar.HOUR)
            minute = calender.get(Calendar.MINUTE)
            val timePickerDialog = TimePickerDialog(this@MainActivity, this@MainActivity,
                hour, minute, true)
            timePickerDialog.show()
        }

        btnClickMe.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Dialog Box")
            builder.setMessage("Deleting File may harm your system")
            builder.setIcon(android.R.drawable.ic_dialog_alert)

            builder.setPositiveButton("Yes"){dialogInterface, which ->
                tvAlertDialog.text = "Clicked Yes"
            }

            builder.setNegativeButton("No"){dialogInterface, which ->
                tvAlertDialog.text = "Clicked No"
            }

            builder.setNeutralButton("Cancel"){dialogInterface , which ->
                tvAlertDialog.text = "Clicked Cancel\nOperation Cancelled"
            }

            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }

    override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {
        myYear = p1
        myMonth = p2+1
        myDay = p3
        tvDate.text = "Year: " + myYear + "\n" + "Month: " + myMonth + "\n" + "Day: "
        + myDay
    }

    override fun onTimeSet(p0: TimePicker?, p1: Int, p2: Int) {
        myHour = p1
        myMinute = p2
        tvTime.text = "Hour: " + myHour + "\n" + "Minute: " + myMinute
    }
}
