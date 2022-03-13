package org.techtown.basic

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // findView와 같이 버튼을 찾는 과정 필요 X, 바로 ID 사용
        // 사용자 입력 받아 출력
        login.setOnClickListener {
            val inputId = inputId.text.toString() // 입력상자의 글자 가져오기
            val inputPw = inputPw.text.toString()
            outputId.text = "결과 : $inputId" // setText()와 같은 역할
            outputPw.text = "비밀번호 : $inputPw"

            Toast.makeText(applicationContext,"로그인 성공", Toast.LENGTH_LONG).show()
        }
    }
}