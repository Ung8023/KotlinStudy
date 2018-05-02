package com.ung8023.syntax

val sumLambda = {arg1: Int, arg2: Int -> arg1 + arg2}

val printHello = { println("Hello")}

fun main(args: Array<String>) {
    println(sumLambda(1, 2))
    println(sumLambda.invoke(1, 2))

    val arr = intArrayOf(1, 2, 3, 4)

    for (i in arr) {
        println(i)
    }

    arr.forEach { println(it) }
    arr.forEach ({ println(it) })
    arr.forEach ({element -> println(element) })
    arr.forEach (::println)

    args.forEach ForEach@{
        if (it == "q") return@ForEach
        println(it)
    }

    println("The end")
    println(printHello is () -> Unit)
    println(printH() is () -> Unit)
}

fun printH() = { println("asdasd")}