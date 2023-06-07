package com.example.graceapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FormActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    //Declare a Variable
    lateinit var report: Button
    lateinit var pay: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        //Finding view by id
        report = findViewById(R.id.button)
        pay = findViewById(R.id.btn5)


        //setOneClickListener
        report.setOnClickListener {
            var myreport = Intent(this, ButtonActivity::class.java)
            startActivity(myreport)
        }
        //stk
        pay.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
    }
}