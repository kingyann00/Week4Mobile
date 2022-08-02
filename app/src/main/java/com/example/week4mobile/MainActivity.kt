package com.example.week4mobile

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.week4mobile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        
        setlinsteners()

    }

    private fun setlinsteners(){

        val Clickables : List<View> =
            listOf(
                binding.boxOne,binding.boxTwo,binding.boxThree,binding.boxFour,binding.boxFive,
                binding.redButton,binding.yellowButton, binding.greenButton
            )

        for (item in Clickables){
            item.setOnClickListener{makeColored(it)}
        }

    }

    private  fun makeColored(view: View){
        when(view.id){
            R.id.boxOne->view.setBackgroundColor(Color.BLUE)
            R.id.boxTwo->view.setBackgroundColor(Color.RED)
            R.id.boxThree->view.setBackgroundColor(Color.GREEN)
            R.id.boxFour->view.setBackgroundColor(Color.CYAN)
            R.id.boxFive->view.setBackgroundColor(Color.MAGENTA)
            R.id.redButton -> binding.boxThree.setBackgroundResource(R.color.my_red)
            R.id.yellowButton -> binding.boxFour.setBackgroundResource(R.color.my_yellow)
            R.id.greenButton -> binding.boxFive.setBackgroundResource(R.color.my_green)
        }
    }


}