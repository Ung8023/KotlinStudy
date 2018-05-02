package com.ung8023.syntax

fun main(args: Array<String>) {
    var x = 5
    while (x > 0) {
        println(x)
        x--
    }

    do {
        println(x)
        x--
    }while (x >0)
}