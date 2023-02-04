package com.example.happybirthday

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { spinCube() }

    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun spinCube() {
        // Create new Dice object with 6 sides and roll it
        val cube = Cube(6)
        val cubeSpin = cube.spin()

        val cubeImage : ImageView = findViewById(R.id.imageView)
        cubeImage.setImageResource(R.drawable.dice_2)
    }
}

class Cube(private val numSides: Int) {
    fun spin(): Int {
        return (1..numSides).random()
    }
}