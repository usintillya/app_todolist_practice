package com.example.app_todolist_practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Redirecting to MainScreen activity after Login
        val actChangeToMainScreen = findViewById<Button>(R.id.button_nextstep)
        actChangeToMainScreen.setOnClickListener {
            val redirect: Intent = Intent("com.example.app_todolist_practice.MainScreenActivity")
            startActivity(redirect)
        }
    }
}