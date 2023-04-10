package com.example.ex_modulo8

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numClicks : Int = 0
        val button : Button = findViewById(R.id.btn_change_image)
        val textName : TextView = findViewById(R.id.textView_name)
        var editText : EditText = findViewById(R.id.edit_name)
        val screen = findViewById<LinearLayoutCompat>(R.id.screen)



        button.setOnClickListener {
            numClicks++
            textName.text = editText.text
            screen.background = getDrawable(R.drawable.ic_launcher_background)
        }


    }



}