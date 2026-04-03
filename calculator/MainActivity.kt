package com.example.TS_CAlapplication
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val display = findViewById<EditText>(R.id.display)
        val btn0 = findViewById<Button>(R.id.btn0)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSub = findViewById<Button>(R.id.btnSub)
        val btnMul = findViewById<Button>(R.id.btnMul)
        val btnDiv = findViewById<Button>(R.id.btnDiv)

        val btnEqual = findViewById<Button>(R.id.btnEqual)
        val btnClear = findViewById<Button>(R.id.btnClear)

        var num1 = 0
        var num2 = 0
        var operator = ""
        var CalRes = 0

        // Number buttons 
        btn0.setOnClickListener { display.setText(display.text.toString() + "0") }
        btn1.setOnClickListener { display.setText(display.text.toString() + "1") }
        btn2.setOnClickListener { display.setText(display.text.toString() + "2") }
        btn3.setOnClickListener { display.setText(display.text.toString() + "3") }
        btn4.setOnClickListener { display.setText(display.text.toString() + "4") }
        btn5.setOnClickListener { display.setText(display.text.toString() + "5") }
        btn6.setOnClickListener { display.setText(display.text.toString() + "6") }
        btn7.setOnClickListener { display.setText(display.text.toString() + "7") }
        btn8.setOnClickListener { display.setText(display.text.toString() + "8") }
        btn9.setOnClickListener { display.setText(display.text.toString() + "9") }

        // Operators 
        btnAdd.setOnClickListener {
            num1 = display.text.toString().toInt()
            operator = "+"
            display.setText(num1.toString() + "+")
        }

        btnSub.setOnClickListener {
            num1 = display.text.toString().toInt()
            operator = "-"
            display.setText(num1.toString() + "-")
        }
        btnMul.setOnClickListener {
            num1 = display.text.toString().toInt()
            operator = "*"
            display.setText(num1.toString() + "*")
        }
        btnDiv.setOnClickListener {
            num1 = display.text.toString().toInt()
            operator = "/"
            display.setText(num1.toString() + "/")
        }
// Equal 
        btnEqual.setOnClickListener {
            val text = display.text.toString()
            num2 = text.substring(text.length - 1).toInt()
            if (operator == "+")
                CalRes = num1 + num2
            else if (operator == "-")
                CalRes = num1 - num2
            else if (operator == "*")
                CalRes = num1 * num2
            else if (operator == "/")
                CalRes = num1 / num2
            display.setText(CalRes.toString())
        }
// Clear 
        btnClear.setOnClickListener {
            display.setText("")
            num1 = 0
            num2 = 0
            operator = ""
            CalRes = 0
        }
    }
}