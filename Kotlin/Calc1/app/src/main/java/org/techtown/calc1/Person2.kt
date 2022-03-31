package org.techtown.calc1

class Person2 {

    var name:String? = null
    var age:Int? = null
    lateinit var address:String

    // 생성자
    constructor(){
        println("첫번째 생성자 호출출")
   }

    constructor(name:String?){
        println("두번째 생성자 호출출")

        this.name = name
    }

    constructor(name:String?, age:Int?, address:String){
        println("세번째 생성자 호출출")

        this.name = name
        this.age = age
        this.address = address
    }
}