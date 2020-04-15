package com.example.japaneselearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import japaneseFiles.JapaneseCard
import japaneseFiles.Quiz
import kotlinx.android.synthetic.main.activity_game.*
import org.w3c.dom.Text


lateinit var button1: Button
lateinit var button2: Button
lateinit var button3: Button
lateinit var button4: Button
lateinit var gtimer:TextView
lateinit var score: TextView

class Game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        var intent = intent
        //var gTime = 60
        var gameTime = intent.getStringExtra("gameTime") //gets gametime from previous activity
        var gTime:Int = gameTime.toInt() //makes it an int
        var gameKana = intent.getIntArrayExtra("gameKana") //choosing hiragana or katakana
        var gKana = gameKana.toTypedArray()
        var gameTimer = findViewById<TextView>(R.id.timer_text)
        gameTimer.text = "Time Remaining: " +gTime
        var dgameKana = findViewById<TextView>(R.id.displayKana)

        var firstButt:String = ""
        var secButt:String = ""
        var thirButt:String = ""
        var fourButt:String = ""
        var kanaText:String = ""


        //buttons into variables
        val Button1 = findViewById<TextView>(R.id.button)
        val Button2 = findViewById<TextView>(R.id.button2)
        val Button3 = findViewById<TextView>(R.id.button3)
        val Button4 = findViewById<TextView>(R.id.button4)

        val gameQuiz = Quiz(0, arrayOf(1,1))


        fun showGTime():Int{
            return gTime
        }

        fun assignButt(question:Array<JapaneseCard>)
        {
            kanaText = question[0].showDText()
            //randomize order of layout
            displayKana.text = kanaText
            //for now I will leave it in order
            firstButt = question[0].showUText()
            secButt = question[1].showUText()
            thirButt = question[2].showUText()
            fourButt = question[3].showUText()
            Button1.text = firstButt
            Button2.text = secButt
            Button3.text = thirButt
            Button4.text = fourButt
        }


        Button1.setOnClickListener() {
            if(firstButt == kanaText) {
                    gameQuiz.addPoint()
                }
            }
        Button2.setOnClickListener() {
            if(secButt == kanaText) {
                gameQuiz.addPoint()
            }
        }

        Button3.setOnClickListener() {
            if(thirButt == kanaText) {
                gameQuiz.addPoint()
            }
        }

        Button4.setOnClickListener() {
            if (fourButt == kanaText) {
                gameQuiz.addPoint()
            }
        }


        while(gTime > 0)
        {
            var question = gameQuiz.askQuestion() //this returns an array of Kana, with Question[0]being the one we are looking for
            //call the assign buttons function
            assignButt(question)
            //assign each kana to a button, only their romaji forms so .showUText or whatever
            //when time reaches 0 stop the game
            println("we are here")

        }
    }






}
