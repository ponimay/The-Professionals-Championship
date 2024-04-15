package com.example.chempionat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class DelSuc2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_del_suc2)

        val NextBtn: Button = (findViewById(R.id.NextBtn)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val starB: ImageView = (findViewById(R.id.star)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val starB1: ImageView = (findViewById(R.id.star1)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val starB2: ImageView = (findViewById(R.id.star2)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val starB3: ImageView = (findViewById(R.id.star3)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val starB4: ImageView = (findViewById(R.id.star4)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID


        NextBtn.setOnClickListener{
            val intent = Intent(this,Home::class.java)// тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
            startActivity(intent) // метод запуска перехода
        }
        starB.setOnClickListener{
            starB.setImageResource(R.drawable.starb)
        }
        starB1.setOnClickListener{
            starB1.setImageResource(R.drawable.starb)

        }
        starB2.setOnClickListener{
            starB2.setImageResource(R.drawable.starb)

        }
        starB3.setOnClickListener{
            starB3.setImageResource(R.drawable.starb)

        }
        starB4.setOnClickListener{
            starB4.setImageResource(R.drawable.starb)

        }

    }
}