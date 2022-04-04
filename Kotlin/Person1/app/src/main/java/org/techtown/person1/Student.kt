package org.techtown.person1

import android.widget.TextView

class Student(override var name:String?) : Person(name){ // 상속 -> :

    constructor(name:String?, age:Int?, address:String?):this(name) {
        println("Student 생성자 호출됨")

        this.age = age
        this.address = address
    }

    override fun walk(output: TextView) { // override -> 다시 재정의
        super.walk(output) // 부모의 함수도 호출
        output.text = "Student walk"
    }

}