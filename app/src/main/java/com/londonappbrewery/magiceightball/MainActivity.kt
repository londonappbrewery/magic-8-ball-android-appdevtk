package com.londonappbrewery.magiceightball

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ballDisplay = image_eightBall
        var ballArray  = arrayOf(R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5)
        var myButton = askButton
        myButton.setOnClickListener{
            val random = Random()
            val number = random.nextInt(5)
            ballDisplay.setImageResource(ballArray[number])
        }

    }
}
