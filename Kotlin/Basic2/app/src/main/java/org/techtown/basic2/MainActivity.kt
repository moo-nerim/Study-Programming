package org.techtown.basic2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.techtown.basic2.constants.mBonus // 패키지 변수

class MainActivity : AppCompatActivity() {
    var first:Int = 0
    var second:Int = 0

    companion object {
        const val BONUS = 100 // 상수
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton.setOnClickListener {
            val firstStr = input1.text.toString()
            val secondStr = input2.text.toString()

            first = firstStr.toInt() // str -> Int로 형변환
            second = secondStr.toInt()

            val result = first + second + MainActivity.BONUS + mBonus // 숫자 연산산
            output.text = "결과 : $result"

            if(result == 20){
                output.text = "result는 20입니다."
            }
            if (firstStr == "10"){ // kotlin에서는 문자열 비교도 "==" 사용
                output.append("\n첫번째 입력된 값이 10입니다.")
            }
            val input1:Any = "Hi!"
            val input2:Any = 10

            if (input1 is String){ // is -> 자료형 확인
                val output1:String = input1 as String // as <자료형> -> 크기가 바뀜
                output.setText("input1은 String 입니다.")
            }

            val output2:String? = input1 as String?
        }
    }
}