package com.ung8023.syntax

fun main(args: Array<String>) {
    while (true) {
        try {
            println("请输入算式，例如3 + 4")
            val input = readLine() ?: break
            val splits = input.trim().split(" ")
            val arg1 = splits[0].toDouble()
            val op = splits[1]
            val arg2 = splits[2].toDouble()
            println("$arg1 $op $arg2 = ${Operator(op).apply(arg1, arg2)}")
        }catch (e: NumberFormatException) {
            println("您确定输入的数字吗")
        }catch (e: Exception)  {
            println("人品有问题")
        }
        println("再来一发?[Y]")
        val cmd = readLine()
        if (cmd == null || cmd.toLowerCase() != "y") {
            break
        }

    }

    println("感谢使用")
}

class Operator(op: String) {
    val opFun: (left:Double , right: Double) -> Double

    init {
        opFun = when(op){
            "+" -> {l,r -> l + r}
            "-" -> {l,r -> l - r}
            "*" -> {l,r -> l * r}
            "/" -> {l,r -> l / r}
            "%" -> {l,r -> l % r}
            else -> {
                throw UnsupportedOperationException(op)
            }
        }
    }

    fun apply(left: Double, right: Double): Double {
        return opFun(left, right)
    }
}