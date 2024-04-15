package com.example.chempionat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SendPackDest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_pack_dest)

        val back: ImageView = (findViewById(R.id.back)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val make: ImageView = (findViewById(R.id.make)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID


        back.setOnClickListener{
            val intent = Intent(this,Profile::class.java)// тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
            startActivity(intent) // метод запуска перехода
        }

        make.setOnClickListener{
            val intent = Intent(this,DelSuc::class.java)// тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
            startActivity(intent) // метод запуска перехода
        }
    }
}