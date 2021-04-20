package com.example.incrementanddecrementfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val incrementButton:Button
       get() = findViewById(R.id.button)

    private val counterTextView:TextView
       get() = findViewById(R.id.textView)

    var count: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //click listener for increment Button
        incrementButton.setOnClickListener {
        count+=1
         val counterVal = count.toString()
         counterTextView.text = counterVal
        }

    }
}