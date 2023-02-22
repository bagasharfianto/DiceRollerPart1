package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val RollButton : Button = findViewById(R.id.roll_button)
        RollButton.setOnClickListener { diceRoll() }

    }

    private fun diceRoll(){
        lateinit var diceImage : ImageView
        diceImage = findViewById(R.id.dice_image)
        val randomInt = (1..6).random()
        val drawableResouce = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResouce)
    }

}