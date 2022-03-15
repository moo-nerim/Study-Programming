package org.techtown.function2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            val addFunc = {a:Int, b:Int -> a+b} // 람다식
            val result = calc(10,10, addFunc)

            val addFunc2 = getOperator("add")
            val result2 = calc(20, 20, addFunc2!!)

            output.text = "결과 : $result"

            val multiply = {a:Int, b:Int -> a * b}
            val multiply2:(Int, Int) -> Int = {a, b -> a * b} // a, b 자료형은 앞을 보고 추론가능

            var show1 = {println("show 함수 호출됨")}
            var show2:()->Unit = {println("show 함수 호출됨")}

            val sum = fun(a:Int, b:Int):Int {
                return a + b
            }
            doAction(fun ():Int {
                println("전달된 함수 호출됨")
                return 10
            })

            doAction {
                println("전달된 함수 호출됨")
                10 // 반환식
            }

            doAction {
                println("전달된 함수 호출됨")
                return@doAction 10 // 반환식
            }
        }
    }

    fun doAction(action:()->Int) {
        println("doAction 호출됨")
        val result = action()
    }

    fun show():Unit { // return이 없는 경우 Unit (생략가능)
        println("show 함수 호출됨")
    }

    fun getOperator(name:String):((Int, Int) -> Int)? { // 함수를 return
        var oper:((Int, Int) -> Int)? = null
        if (name == "add") {
            oper = {a:Int, b:Int -> a + b}
        } else if (name == "subtract"){
            oper = {a:Int, b:Int -> a - b}
        }
        return oper
    }

    fun calc(first:Int, second:Int, oper:(Int, Int)->Int) : Int{
       return oper(first, second)
    }
}