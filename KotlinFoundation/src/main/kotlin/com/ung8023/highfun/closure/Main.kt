package com.ung8023.highfun.closure

val string = "HelloWorld"

fun makeFun(): () -> Unit {
    var count = 0
    return fun() {
        println(++ count)
    }
}

fun fibbonacci(): () -> Long {
    var first: Long = 0L
    var second: Long = 1L

    return fun(): Long {
        val result = second
        second += first
        first = second - first
        return result
    }
}

fun fibbonacci2(): Iterable<Long> {
    var first: Long = 0L
    var second: Long = 1L

    return Iterable {
        object : LongIterator() {
            override fun hasNext(): Boolean = true

            override fun nextLong(): Long {
                val result = second
                second += first
                first = second - first
                return result
            }
        }
    }
}

fun main(args: Array<String>) {
    val x = makeFun()
    x()
    x()
    x()
    x()
    x()
    println("fibbonacci")

    val y = fibbonacci()
    println(y())
    println(y())
    println(y())
    println(y())
    println(y())
    println(y())

    for (i in fibbonacci2()) {
        if (i > 100) break
        println(i)
    }

    val add5 = add(5)
    println(add5(2))
}

fun  add(x: Int) = fun(y: Int) = x + y

//等价

fun add2(x: Int): (Int) -> Int {
    return fun (y: Int) : Int {
        return x + y
    }
}