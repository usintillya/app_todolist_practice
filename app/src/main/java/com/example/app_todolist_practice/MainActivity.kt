package com.example.app_todolist_practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Redirecting to Login Activity
        val actChangeLogin = findViewById<Button>(R.id.button_signin)
        actChangeLogin.setOnClickListener {
            val redirect: Intent = Intent("com.example.app_todolist_practice.LoginActivity")
            startActivity(redirect)
        }

        // Redirecting to Registration Activity
        val actChangeRegistration = findViewById<Button>(R.id.button_signup)
        actChangeRegistration.setOnClickListener {
            val redirect: Intent = Intent("com.example.app_todolist_practice.RegistrationActivity")
            startActivity(redirect)
        }
    }
}