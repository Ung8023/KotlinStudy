package com.ung8023.syntax

class Complex(var real: Double, var imaginary: Double) {
    operator fun plus(other: Complex): Complex {
        return Complex(real+ other.real, imaginary + other.imaginary)
    }

    operator fun plus(other: Int): Complex {
        return Complex(real + other, imaginary)
    }

    override fun toString(): String {
        return "$real + ${imaginary}i"
    }
}

class Book  {
    infix fun on(desk: Desk) : Boolean{
        return false
    }
}

class Desk

fun main(args: Array<String>) {
    var c1:  Complex = Complex(3.0, 4.0)
    var c2:  Complex = Complex(2.0, 7.5)
    println(c1  + c2)
    println(c1.plus(c2))

    println(c1 +1)

    if (Book() on Desk()) {  // 在DSL中使用较多
        println("aaaa")
    }
}