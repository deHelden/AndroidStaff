package com.example.kioshi.simpleapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainButton.setOnClickListener{
            val randomIntent = Intent(this, ClickerRandomActivity::class.java)
            startActivity(randomIntent)
        }

        flagsButton.setOnClickListener{
            val randomIntent = Intent(this, FlagsActivity::class.java)
            startActivity(randomIntent)
        }
    }

}
