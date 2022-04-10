package org.techtown.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.edit
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showBtn.setOnClickListener {
            // 새로운 Activity 띄우기
            val showIntent = Intent(this, MenuActivity::class.java) // 시스템으로 전달
            showIntent.putExtra("mobile", "010-1234-5678") // 키, 값

            startActivityForResult(showIntent, 101) // 응답을 받아서 처리하기 위해
        }

        showToast("onCreate 호출됨")

        saveBtn.setOnClickListener {
            val input = input.text.toString()

            // 데이터 저장
            val pref = getSharedPreferences("pref", MODE_PRIVATE)
//            pref.edit().putString("userName", input).commit()

            pref.edit {
                putString("userName", input)
                commit()
            }
        }

        getBtn.setOnClickListener {
            // 데이터 가져오기
            val pref = getSharedPreferences("pref", MODE_PRIVATE)
            val userName = pref.getString("userName", "")
            input.setText(userName)
        }
    }

    override fun onStart() {
        super.onStart()

        showToast("onStart 호출됨")
    }

    override fun onResume() {
        super.onResume()

        showToast("onResume 호출됨")
    }

    override fun onPause() {
        super.onPause()

        showToast("onPause 호출됨")
    }

    override fun onDestroy() {
        super.onDestroy()

        showToast("onDestroy 호출됨")
    }

    // on -> 실행될 시점에 자동 실행됨 (callback 함수)
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when(requestCode) {
            101 -> {
                showToast("Menu Activity Response : $requestCode, $resultCode")

                if (data != null) {
                    processIntent(data)
                }
            }
        }
    }

    fun processIntent(passedIntent:Intent) {
        val data = passedIntent.getStringExtra("data")
        if (data != null) {
            showToast("메뉴 액티비티로부터 전달받은 데이터 : $data")
        }
    }

    fun showToast(message:String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
    }
}