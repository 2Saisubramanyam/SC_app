package com.example.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun fro(view: View) {
        val intent = Intent(this,page2::class.java)
        startActivity(intent)
    }

    fun den(view: View) {
        val intent = Intent(this,page3::class.java)
        startActivity(intent)
    }

    fun ill(view: View) {
        val intent = Intent(this,page4::class.java)
        startActivity(intent)
    }

    fun ali(view: View) {
        val intent = Intent(this,page5::class.java)
        startActivity(intent)
    }

    fun ab(view: View) {
        val intent = Intent(this,about::class.java)
        startActivity(intent)
    }

}

