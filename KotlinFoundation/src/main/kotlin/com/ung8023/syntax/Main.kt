package com.ung8023.syntax

//非编译器常量，通过const来定义编译器常量
val FINAL_HELLO_WORD: String = "HelloWorld"
var helloWorld: String = "HelloWorld"
val FINAL_HELLO_A = "HelloA"

fun main(args: Array<String>) {
    helloWorld = "HelloWord"
    println(FINAL_HELLO_A)
}