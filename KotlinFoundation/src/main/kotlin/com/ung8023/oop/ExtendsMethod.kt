package com.ung8023.oop

fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        //.........
    }

    println("abc ".multiply(10))
    println("abc " * 10)

    val s: String = "aaa"
    s.b =100
    println(s.b)
}

fun String.multiply(int: Int): String {
    val stringBuilder = StringBuilder()
    for (i in 0 until  int) {
        stringBuilder.append(this)
    }
    return  stringBuilder.toString()
}

operator fun String.times(int: Int): String {
    val stringBuilder = StringBuilder()
    for (i in 0 until  int) {
        stringBuilder.append(this)
    }
    return  stringBuilder.toString()
}

val String.s: String
    get() = "123"

var String.b: Int
    set(value){}
    get() = 5