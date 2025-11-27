package com.example.androidcaapp

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var btn : Button = findViewById(R.id.btn)
        var sub1: EditText = findViewById(R.id.Sub1)
        var sub2: EditText = findViewById(R.id.Sub2)
        var sub3: EditText = findViewById(R.id.Sub3)
        var txtV: TextView = findViewById(R.id.txtV)

        btn.setOnClickListener {
            val s1 = sub1.text.toString().toInt()
            val s2 = sub2.text.toString().toInt()
            val s3 = sub3.text.toString().toInt()
            val y = (s1 + s2 + s3)/3

            txtV.text = "Result: ${y/10.0}"
        }

    }
}