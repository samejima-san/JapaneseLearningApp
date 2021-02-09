package com.example.japaneselearningapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.FirebaseDatabase


lateinit var DisScore: TextView
lateinit var goBack :Button
lateinit var MainMenu:Button
class scoreshow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scoreshow)
        var intent = intent
        var scoreNum = intent.getStringExtra("MyScore")

        var DisScore = findViewById<TextView>(R.id.textView4)
        var goBack = findViewById<TextView>(R.id.button5)

        DisScore.text = "Your score is " + scoreNum

        var MainMenu = findViewById<TextView>(R.id.button9)

        MainMenu.setOnClickListener{
            goingBack()
        }

        goBack.setOnClickListener{
            openActivity(scoreNum)
        }
    }

    private fun openActivity(scoreNum:String)
    {
        // Write a message to the database
        // Write a message to the database
        val myRef = FirebaseDatabase.getInstance().getReference("Users")
        //val myRef = database.getReference("Users")
        val playerId = myRef.push().key //creates a new id for each player

        var player = Player(playerId.toString(), scoreNum.toInt())

        myRef.child(playerId.toString()).setValue(player).addOnCompleteListener {
            Toast.makeText(applicationContext,"Data saved to database", Toast.LENGTH_LONG).show()
        }
        //puts the score in the database


        val intent = Intent(this, activity2::class.java)
        startActivity(intent)
    }

    private fun goingBack(){
        val intent = Intent(this, Main_Menu::class.java)
        startActivity(intent)
    }

    class Player(val playerId: String, val score:Int)

}
