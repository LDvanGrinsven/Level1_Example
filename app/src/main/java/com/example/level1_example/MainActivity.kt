package com.example.level1_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConfirm.setOnClickListener {
            checkAnswer()
        }
    }
    private fun checkAnswer(){
        val result = if(answer.text.toString() == getString(R.string.answer)){
            R.string.correct
        } else{
            R.string.incorrect
        }
        Toast.makeText(this, getString(result), Toast.LENGTH_LONG).show()
        question.text = getString(result)
    }
}
