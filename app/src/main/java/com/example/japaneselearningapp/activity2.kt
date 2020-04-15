
package com.example.japaneselearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import android.view.View

lateinit var cbKata : CheckBox
lateinit var cbHira: CheckBox
class activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity2)

        cbHira = findViewById<CheckBox>(R.id.hiraganacheckbox)
        cbKata = findViewById<CheckBox>(R.id.katakanacheckbox)
        cbHira.isChecked = true
        cbKata.isChecked = true
        val thirButton = findViewById<Button>(R.id.thirButt)
        val minButton = findViewById<Button>(R.id.minButt)

        thirButton.setOnClickListener {
            var num:Int = 30000 //thirty seconds
            setGame(num, checkGana())
        }

        minButton.setOnClickListener{
            var num:Int = 60000 //sixty seconds
            setGame(num, checkGana())
        }
    }

    fun setGame(gameTime: Int, gameKana: Array<Int>) {
        if (gameKana.contentDeepEquals(arrayOf(0,0)))
        {
            //then do nothing
            displayError()
        }
        else
        {
            openGame(gameTime, gameKana)
        }

    }

    fun checkGana() : Array<Int>
    {
        val temp : Array<Int> = arrayOf(1,1)
        temp[0] = 0
        temp[1] = 0
        if(cbHira.isChecked && cbKata.isChecked)
        {
            //then both hiragana and katakana is active
            temp[0] = 1
            temp[1] = 1
            return temp
        }
        else if(cbHira.isChecked && !cbKata.isChecked)
        {
            //then only hiragana
            temp[0] = 1
            temp[1] = 0
            return temp
        }
        else if(!cbHira.isChecked && cbKata.isChecked)
        {
            //then only Katakana
            temp[0] = 0
            temp[1] = 1
            return temp
        }
        else
        {
            //message appears saying user needs to select a learning path
            return temp
        }
    }

    fun displayError()
    {
        Toast.makeText(this@activity2,"Enable a Kana", Toast.LENGTH_SHORT).show()
    }

    fun openGame(gameTime :Int, gameKana: Array<Int>)
    {
            val intent = Intent(this, Game::class.java)
            intent.putExtra("gameTime", gameTime.toString())
            intent.putExtra("gameKana", gameKana.toIntArray())
            startActivity(intent)
    }

}
