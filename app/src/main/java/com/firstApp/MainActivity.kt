package com.firstApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickButton(view:View){
        var intent = Intent(this,PhraseActivity::class.java)
        var text:EditText = findViewById(R.id.text)
        intent.putExtra("text",text.text.toString())
        startActivity(intent)
    }
}