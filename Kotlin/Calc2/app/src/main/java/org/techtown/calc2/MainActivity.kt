package org.techtown.calc2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val calc1 = Calc()
            val result = calc1.add(10,10)

            outputAdd.text = "ADD RESULT : ${result}"
        }

        button2.setOnClickListener {
            val calc1 = object: Calculator { // 한번 사용하는 객체(인터페이스)
                override fun add(a:Int, b:Int):Int {
                    return a + b
                }
            }

            val calc2 = object: CalcAdapter() { // 한번 사용하는 객체(추상클래스)
                override fun add(a:Int, b:Int):Int {
                    return a + b
                }
            }
        }

        button3.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {
                println("Clicked Button")
            }
        })

        // 람다식으로 표현
        button3.setOnClickListener({ v -> println("Clicked Button") })

        button3.setOnClickListener() { v -> println("Clicked Button") }

        button3.setOnClickListener { v -> println("Clicked Button") }

        button3.setOnClickListener { println("Clicked Button") }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}