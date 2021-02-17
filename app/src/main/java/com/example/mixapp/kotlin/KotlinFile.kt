package com.example.mixapp.kotlin
import kotlin.random.Random
import android.widget.TextView

class KotlinFile{
    fun countNumbers(myTextView: TextView){
        val a: Int = Random.nextInt(0, 100)
        val b: Int = Random.nextInt(0, 100)
        val myText: String = "${a}+${b} = ${a+b}"
        myTextView.text=myText
    }
}