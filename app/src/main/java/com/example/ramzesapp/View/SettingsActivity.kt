package com.example.ramzesapp.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.ramzesapp.MainActivity
import com.example.ramzesapp.R
import com.example.ramzesapp.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {
    //Объявление переменных
    lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        //Инициализация
        binding = DataBindingUtil.setContentView(this, R.layout.activity_settings)

        //Возврат на домашнюю страницу
        backMain()
    }
    fun backMain(){
        binding.BackImageViewID.setOnClickListener{
            val intentBackMainActivity = Intent(this, MainActivity::class.java)
            startActivity(intentBackMainActivity)
        }
    }


}