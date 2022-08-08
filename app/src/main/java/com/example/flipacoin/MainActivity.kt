package com.example.flipacoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var flipButton: Button = findViewById(R.id.button)
        flipButton.setOnClickListener {
            flipCoin()
        }
    }

    private fun flipCoin() {
        val num = coinFlip(1)
        val cf=num.flip()
        val resultTextView: TextView=findViewById(R.id.textView)
        if(cf==0)
        {
            resultTextView.text="Head"
        }
        else
        {
            resultTextView.text="Tail"
        }

    }
}

class coinFlip(private val Value: Int) {
    fun flip(): Int {
        return(0..Value).random()
    }
}
