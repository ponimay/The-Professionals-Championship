package com.example.chempionat

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class Payment2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment2)

        val NextBtn : Button = (findViewById(R.id.NextBtn))

        val pay1 : View = (findViewById(R.id.pay1))
        val pay3 : View = (findViewById(R.id.pay3))
        val pay : View = (findViewById(R.id.pay))
        val circle1 : ImageView = (findViewById(R.id.circle1))
        val circle : ImageView = (findViewById(R.id.circle))

        val trashhh : ImageView = (findViewById(R.id.trashhh))
        val trashhh1 : ImageView = (findViewById(R.id.trashhh1))

        NextBtn.setOnClickListener {
            val intent = Intent(this,Wallett::class.java)// тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
            startActivity(intent) // метод запуска перехода
        }

        var isPay1Selected = false

        pay1.setOnClickListener {
            if (!isPay1Selected) {
                circle1.setImageResource(R.drawable.radio)
                circle.setImageResource(R.drawable.btnrad)
                isPay1Selected = true
            }
        }

        pay.setOnClickListener {
            if (isPay1Selected) {
                circle.setImageResource(R.drawable.btnrad)
                circle1.setImageResource(R.drawable.radio)
                isPay1Selected = false
            }
        }

        pay3.setOnClickListener {
            val intent = Intent(this,Payment::class.java)// тут объявляеться локальная переменная "intent" и присваивается к классу типа "Intent", после в скобках класса происходит сама логика перехода.
            startActivity(intent) // метод запуска перехода
        }

        trashhh.setOnClickListener {
            pay.visibility = View.GONE
        }

        trashhh1.setOnClickListener {
            pay1.visibility = View.GONE

        }


    }
}