package com.example.kioshi.simpleapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_random.*
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class RandomActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        showRandomNumber()
    }

    fun showRandomNumber(){
        // Get the count from the intent extras
        val count = intent.getIntExtra(RandomActivity.TOTAL_COUNT, 0)

        // Generate the random number
        val random = Random()
        var randomInt = 0

        // Add one because the bound is exclusive
        if (count > 0){
            randomInt = random.nextInt(count + 1)
        }

        // Display the random number
        textView_random.text = Integer.toString(randomInt)

        // Substitute the max value into the string resource
        // for the heading, and update the heading
        textView_label.text = getString(R.string.random_heading, count)
    }
}
