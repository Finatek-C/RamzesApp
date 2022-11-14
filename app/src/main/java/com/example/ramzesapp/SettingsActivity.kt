package com.example.ramzesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SettingsActivity : AppCompatActivity() {
    //Объявление переменных
    lateinit var backImageView:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        //Инициализация
        backImageView = findViewById(R.id.BackImageViewID)

        //Возврат на домашнюю страницу
        backMain()
    }
    fun backMain(){
        backImageView.setOnClickListener{
            val intentBackMainActivity = Intent(this, MainActivity::class.java)
            startActivity(intentBackMainActivity)
        }
    }
}