package org.techtown.calc2

abstract class Calc2 : CalcAdapter() { // 추상클래스

    override fun add(a:Int, b:Int):Int {
        return a + b
    }
}