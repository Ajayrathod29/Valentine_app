package com.example.valentineday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val brtB = findViewById<CardView>(R.id.carweb)
        val spaR = findViewById<CardView>(R.id.cardCamera)

        brtB.setOnClickListener {
            intent = Intent(applicationContext,MainActivity3::class.java)
            startActivity(intent)
        }
        spaR.setOnClickListener {
            intent =Intent(applicationContext,MainActivity4::class.java)
            startActivity(intent)
        }
    }
}