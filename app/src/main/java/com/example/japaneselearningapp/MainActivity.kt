package com.example.japaneselearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun mainclick(view: View) {
        //Toast.makeText(this@MainActivity,"im clicked", Toast.LENGTH_SHORT).show() stupid meme
        openActivity()
    }

    fun openActivity(){
        val intent = Intent(this, activity2::class.java)
        startActivity(intent)
    }
}
