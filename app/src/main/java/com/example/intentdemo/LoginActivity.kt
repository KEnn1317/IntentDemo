package com.example.intentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val name = intent.getStringExtra("name")
        val tvResult:TextView = findViewById(R.id.tvResult)

        tvResult.text = name

        val btnLogin: Button = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener(){
            val tvLoginMsg:TextView = findViewById(R.id.tvLoginMsg)

            tvLoginMsg.text = "\"Login Successfully\""
        }
    }
}