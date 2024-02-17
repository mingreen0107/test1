package com.example.test1.auth

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.test1.R
import com.google.android.material.textfield.TextInputEditText

class JoinActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        val joinBtn = findViewById<Button>(R.id.joinBtn)
        joinBtn.setOnClickListener{

            val email = findViewById<TextInputEditText>(R.id.emailArea)
            val pwd = findViewById<TextInputEditText>(R.id.pwdArea)

            Log.d(TAG, email.text.toString())
            Log.d(TAG, pwd.text.toString())

        }

    }
}