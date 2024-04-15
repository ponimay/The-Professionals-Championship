package com.example.chempionat

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class CardBank : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_bank)

        val backk: ImageView = (findViewById(R.id.backkk)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID

        backk.setOnClickListener{
            val intent = Intent(this,Profile::class.java)// тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
            startActivity(intent) // метод запуска перехода
        }
    }
}