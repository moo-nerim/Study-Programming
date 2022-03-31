package org.techtown.calc1

class Person(var name:String?) { // 변수로 자동 추가됨

    var age:Int? = null
    lateinit var address:String // lateinit var -> 나중에 값을 초기화

    // 기본 생성자
    init {
        println("생성자 호출")
    }
}