
package com.example.japaneselearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import android.view.View
import android.widget.TextView

lateinit var cbKata : CheckBox
lateinit var cbHira: CheckBox
lateinit var tvHira:TextView
lateinit var tvKata:TextView

class activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity2)

        tvHira = findViewById<TextView>(R.id.textView2)
        tvKata = findViewById<TextView>(R.id.textView3)
        cbHira = findViewById<CheckBox>(R.id.hiraganacheckbox)
        cbKata = findViewById<CheckBox>(R.id.katakanacheckbox)
        cbHira.isChecked = true
        cbKata.isChecked = true
        val thirButton = findViewById<Button>(R.id.thirButt)
        val minButton = findViewById<Button>(R.id.minButt)
        var isInvisible = intent.getStringExtra("isInvisible") //gets isInvisible from previous activity
        assignVisib(isInvisible) //sets visibility

        thirButton.setOnClickListener {
            var num:Int = 30000 //thirty seconds
            setGame(num, checkGana(), isInvisible)
        }

        minButton.setOnClickListener{
            var num:Int = 60000 //sixty seconds
            setGame(num, checkGana(), isInvisible)
        }
    }

    fun setGame(gameTime: Int, gameKana: Array<Int>, kanachoice:String) {
        if (gameKana.contentDeepEquals(arrayOf(0,0))) {
            //then do nothing
            displayError()
        }
        else {
            openGame(gameTime, gameKana, kanachoice)
        }
    }

    fun checkGana() : Array<Int> {
        val temp : Array<Int> = arrayOf(1,1)
        temp[0] = 0
        temp[1] = 0
        if(cbHira.isChecked && cbKata.isChecked) {
            //then both hiragana and katakana is active
            temp[0] = 1
            temp[1] = 1
            return temp
        }
        else if(cbHira.isChecked && !cbKata.isChecked) {
            //then only hiragana
            temp[0] = 1
            temp[1] = 0
            return temp
        }
        else if(!cbHira.isChecked && cbKata.isChecked) {
            //then only Katakana
            temp[0] = 0
            temp[1] = 1
            return temp
        }
        else {
            //message appears saying user needs to select a learning path
            return temp
        }
    }

    fun assignVisib(areInvis:String)
    {
        if(areInvis == "roma") {
            cbHira.visibility = View.VISIBLE
            cbKata.visibility = View.VISIBLE
            tvKata.visibility = View.VISIBLE
            tvHira.visibility = View.VISIBLE
        }
        else{
            cbHira.visibility = View.GONE
            cbKata.visibility = View.GONE
            tvKata.visibility = View.GONE
            tvHira.visibility = View.GONE
            if(areInvis== "hira"){
                cbHira.isChecked = true
                cbKata.isChecked = false
            }
            else{
                cbHira.isChecked = false
                cbKata.isChecked = false
            }
        }
    }

    fun displayError() {
        Toast.makeText(this@activity2,"Enable a Kana", Toast.LENGTH_SHORT).show()
    }

    fun openGame(gameTime :Int, gameKana: Array<Int>, kana:String) {
            val intent = Intent(this, Game::class.java)
            intent.putExtra("gameTime", gameTime.toString())
            intent.putExtra("gameKana", gameKana.toIntArray())
            intent.putExtra("kana", kana)
            startActivity(intent)
    }

}
