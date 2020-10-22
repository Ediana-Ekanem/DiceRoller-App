package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DiceRoller2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roller2)

        val firstButton : Button = (findViewById(R.id.btn_One))
        firstButton.setOnClickListener { rollTheDice()}


        val secondButton : Button = (findViewById(R.id.btn_Two))
        secondButton.setOnClickListener {reSetButton()}
    }


    private fun rollTheDice(){
        val randomInt = (1..6).random()
        val txtResult: TextView = (findViewById(R.id.textV))
        txtResult.text = randomInt.toString()

    }

    private fun reSetButton(){
        val txtResult: TextView = (findViewById(R.id.textV))
        txtResult.text = "0"


    }
}