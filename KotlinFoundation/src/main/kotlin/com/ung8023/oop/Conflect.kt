package com.ung8023.oop

abstract class A {
    open fun x(): Int = 5
}

interface B{
    fun x(): Int = 0
}

interface C {
    fun x() : Int = 1
}

//解决冲突，需要函数名，参数列表，返回值一致
class D(var y:Int ): A(), B, C {
    override fun x(): Int {
        println("aaaaaaaaaa")
        if (y > 0) {
            return y
        }else if (y > -100) {
            return super<B>.x()
        }else if (y < -200){
            return super<C>.x()
        }else{
            return super<A>.x()
        }
    }
}

fun main(args: Array<String>) {
    println(D(1).x())
    println(D(-12).x())
    println(D(-110).x())
    println(D(-210).x())
}