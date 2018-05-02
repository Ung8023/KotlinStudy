package com.ung8023.datatype

val range: IntRange = 0..1234 //[0 .. 1024]
val rangeUntil: IntRange = 0 until 1024 // [0 ... 1024)

val empty: IntRange = 0 .. -1

fun main(args: Array<String>) {
    println(empty.isEmpty())
    println(empty.contains(500))
    println(50 in range)

    for (i in range) {
        print("$i ,")
    }
}