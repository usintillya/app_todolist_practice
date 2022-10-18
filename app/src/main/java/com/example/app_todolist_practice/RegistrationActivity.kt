package com.example.app_todolist_practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        // Redirecting to LoginScreen activity after Registration
        val actChangeToLoginScreen = findViewById<Button>(R.id.button_countinue)
        actChangeToLoginScreen.setOnClickListener {
            val redirect: Intent = Intent("com.example.app_todolist_practice.LoginActivity")
            startActivity(redirect)
        }
    }
}