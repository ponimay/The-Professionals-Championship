package com.example.chempionat

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Home : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val prof : ImageView = (findViewById(R.id.prof)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val wallet : ImageView = (findViewById(R.id.wallet)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val track : ImageView = (findViewById(R.id.track)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val homeeeeee : ImageView = (findViewById(R.id.homeeeeee)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID

        val chattt : ImageView = (findViewById(R.id.chattt)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val chattttt : ImageView = (findViewById(R.id.chattttt)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val Chats : TextView = (findViewById(R.id.textView101)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val textchat : TextView = (findViewById(R.id.textchat)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID

        val walblock : ImageView = (findViewById(R.id.walblock)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val wal : ImageView = (findViewById(R.id.wal)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val walup : TextView = (findViewById(R.id.walup)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val waltxt : TextView = (findViewById(R.id.waltxt)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID


        val callblock : ImageView = (findViewById(R.id.callblock)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val imageView46 : ImageView = (findViewById(R.id.imageView46)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val textView94 : TextView = (findViewById(R.id.textView94)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID
        val textView95 : TextView = (findViewById(R.id.textView95)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID


        prof.setOnClickListener {
            val intent = Intent(this,Profile::class.java)// тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
            startActivity(intent) // метод запуска перехода
        }
        homeeeeee.setOnClickListener {
            val toast = Toast.makeText(applicationContext, "Вы и так на домашней странице!", Toast.LENGTH_SHORT)
            toast.show()
        }

        track.setOnClickListener {
            val intent = Intent(this,Track::class.java)// тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
            startActivity(intent) // метод запуска перехода
        }

        wallet.setOnClickListener {
            val intent = Intent(this,Wallett::class.java)// тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
            startActivity(intent) // метод запуска перехода
        }

        val proftxt : TextView = (findViewById(R.id.proftxt)) // объявляется локальная переменная. Её можно назвать как угодно. После данная переменная обращается к классу "Button" и происходит присваиваение объекта кнопки по его ID

        proftxt.setOnClickListener {
            val intent = Intent(this,Profile::class.java)// тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
            startActivity(intent) // метод запуска перехода
        }


        chattt.setOnClickListener{
            chattt.setImageResource(R.drawable.bluee)
            chattttt.setImageResource(R.drawable.chatttb)
            Chats.setTextColor(Color.parseColor("#FFFFFF"));
            textchat.setTextColor(Color.parseColor("#FFFFFF"));

            Handler(Looper.getMainLooper()).postDelayed({ // в данном месте кода объявляется класс "Handler" который предназначен для взаимодействия между формами. Обращатся кметоду 'получить основной цикл' и также к методу таймера
                val intent = Intent(this,Chatssss::class.java) // тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
                startActivity(intent)// метод запуска перехода
                finish() // вызов задержки
            },2000) // задержка



        }
        walblock.setOnClickListener{
            walblock.setImageResource(R.drawable.bluee)
            wal.setImageResource(R.drawable.walwhite)
            walup.setTextColor(Color.parseColor("#FFFFFF"));
            waltxt.setTextColor(Color.parseColor("#FFFFFF"));
        }

        callblock.setOnClickListener{
            callblock.setImageResource(R.drawable.bluee)
            imageView46.setImageResource(R.drawable.callwhite)
            textView94.setTextColor(Color.parseColor("#FFFFFF"));
            textView95.setTextColor(Color.parseColor("#FFFFFF"));
        }




    }
}