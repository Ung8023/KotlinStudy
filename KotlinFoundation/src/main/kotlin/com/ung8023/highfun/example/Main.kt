package com.ung8023.highfun.example

import java.io.File

/**
    统计某一个文件中字符出现的个数
 */

fun main(args: Array<String>) {
    val map = HashMap<Char, Int>()
    File("build.gradle").readText().toCharArray().filterNot(Char::isWhitespace).groupBy { it }.map {
        it.key to it.value.size
    }.forEach  (::println)

    //等价于上面
    File("build.gradle").readText().toCharArray().filterNot(Char::isWhitespace).forEach{
       val count = map[it]
        if (count == null) map[it] =1
        else map[it] = count + 1
    }

    map.forEach(::println)
}