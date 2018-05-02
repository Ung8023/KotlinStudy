package com.ung8023.oop

class Overload {
    fun a(): Int{
        return 0
    }

    fun a(int: Int): Int {
        return int
    }
}

class DefaultParam {
    /*
    fun a(): Int{
        return 0
    }
    */
    //在java调用此方法时，必须加参数，如果想让java也能直接调用，需要添加@JvmOverloads
    fun a(int: Int = 0): Int {
        return int
    }
}

fun main(args: Array<String>) {
    val integerList = ArrayList<Int>()
    integerList.add(12)
    integerList.add(2)
    integerList.add(122)
    integerList.add(13)
    integerList.add(5)
    integerList.add(12)

    println(integerList)
    integerList.removeAt(2)
    integerList.remove(5)
    println(integerList)
}