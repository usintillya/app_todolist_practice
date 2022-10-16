package com.example.app_todolist_practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actChange = findViewById<Button>(R.id.button_signin)
        actChange.setOnClickListener {
            val redirect: Intent = Intent("com.example.app_todolist_practice.LoginActivity")
            startActivity(redirect)
        }
    }
}