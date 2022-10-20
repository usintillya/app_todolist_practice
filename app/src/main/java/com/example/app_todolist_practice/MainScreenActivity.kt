package com.example.app_todolist_practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog

class MainScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val addTodoButton = findViewById<ImageButton>(R.id.button_add)
        addTodoButton.setOnClickListener {
            //Inflate the dialog with custom view
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.custom_popup_todo_add, null)
            //Dialog Builder
            val mBuilder = AlertDialog.Builder(this)
                .setView(mDialogView)
            //Show dialog
            val mAlertDialog = mBuilder.show()
        }
    }
}