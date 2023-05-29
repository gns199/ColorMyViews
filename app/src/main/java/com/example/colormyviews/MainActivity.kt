package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.colormyviews.databinding.ActivityMainBinding


//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setListeners()

    }
    private fun setListeners(){
        val clickableViews: List<View> =
            listOf(binding.boxOneText, binding.boxTwoText, binding.boxThreeText, binding.boxFourText, binding.boxFiveText, binding.constarintLayout, binding.redButton, binding.yellowButton, binding.greenButton)
        for (item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }
    }
    private fun makeColored(view: View){
        when (view) {
            binding.boxOneText -> {
                view.setBackgroundColor(Color.DKGRAY)
            }
            binding.boxTwoText -> {
                view.setBackgroundColor(Color.GRAY)
            }
            binding.boxThreeText -> {
                view.setBackgroundResource(android.R.color.holo_green_light)
            }
            binding.boxFourText -> {
                view.setBackgroundResource(android.R.color.holo_green_dark)
            }
            binding.boxFiveText -> {
                view.setBackgroundResource(android.R.color.holo_green_light)
            }
            binding.redButton -> binding.boxThreeText.setBackgroundResource(R.color.my_red)
            binding.greenButton -> binding.boxFourText.setBackgroundResource(R.color.my_green)
            binding.yellowButton -> binding.boxFiveText.setBackgroundResource(R.color.my_yellow)

            else ->view.setBackgroundColor(Color.LTGRAY)


        }

    }
}