package com.example.graceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var toastbtn: Button
    lateinit var info: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Finding view by id
        toastbtn = findViewById(R.id.button)
        info = findViewById(R.id.button2)




        //setonClickListener
        toastbtn.setOnClickListener {
            Toast.makeText(applicationContext, "You did it successfully", Toast.LENGTH_LONG).show()
        }

        info.setOnClickListener {
            var myinfo= Intent(this,FormActivity::class.java)
            startActivity(myinfo)
        }


    }

}
