package com.ung8023.syntax

fun main(args: Array<String>) {
    hello2(1, 2, 3, 4, 5, string = "123")

    val array = intArrayOf(1, 2, 3, 4, 5)
    //* 将数组展开传递，只支持array，不能重载
    hello2(*array, string = "Hello")

    hello3(ints = *array, string = "Hello")
}

fun hello(vararg ints: Int) {
    ints.forEach(:: println)
}

//变长参数可以在函数的任意位置
fun hello2(vararg ints: Int, string: String) {
    ints.forEach(:: println)
}

fun hello3(double: Double = 3.0, vararg ints: Int, string: String) {
    ints.forEach(:: println)
}