package com.example.ramzesapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Log.i("ramzesapp", "activity_login - запустилось")

        val btnSettings: Button = findViewById(R.id.btnSettings)
        btnSettings.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Log.i("ramzesapp", "activity_login - кнопка SignInbtn нажата")
        }
    }
}