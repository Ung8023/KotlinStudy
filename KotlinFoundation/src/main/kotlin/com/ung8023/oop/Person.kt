package com.ung8023.oop

/**
 默认的类和方法是final的
类如果想要被继承，必须是open
 方法如果想重写，必须是open

 抽象类和抽象方法可以继承和重写，接口以及接口方法，不需要open


 */

abstract class Person(var age: Int) {
    open fun work() {}
}

class Coder(age: Int) : Person(age) {
    override fun work() {
        super.work()
        println("我在写代码")
    }
}

class Doctor(age: Int) : Person(age) {
    override fun work() {
        super.work()
        println("我在看病")
    }
}

fun main(args: Array<String>) {
    val coder: Person = Coder(1)
    val doctor: Person = Doctor(2)

    coder.work()
    doctor.work()

    coder.age
}