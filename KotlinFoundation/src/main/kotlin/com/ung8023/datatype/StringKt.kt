package com.ung8023.datatype

val string: String = "Hello"
val fromChars: String = String(charArrayOf('H', 'e', 'l', 'l', 'o'))

fun main(args: Array<String>) {
    //直接比较相当于equals
    println(string == fromChars)
    //相当于比较对象
    println(string === fromChars)

    println("输出一个字符串" + string)

    val arg1: Int = 0
    val arg2: Int = 1
    println("$arg1 + $arg2 = ${arg1 + arg2}")

    //双引号中使用双引号，需要加双引号
    val sayHello: String = "Hello \"Tony\""

    //salary
    val salary: Int = 1000
    println("$$salary")
    //原始字符串
    val rawString: String = """
        adjksdjaklsd
            asf
            asfasf
            asfasf
    """
    println(rawString)

    //获取字符串长度
    println(rawString.length)
}