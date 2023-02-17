package com.example.helloskt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //onCreate is equivalent to the main fucncnctinnonsad
    override fun onCreate(savedInstanceState: Bundle?) {
        //Refer to the parent function
        super.onCreate(savedInstanceState)

        //Load User Interface to Memory
        //R = resources
        setContentView(R.layout.activity_main)

        //declare variable; val = value, var = variable

        val imageViewQR : ImageView = findViewById(R.id.imageView)
        val textview: TextView = findViewById(R.id.textView)
        val buttonShow : Button = findViewById(R.id.btn_show)
        val buttonHide : Button = findViewById(R.id.btn_hide)

        buttonShow.setOnClickListener(){
            imageViewQR.visibility = View.VISIBLE
            textview.visibility = View.VISIBLE
        }

        buttonHide.setOnClickListener(){
            imageViewQR.visibility = View.INVISIBLE
            textview.visibility = View.INVISIBLE
        }

    }
}