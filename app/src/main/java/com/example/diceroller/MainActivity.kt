package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice()}

        val resetButton: Button = findViewById(R.id.Reset)
        resetButton.setOnClickListener{resetDice()}

        val countUp : Button = findViewById(R.id.count_up)
        countUp.setOnClickListener { countUp() }
    }

    private fun rollDice(){
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        Toast.makeText(this,"Ara Boccil",
            Toast.LENGTH_SHORT).show()
        resultText.text = randomInt.toString()
    }

    private fun resetDice(){
        val resultText:TextView = findViewById(R.id.result_text)
        if(resultText.text == "Dice"){
            resultText.text ="0"
            Toast.makeText(this,"Reset dari tampilan awal",Toast.LENGTH_SHORT).show()
        }else if (resultText.text == "0"){
            Toast.makeText(this,"Data belum berubah ",Toast.LENGTH_SHORT).show()
        }
        else {
            resultText.text = "0"
            Toast.makeText(this,"Reset reset kembali ke 0",Toast.LENGTH_SHORT).show()
        }

    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        // If text is the default "Hello World!" set that text to 1.
        if (resultText.text == "Dice") {
            resultText.text = "1"
        } else {
            // Otherwise, increment the number up to 6.
            // The text value in resultText.text is an instance of the CharSequence class;
            // it needs to be converted to a String object before it can be converted to an int.
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }
}