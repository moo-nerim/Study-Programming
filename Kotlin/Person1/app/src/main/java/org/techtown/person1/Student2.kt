package org.techtown.person1

class Student2 : Person {

    constructor(alias:String?, age:Int?, address:String?):super(alias) { // super-> 부모 class 가리킴
        println("Student2 생성자 호출됨")

        this.age = age
        this.address = address
    }
}