package com.example.happybirthday

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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

        //Do a cube spin when the app starts
        spinCube()

    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun spinCube() {
        // Create new Dice object with 6 sides and roll it
        val cube = Cube(6)
        val cubeSpin = cube.spin()

        // Find the ImageView in the layout
        val cubeImage : ImageView = findViewById(R.id.imageView)

        // Determine which drawable resource ID to use based on the dice roll
        val drawableResource = when (cubeSpin) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Update the ImageView with the correct drawable resource ID
        cubeImage.setImageResource(drawableResource)

        // Update the content description
        cubeImage.contentDescription = cubeSpin.toString()
    }
}

class Cube(private val numSides: Int) {
    fun spin(): Int {
        return (1..numSides).random()
    }
}