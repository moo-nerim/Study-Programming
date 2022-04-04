package org.techtown.person1

import android.widget.TextView

open class Person(open var name:String?) { // open -> 상속해도 됨

    var age:Int? = null
    var address:String? = null

    constructor(name:String?, age:Int?, address:String?):this(name){ // this(name) -> 이미 기본생성자 사용중이기 때문
        println("Person의 생성자 호출됨")

        this.age = age
        this.address = address

    }

    // open -> 메서드 재정의
    open fun walk(output: TextView) { // TextView 전달, UI 객체 전달 가능
        output.text = "Human walk"
    }
}