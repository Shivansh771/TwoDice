package com.example.dice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val ran1: Int=kotlin.random.Random.nextInt(1,7)
            val ran2: Int=kotlin.random.Random.nextInt(1,7)
            val die1= findViewById<ImageView>(R.id.imageView)
            val die2=findViewById<ImageView>(R.id.imageView2)
            val img= intArrayOf(R.drawable.dice_six_faces_one,R.drawable.dice_six_faces_two,R.drawable.dice_six_faces_three,R.drawable.dice_six_faces_four,R.drawable.dice_six_faces_five,R.drawable.dice_six_faces_six)
            die1.background = ContextCompat.getDrawable(applicationContext,img[ran1-1])
            die2.background = ContextCompat.getDrawable(applicationContext,img[ran2-1])
        }
    }

}


