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

        val rollButton: Button = (findViewById(R.id.button))
        rollButton.setOnClickListener { rollDice() }


        val countButton: Button =(findViewById(R.id.button2))
        countButton.setOnClickListener { countDice()}

    }


    private fun rollDice() {
        val randomInt = (1..6).random()
//        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val textResult: TextView = (findViewById(R.id.textView))
        textResult.text = randomInt.toString()

    }

    private  fun countDice(){
        val textResult: TextView = (findViewById(R.id.textView))
        val countUp: Int =  textResult.text.toString().toInt() + 1
        textResult.text = countUp.toString()  //or $countUp


    }
}