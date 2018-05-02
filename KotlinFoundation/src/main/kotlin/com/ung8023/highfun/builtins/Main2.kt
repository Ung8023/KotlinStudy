package com.ung8023.highfun.builtins

fun main(args: Array<String>) {
    val list = listOf(
            1..20,
            2..5,
            100..232
    )

    //求所有整数的和
    val flatMap = list.flatMap { it }

    flatMap.forEach(::println)

    //acc 是上一次的运算结果，i 是当前数
    println(flatMap.reduce({acc, i -> acc + i}))

    (0..6).map(::factorial).forEach(::println)
    println((0..6).map(::factorial).fold(5){
        acc, i -> acc + i
    })

    //带初始值的叠加
    println((0..6).map(::factorial).fold(StringBuilder()){
        acc, i -> acc.append(i).append(", ")
    })

    //遇到第一个不符合条件的停止
    println((0..6).map(::factorial).takeWhile { it %2 ==1 })

    println((0..6).joinToString("-"))
}

fun factorial(n: Int): Int {
    if (n==0) return 1
    return (1..n).reduce({acc, i -> acc*i})
}