package org.techtown.inflater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            // inflate => part1 파일을 container에 붙여줌
            layoutInflater.inflate(R.layout.part1, container, true)
        }
    }
}