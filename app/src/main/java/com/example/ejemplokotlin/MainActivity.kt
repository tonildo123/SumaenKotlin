package com.example.ejemplokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val entrada1 = findViewById<EditText>(R.id.et1)
        val entrada2 = findViewById<EditText>(R.id.et2)

        val resultado = findViewById<TextView>(R.id.tvRes)
        val bSumar = findViewById<Button>(R.id.bSumar)


        bSumar.setOnClickListener {

            val suma = entrada1.text.toString().toInt() + entrada2.text.toString().toInt()

            resultado.text = "La suma es : ${suma.toString()}"

        }



    }

}