package com.ung8023.datatype

var arrayOfInt: IntArray = intArrayOf(1, 3, 5, 7)
var arrayOfChar: CharArray = charArrayOf('1', '2', '3', '4')
val arrayOfStr: Array<String> = arrayOf("1", "2", "3", "4")

fun main(args: Array<String>) {
    println(arrayOfInt.size)
    for (c in arrayOfChar) {
        println(c)
    }

    println(arrayOfInt[2])

    println(arrayOfChar.joinToString(""))

    println(arrayOfChar.slice(1 .. 2))

}