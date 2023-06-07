package com.example.graceapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ButtonActivity : AppCompatActivity() {

    lateinit var intent: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        //Finding view by id
        intent = findViewById(R.id.button4)

        //setOneClickListener
        intent.setOnClickListener {
            var mynext = Intent(this, IntentActivity::class.java)
            startActivity(mynext)


        }
    }
}