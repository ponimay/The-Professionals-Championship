package com.example.chempionat

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Wallett : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallett)
        val eye : ImageView = (findViewById(R.id.eyehide)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val homhomeeeeeee : ImageView = (findViewById(R.id.homhomeeeeeee)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val prof : ImageView = (findViewById(R.id.prof)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val track : ImageView = (findViewById(R.id.track)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val bal : TextView = (findViewById(R.id.balance)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val wallett : ImageView = (findViewById(R.id.wallet)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val carta : ImageView = (findViewById(R.id.carta)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID


        prof.setOnClickListener{
            val intent = Intent(this,Profile::class.java)// тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
            startActivity(intent) // метод запуска перехода
        }
        wallett.setOnClickListener{
            val toast = Toast.makeText(applicationContext, "Вы и так на странице кошелька!", Toast.LENGTH_SHORT)
            toast.show()
        }
        homhomeeeeeee.setOnClickListener{
                val intent = Intent(this,Home::class.java)// тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
                startActivity(intent) // метод запуска перехода
        }

        track.setOnClickListener{
            val intent = Intent(this,Track::class.java)// тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
            startActivity(intent) // метод запуска перехода
        }

        carta.setOnClickListener{
            val intent = Intent(this,Payment::class.java)// тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
            startActivity(intent) // метод запуска перехода
        }
        var isHidden = true

        eye.setOnClickListener {
            if (isHidden) {
                bal.text = "******"
                isHidden = false
            } else {
                bal.text = "N10,712:00"
                isHidden = true
            }
        }
    }
}