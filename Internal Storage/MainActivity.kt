package com.example.myapplication
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.io.InputStreamReader
import java.io.OutputStreamWriter
class MainActivity : AppCompatActivity() {
    lateinit var edtMessage: EditText
    lateinit var tvOutput: TextView
    lateinit var btnWrite: Button
    lateinit var btnRead: Button
    private val READ_BLOCK_SIZE = 100
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtMessage = findViewById(R.id.edtMessage)
        tvOutput= findViewById(R.id.tvOutput)
        btnWrite = findViewById(R.id.btnWrite)
        btnRead = findViewById(R.id.btnRead)
        btnWrite.setOnClickListener {
            try {
                val fileout = openFileOutput("file.txt", MODE_APPEND)
                val outputWriter = OutputStreamWriter(fileout)
                outputWriter.write(edtMessage.text.toString())
                outputWriter.write(System.getProperty("line.separator"));
                outputWriter.close()
                Toast.makeText(this, "File saved successfully!!!",
                    Toast.LENGTH_SHORT).show()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        btnRead.setOnClickListener {
            try {
                val fileIn = openFileInput("file.txt")
                val inputRead = InputStreamReader(fileIn)
                val inputBuffer = CharArray(READ_BLOCK_SIZE)
                var s: String = ""
                var charRead: Int
                while (inputRead.read(inputBuffer).also { charRead = it } > 0) {
                    val readstring = String(inputBuffer,0,charRead)
                }
                s += readstring
                if (s.isNullOrBlank())
                {
                    Toast.makeText(this, "First enter some data in the file!!!",
                        Toast.LENGTH_SHORT).show()
                }
                else
                {
                }
                tvOutput.setText(s)
                inputRead.close()
                edtMessage.setText("")
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
} 