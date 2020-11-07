package com.firstApp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PhraseActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        findViewById<TextView>(R.id.textView).text = intent.getStringExtra("text")
        println("Hola")
    }
}