package com.ung8023.highfun.compose

import com.ung8023.highfun.closure.add

/***
 * 函数复合
 */

// 求 f(g(x)) m(x) = f(g(x))

val add5 = {i: Int -> i +5}
val multiplyBy2 = {i : Int -> i * 2}

fun main(args: Array<String>) {
    println(multiplyBy2(add5(8)))

    val add5AndThenMultiplyBy2 = add5 andThen multiplyBy2

    val add5ComposeMultiplyBy2 = add5 compose  multiplyBy2

    println(add5AndThenMultiplyBy2(8))
    println(add5ComposeMultiplyBy2(8))
}

//函数的复合
infix fun <P1, P2, R> Function1<P1, P2>.andThen(function1: Function1<P2, R>) : Function1<P1, R> {
    return fun (p1: P1): R {
        return function1.invoke(this.invoke(p1))
    }
}

infix fun <P1, P2, R> Function1<P2, R>.compose(function: Function1<P1, P2>): Function1<P1, R> {
    return fun(p1: P1): R {
        return this.invoke(function.invoke(p1))
    }
}