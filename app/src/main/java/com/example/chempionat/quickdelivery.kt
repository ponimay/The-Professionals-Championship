package com.example.chempionat

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class quickdelivery : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quickdelivery)

        val NextBtn : Button = (findViewById(R.id.NextBtn)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val SkipBtn : Button = (findViewById(R.id.SkipBtn)) // аналогичено верхнему коментарию

        NextBtn.setOnClickListener{ //в данном месте кода объявляется "слушатель" кнопки для перехода на следующую страницу
            val intent = Intent(this,FlexiblePay::class.java)// тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
            startActivity(intent) // метод запуска перехода
        }

        SkipBtn.setOnClickListener{// аналогично. В данном месте кода объявляется "слушатель" кнопки для перехода на следующую страницу
            val intent = Intent(this,signupp::class.java) // тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
            startActivity(intent)// метод запуска перехода
        }
    }
}