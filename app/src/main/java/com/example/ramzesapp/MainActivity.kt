package com.example.ramzesapp

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //Объявление переменных
    lateinit var showParamSessionImageView:ImageView
    lateinit var openSettingsImageView:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Инициализация
        showParamSessionImageView = findViewById(R.id.ShowParamSessionButtonID)
        openSettingsImageView = findViewById(R.id.SettingsButtonID)

        //Показываем параметры сессии
        showParamSession()

        //Переходим на Activity SettingActivity
        openSettingsActivity()
    }

    fun showParamSession(){
        showParamSessionImageView.setOnClickListener{
            Toast.makeText(this, "Нажата кнопка отображения параметров сессии", Toast.LENGTH_SHORT).show()
        }
    }

    fun openSettingsActivity(){
        openSettingsImageView.setOnClickListener{
            val intentOpenSettingsActivity = Intent(this, SettingsActivity::class.java)
            startActivity(intentOpenSettingsActivity)
        }
    }
}