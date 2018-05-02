package com.ung8023.syntax

fun main(args: Array<String>) {
    val arr = intArrayOf(1, 5, 7, 8)

    for (a in arr) {
        if (a == 1) {
            continue
        }
        if (a == 7) {
            break
        }
    }
}