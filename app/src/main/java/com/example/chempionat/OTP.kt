package com.example.chempionat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OTP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        val nextBtn : Button = (findViewById(R.id.NextBtn)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID


        nextBtn.setOnClickListener {
            val intent = Intent(this,NewPass::class.java)// тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
            startActivity(intent) // метод запуска перехода
        }
    }
}