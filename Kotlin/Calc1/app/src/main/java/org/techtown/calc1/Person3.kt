package org.techtown.calc1

class Person3(var name:String?) {

    var age:Int? = null
    lateinit var address:String

    constructor(name:String?, age:Int?):this(name){ // this(name) -> 기본 생성자 함수 호출

    }
}