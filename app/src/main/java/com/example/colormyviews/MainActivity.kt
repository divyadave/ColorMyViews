package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()

    }
    private fun setListener() {
        val box_1  = findViewById<TextView>(R.id.box_one)
        val box_2  = findViewById<TextView>(R.id.box_two)
        val box_3 = findViewById<TextView>(R.id.box_three)
        val box_4 = findViewById<TextView>(R.id.box_four)
        val box_5 = findViewById<TextView>(R.id.box_five)
        val redbtn = findViewById<Button>(R.id.red)
        val yellowbtn = findViewById<Button>(R.id.yellow)
        val greenbtn = findViewById<Button>(R.id.green)
        val clickableViews: List<View> = listOf(box_1, box_2, box_3, box_4, box_5, redbtn, yellowbtn, greenbtn)
        for (item in clickableViews) {
            item.setOnClickListener() {
                markColored(it)
            }

        }
    }
    private fun markColored(it: View) {
        when(it.id) {
            R.id.box_two -> it.setBackgroundColor(Color.BLUE)
            R.id.box_three -> it.setBackgroundColor(Color.MAGENTA)
            R.id.box_four -> it.setBackgroundColor(Color.BLACK)
            R.id.red -> box_three.setBackgroundResource(R.color.my_red)
            R.id.yellow -> box_four.setBackgroundResource(R.color.my_yellow)
            R.id.green -> box_five.setBackgroundResource(R.color.my_green)
            else -> it.setBackgroundColor(Color.LTGRAY)
            
        }

    }
}