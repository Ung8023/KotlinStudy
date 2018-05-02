package com.ung8023.highfun.builtins

fun main(args: Array<String>) {
    val list = listOf(1, 3, 54, 6 ,  7)

    val newList = ArrayList<Int>()

    list.forEach {
        val newElement = it * 2 + 3
        newList.add(newElement)
    }

    newList.forEach(::println)

    val newList2 = list.map {
        it * 2 + 3
    }
    newList2.forEach(::println)

    val newList3 = list.map(Int::toDouble)
    newList3.forEach(::println)

    val list2 = listOf(
            1..20,
            2..5,
            100..232
    )
    val flatList = list2.flatMap {
        it
    }
    /*
    val flatList2 = list2.flatMap {
        intRange ->
        intRange.map {
            intElement -> "No. $intElement"
        }
    }
*/
    val flatList2 = list2.flatMap {
        it.map {
            "No. $it"
        }
    }

    flatList.forEach(::println)
    flatList2.forEach(::println)

}