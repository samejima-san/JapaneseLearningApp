package com.example.japaneselearningapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Game : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        var intent = intent
        var gameTime = intent.getStringExtra("gameTime") //gets gametime from previous activity
        var gTime :Int = Integer.parseInt(gameTime) //makes it an int
        var gameKana = intent.getIntArrayExtra("gameKana") //choosing hiragana or katakana

        var gameTimer = findViewById<TextView>(R.id.timer_text)
        gameTimer.text = "Time Remaining: " +gTime


        //buttons into variables
        val Button1 = findViewById<TextView>(R.id.button)
        val Button2 = findViewById<TextView>(R.id.button2)
        val Button3 = findViewById<TextView>(R.id.button3)
        val Button4 = findViewById<TextView>(R.id.button4)


        fun showGTime():Int{
            return gTime
        }
    }



}
