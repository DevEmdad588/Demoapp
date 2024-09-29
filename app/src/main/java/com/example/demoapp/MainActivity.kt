package com.example.demoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val dark= findViewById<Button>(R.id.buttonDark)
        val green= findViewById<Button>(R.id.buttonGreen)
        val mainLayout= findViewById<LinearLayout>(R.id.main)
        val next = findViewById<Button>(R.id.btnNext)

        dark.setOnClickListener {
            mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.black))

            dark.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
            green.setBackgroundColor(ContextCompat.getColor(this, R.color.green))

            Toast.makeText(applicationContext, "Changing to Dark Mode", Toast.LENGTH_SHORT).show()

        }

        green.setOnClickListener {
            mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.green))

            green.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
            dark.setBackgroundColor(ContextCompat.getColor(this, R.color.black))

            Toast.makeText(applicationContext, "Changing to Green Mode", Toast.LENGTH_SHORT).show()


        }
        next.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}