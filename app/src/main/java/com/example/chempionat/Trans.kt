package com.example.chempionat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Trans : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trans)

        Handler(Looper.getMainLooper()).postDelayed({ // в данном месте кода объявляется класс "Handler" который предназначен для взаимодействия между формами. Обращатся кметоду 'получить основной цикл' и также к методу таймера
            val intent = Intent(this,Trans2::class.java) // тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
            startActivity(intent)// метод запуска перехода
            finish() // вызов задержки
        },2500) // задержка
    }
}