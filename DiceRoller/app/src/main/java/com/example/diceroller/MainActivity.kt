package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val mTAG:String = "MainActivity";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v(mTAG, "Activity is started")
        val rollButton: Button = findViewById(R.id.dice_roll_button);
        rollButton.setOnClickListener{diceRoller();}

    }

    private fun diceRoller(){
        Log.v(mTAG, "In diceRoller func")
        val dice:Dice = Dice(6)
        Log.v(mTAG, "Dice instance has been initialized")
        val diceNum:Int = dice.rollDice()
        setImageView(diceNum)
        Log.v(mTAG, "after diceRoller func")
    }

    private fun setImageView(diceNum : Int){
        Log.v(mTAG, "In setImageView func")
        val diceIV : ImageView = findViewById(R.id.dice_image_view)
        val imageResource:Int = when(diceNum){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceIV.setImageResource(imageResource)
        diceIV.contentDescription = diceNum.toString()
    }

}

class Dice(private val numSide:Int){

    fun rollDice(): Int{
        return (1..numSide).random()
    }

}