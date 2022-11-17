package com.example.ramzesapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {
    lateinit var LoginButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        LoginButton = findViewById(R.id.LoginButtonID)

        Log.i("ramzesapp", "activity_login")

        Login()
    }

    fun Login()
    {
        LoginButton.setOnClickListener {
            //Открываем Activity MainActivity
            val intentMainActivity = Intent(this, MainActivity::class.java)
            startActivity(intentMainActivity)
        }
    }
}