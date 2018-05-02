package com.ung8023.syntax

fun main(args: Array<String>) {
    val arg1: Int = 10
    val arg2: Int = 20
    println("$arg1 + $arg2 =  ${sum(arg1, arg2)}")
    println(int2Long(12))
}

fun sum(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}

fun sum2(arg1: Int, arg2: Int) =  arg1 + arg2

var int2Long = fun (x: Int): Long = x.toLong()