package com.example.japaneselearningapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.TextView
import japaneseFiles.JapaneseCard
import japaneseFiles.Quiz
import kotlinx.android.synthetic.main.activity_game.*
import org.w3c.dom.Text
import java.util.Collections.shuffle
import kotlin.random.Random


lateinit var button1: Button
lateinit var button2: Button
lateinit var button3: Button
lateinit var button4: Button


lateinit var gtimer:TextView
lateinit var countDownTimer: CountDownTimer

class Game : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        var intent = intent
        //var gTime = 60
        var gameTime = intent.getStringExtra("gameTime") //gets gametime from previous activity
        var gTime:Long = gameTime.toLong() //makes it an int
        var gameKana = intent.getIntArrayExtra("gameKana") //choosing hiragana or katakana
        var gKana = gameKana.toTypedArray()
        var gameTimer = findViewById<TextView>(R.id.timer_text)
        var displayTimerText:Long = gTime / 1000
        gameTimer.text = "Time Remaining: " + displayTimerText
        var dgameKana = findViewById<TextView>(R.id.displayKana)

        var firstButt:String = ""
        var secButt:String = ""
        var thirButt:String = ""
        var fourButt:String = ""
        var kanaText:String = ""
        var gscore:String=""
        var answer:String=""


        //buttons into variables
        val Button1 = findViewById<TextView>(R.id.button)
        val Button2 = findViewById<TextView>(R.id.button2)
        val Button3 = findViewById<TextView>(R.id.button3)
        val Button4 = findViewById<TextView>(R.id.button4)


        val gameQuiz = Quiz(0, gKana)//arrayOf(1,1)
        var question = gameQuiz.askQuestion() //this returns an array of Kana, with Question[0]being the one we are looking for
        val sText=findViewById<TextView>(R.id.textView7)
        gscore = gameQuiz.score.toString()
        sText.text = "score: "+gscore
        //assign each kana to a button, only their romaji forms so .showUText or whatever
        //when time reaches 0 stop the game

        fun assignButt(question:Array<JapaneseCard>)
        {
            kanaText = question[0].showDText()
            //randomize order of layout
            displayKana.text = kanaText
            answer= question[0].showUText()
            //for now I will leave it in order
            var cards  = arrayOf<Int>(0,1,2,3)

            for(card in cards)
            {
                var r1 = Random.nextInt(0,4)
                var r2 = Random.nextInt(0,4)
                var temp:Int = 0
                if(r1!=r2)
                {
                    temp = cards[r1]
                    cards[r1] = cards[r2]
                    cards[r2] = temp
                }
            }


            firstButt = question[cards[0]].showUText()
            secButt = question[cards[1]].showUText()
            thirButt = question[cards[2]].showUText()
            fourButt = question[cards[3]].showUText()
            Button1.text = firstButt
            Button2.text = secButt
            Button3.text = thirButt
            Button4.text = fourButt
        }

        fun answerCheck(TheButton:String, TheAnswer:String, actButton:TextView) {
            if (TheButton == TheAnswer) {
                correctButton(actButton)
                gameQuiz.addPoint()
                gscore = gameQuiz.score.toString()
                sText.text = "score: " + gscore
                question = gameQuiz.askQuestion()
                assignButt(question)
            } else {
                incorrectButton(actButton)
            }
        }


            Button1.setOnClickListener {
                answerCheck(firstButt, answer, Button1)
            }
            Button2.setOnClickListener() {
                answerCheck(secButt, answer, Button2)
            }

            Button3.setOnClickListener() {
                answerCheck(thirButt, answer, Button3)
            }

            Button4.setOnClickListener() {
                answerCheck(fourButt, answer, Button4)
            }

            val tumor = object : CountDownTimer(gTime, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    val timeLeft = millisUntilFinished / 1000
                    gameTimer.setText("Time Remaining: " + timeLeft)
                }

                override fun onFinish() {
                    openActivity(gscore)
                }
            }


        //call the assign buttons function
        tumor.start()
        assignButt(question)
    }

    private fun correctButton(TheButton:TextView) {
        TheButton.setBackgroundColor(Color.GREEN)
        val waiting = object : CountDownTimer(200, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val timeLeft = millisUntilFinished / 1000
            }

            override fun onFinish() {
                TheButton.setBackgroundColor(Color.WHITE)
            }
        }
        waiting.start()
    }

    private fun incorrectButton(TheButton:TextView) {
        TheButton.setBackgroundColor(Color.RED)
        val waiting = object : CountDownTimer(300, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val timeLeft = millisUntilFinished / 1000
            }

            override fun onFinish() {
                TheButton.setBackgroundColor(Color.WHITE)
            }
        }
        waiting.start()
    }

    fun openActivity(DisScore:String)
    {
        val intent = Intent(this, scoreshow::class.java)
        intent.putExtra("MyScore", DisScore)
        startActivity(intent)
    }



}
