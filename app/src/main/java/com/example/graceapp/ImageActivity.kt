package com.example.graceapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ImageActivity : AppCompatActivity() {

    lateinit var rott: ImageView
    lateinit var circle: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        rott = findViewById(R.id.image1)
        rott.setOnClickListener {
            var mynext = Intent(this, NewActivity::class.java)
            startActivity(mynext)
        }


        circle = findViewById(R.id.button23)
        circle.setOnClickListener {
            var mynext = Intent(this, CircularImageActivity::class.java)
            startActivity(mynext)
        }
    }
}