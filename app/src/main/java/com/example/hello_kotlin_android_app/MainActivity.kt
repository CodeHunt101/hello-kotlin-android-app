package com.example.hello_kotlin_android_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClick(v: View) {
        Toast.makeText(this,
            "Love you baby. Hope you like the teddy!",
            Toast.LENGTH_LONG).show()
    }
}