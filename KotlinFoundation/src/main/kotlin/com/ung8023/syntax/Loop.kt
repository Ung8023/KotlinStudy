package com.ung8023.syntax

fun main(args: Array<String>) {
    val arr = intArrayOf(1, 2, 3, 4, 5)

    for (a in arr) {
        println(a)
    }

    for ((index,value) in arr.withIndex()) {
        println("$index --> $value")
    }

    for (indexedValue in arr.withIndex()) {
        println("${indexedValue.index} --> ${indexedValue.value}")
    }

    val list = MyList()
    list.add(1)
    list.add(2)
    list.add(3)

    for (i in list) {
        println(i)
    }
}

class MyIterator(val iterable: Iterator<Int>) {
    operator fun next() = iterable.next()
    operator fun hasNext(): Boolean =  iterable.hasNext()
}

class MyList {
    private val list = ArrayList<Int>()

    fun add(int: Int) {
        list.add(int)
    }

    fun remove(int : Int) {
        list.remove(int)
    }

    operator fun iterator() : MyIterator {
        return MyIterator(list.iterator())
    }
}

