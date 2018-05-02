package com.ung8023.highfun.builtins

import java.io.BufferedReader
import java.io.FileReader

fun main(args: Array<String>) {
    val person = findPerson()

    findPerson()?.let { person ->
        println(person.name)
        println(person.age)
        person.work()
    }

    findPerson()?.apply {
        println(name)
        println(age)
        work()
    }

    val bt = BufferedReader(FileReader("hello.txt"))
    with(bt){
        var line: String?

        while (true) {
            line = readLine()?: break
            println(line)
        }
        close()
    }

    BufferedReader(FileReader("hello.txt")).use {
        var line: String?
        while (true) {
            line = it.readLine()?: break
            println(line)
        }
    }

    //可空类型
    println(person?.name)
    println(person?.age)
}

class Person(val name: String, val age: Int) {
    fun work() {
        println("$name is working")
    }
}

fun findPerson() : Person?{
    return null
}