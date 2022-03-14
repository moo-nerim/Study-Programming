package org.techtown.function

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            show("HI!")
        }

        addButton.setOnClickListener {
            val first = input1.text.toString().toInt()
            val second = input2.text.toString().toInt()

            val result = add(first, second)
            output.text = "Add result : $result"
        }

        addButton2.setOnClickListener {
            val result = add(getFirst(), getSecond())
            output.text = "Add result : $result"
        }
    }

    fun getFirst():Int {
        val first = input1.text.toString().toInt()
        return first
    }

    fun getSecond():Int {
        val second = input2.text.toString().toInt()
        return second
    }

    fun add(a:Int, b:Int) : Int {
        return a + b
    }

    fun show(message:String) {
        println("PUSH BUTTON : $message")
    }
}