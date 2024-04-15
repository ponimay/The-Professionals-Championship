package com.example.chempionat

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class signupp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signupp)

        val nextBtn : Button = (findViewById(R.id.NextBtn)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val sign : TextView = (findViewById(R.id.textView15)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val check : CheckBox = (findViewById(R.id.Check))

        nextBtn.setOnClickListener{ //в данном месте кода объявляется "слушатель" кнопки для перехода на следующую страницу

            if (!check.isChecked)
            {
                val toast = Toast.makeText(applicationContext, "Галочку нажмите", Toast.LENGTH_SHORT) // объявляется локальная переменная. И она обращается к классу "Toast" для вывода ссобщения
                !nextBtn.isEnabled
                toast.show() // метод оповещения
            }
            else{
                val toast = Toast.makeText(applicationContext, "Молодцы!", Toast.LENGTH_SHORT)
                toast.show()
                val intent = Intent(this,LogIn::class.java)// тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
                startActivity(intent) // метод запуска перехода

            }
        }
        sign.setOnClickListener {
            val intent = Intent(this,LogIn::class.java)// тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
            startActivity(intent) // метод запуска перехода
        }
    }
}