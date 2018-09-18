package com.example.kioshi.simpleapp

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button3.setOnClickListener {
            button3.setBackgroundColor(Color.RED)
            val random = Random()

            var color: Int = Color.argb(255, random.nextInt(256),random.nextInt(256),random.nextInt(256))
            button3.setBackgroundColor(color)

            val myToast = Toast.makeText(this, "color changed! >_<", (Toast.LENGTH_SHORT)/2).show()
        }
    }

    fun countMe(view: View){
        // Get the text view
        // Don't need cuz kotlinx...
        // val showCountTextView = findViewById<TextView>(R.id.textView) as TextView

        // Get the value of the text View
        val countString = textView.text.toString()

        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString); count++

        // Display the new value in the text view.
        textView.text = count.toString()
    }

    fun randomMe(view: View){
        // Create an Intent to start the second activity
        val randomIntent = Intent(this, SecondActivity::class.java)

        // Get the current value of the text view.
        val countString = textView.text.toString()

        // Convert the count to an int
        val count = Integer.parseInt(countString)

        // Add the count to the extras for the Intent.
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        // Start new activity
        startActivity(randomIntent)
    }
}
