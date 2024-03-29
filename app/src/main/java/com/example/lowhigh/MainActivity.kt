package com.example.lowhigh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener{ reset()}
    }
    private fun rollDice() {
        val randomInt = Random().nextInt(6)+1
        val diceImage: ImageView = findViewById(R.id.dice_image)
        val drawableSorce = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableSorce)
    }
    private fun reset() {
        val diceImage: ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(R.drawable.dice_1)
    }
}
