package com.yof.rock_paper_scissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yof.rock_paper_scissors.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var cpoint = 0.0
    var ppoint = 0.0
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateButton.setOnClickListener { playGame() }
    }

    private fun playGame() {




        val user = when (binding.tipOptions.checkedRadioButtonId) {
            R.id.option_rock -> 1
            R.id.option_paper -> 2
            else -> 3
        }
        val dice = cPlay()
        val comp = dice.roll()



        val i = 0


        if (user == comp) {
            binding.tipResult.text="It was a Tie"
            cpoint += 0.5
            ppoint += 0.5
        } else if (user == 1) {
            if (comp == 2) {
                binding.tipResult.text="Computer wins"
                cpoint += 1
            } else {
                binding.tipResult.text="Player wins"
                ppoint += 1
            }
        } else if (user == 2) {
            if (comp == 3) {
                binding.tipResult.text="Computer wins"
                cpoint += 1
            } else {
                binding.tipResult.text="Player wins"
                ppoint += 1
            }
        } else {
            if (comp == 1) {

                binding.tipResult.text="Computer wins"
                cpoint += 1
            } else {
                binding.tipResult.text="Player wins"
                ppoint += 1
            }
        }
        binding.cScore.text=cpoint.toString()
        binding.pScore.text=ppoint.toString()
    }


}

class cPlay() {

    fun roll(): Int {
        return (1..3).random()
    }
}