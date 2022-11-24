package com.example.ramzesapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.ramzesapp.View.SettingsActivity
import com.example.ramzesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Объявление переменных
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //Показываем параметры сессии
        showParamSession()

        //Переходим на Activity SettingActivity
        openSettingsActivity()
    }

    fun showParamSession(){
        binding.ShowParamSessionButtonID.setOnClickListener{
            Toast.makeText(this, "Нажата кнопка отображения параметров сессии", Toast.LENGTH_SHORT).show()
        }
    }

    fun openSettingsActivity(){
        binding.SettingsButtonID.setOnClickListener{
            val intentOpenSettingsActivity = Intent(this, SettingsActivity::class.java)
            startActivity(intentOpenSettingsActivity)
        }
    }
}