package com.yof.higherlowerv3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    private val dice = Dice(100)
           private val diceRoll = dice.roll()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val aButton: Button = findViewById(R.id.button)
func()
//        val dice = Dice(100)
//        val diceRoll = dice.roll()
//
//        val resultTextView: TextView = findViewById(R.id.textView)
//        resultTextView.text = diceRoll.toString()
//

        aButton.setOnClickListener {
//            val toast = Toast.makeText(this, "", Toast.LENGTH_SHORT)
//            toast.show()
            func1()
        }



    }

private fun func()
    {
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
}
    private fun func1() {
        // Create new Dice object with 6 sides and roll the dice
//        val dice = Dice(100)
//        val diceRoll = dice.roll()
//
//        val resultTextView: TextView = findViewById(R.id.textView)
//        resultTextView.text = diceRoll.toString()

        // Find the ImageView in the layout
        val diceImage: ImageView = findViewById(R.id.imageView)
        R.id.imageView
        val stringInTextField : TextView = findViewById(R.id.editTextText)
        var cost: Int = stringInTextField.text.toString().toInt()
        // Determine which drawable resource ID to use based on the dice roll
        val drawableResource = when (cost) {
            diceRoll -> R.drawable.found
           in  0..diceRoll -> R.drawable.lower
            in diceRoll..100 -> R.drawable.higher
//            3 -> R.drawable.end
            diceRoll -> R.drawable.found

            else -> R.drawable.begin
        }
        val strText = when (cost) {
            diceRoll -> "The Number is found"
            in  0..diceRoll -> "guess was lower then the number "
            in diceRoll..100 -> "Guess was Higher then the actual number"


            else -> R.drawable.begin
        }
        val resultTextView: TextView = findViewById(R.id.textView2)
        resultTextView.text = strText.toString()

        // Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)

        // Update the content description
        diceImage.contentDescription = diceRoll.toString()
    }
}
class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (0..numSides).random()
    }
}