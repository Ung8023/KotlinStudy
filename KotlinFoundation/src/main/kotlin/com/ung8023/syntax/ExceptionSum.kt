package com.ung8023.syntax

fun main(args: Array<String>) {
    try {
        val arg1 = args[0].toInt()
        val arg2 = args[1].toInt()
        println("$arg1 + $arg2 = ${arg1 + arg2}")
    }catch (e: NumberFormatException) {
        println("请输入整数!")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("请输入两个以上整数")
    }catch (e: Exception) {
        println("程序出现了未知异常, ${e.message}")
    }finally {
        println("3Q Very Much")
    }


    //异常表达式
    val result = try {
        args[0].toInt() / args[1].toInt()
    }catch (e: Exception) {
        e.printStackTrace()
        -1
    }finally {
        2
    }
    println(result)
}