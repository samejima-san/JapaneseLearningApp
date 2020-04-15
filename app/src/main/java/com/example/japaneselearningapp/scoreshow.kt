package com.example.japaneselearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

lateinit var DisScore: TextView
lateinit var goBack :Button
class scoreshow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scoreshow)
        var intent = intent
        var scoreNum = intent.getStringExtra("MyScore")

        var DisScore = findViewById<TextView>(R.id.textView4)
        var goBack = findViewById<TextView>(R.id.button5)

        DisScore.text = "Your score is " + scoreNum

        goBack.setOnClickListener{
            openActivity()
        }
    }

    private fun openActivity()
    {
        val intent = Intent(this, activity2::class.java)
        startActivity(intent)
    }

}
