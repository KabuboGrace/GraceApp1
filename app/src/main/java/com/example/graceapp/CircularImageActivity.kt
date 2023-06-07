package com.example.graceapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CircularImageActivity : AppCompatActivity() {

    lateinit var back: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circular_image)

        back= findViewById(R.id.button34)
        back.setOnClickListener {
            var mynext = Intent(this, BackgroundImageActivity::class.java)
            startActivity(mynext)
        }
    }
}