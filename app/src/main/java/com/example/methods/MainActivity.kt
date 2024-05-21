package com.example.methods

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var etOne : EditText
    private lateinit var etTwo :EditText
    private lateinit var btnOne : Button

    private lateinit var resultTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        etOne=findViewById(R.id.etOne)
        etTwo=findViewById(R.id.etTwo)
        btnOne=findViewById(R.id.btnOne)
        resultTV=findViewById(R.id.resultTV)

        btnOne.setOnClickListener {
            clicker(etOne.getText().toString().toInt(),etTwo.getText().toString().toInt())
            resultTV.text = clicker(etOne.getText().toString().toInt(),etTwo.getText().toString().toInt()).toString()
        }





    }
     fun clicker(int:Int, int1:Int): Int {
         val sum = int + int1
         Log.d("sum",sum.toString())
        return sum


    }
}
