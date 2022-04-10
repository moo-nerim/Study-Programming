package org.techtown.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        backBtn.setOnClickListener {
            val backIntent = Intent()
            backIntent.putExtra("data", "홍길동")

            // Intent가 이전 화면으로 전달달
           setResult(201, backIntent)

            finish() // 현재 activity 닫기 (쌓이지 않게)
        }

        // 전달된 intent
        if (intent != null) {
            processIntent(intent)
        }
    }

    fun processIntent(passedIntent: Intent) {
        val mobile = passedIntent.getStringExtra("mobile")
        if (mobile != null) {
            showToast("전달받은 값 : $mobile")
        }

        // mobile이 null이 아닌 경우 {} 실행
//        mobile?.run {
//            showToast("전달받은 값 : $mobile")
//        }
    }

    fun showToast(message:String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
    }
}