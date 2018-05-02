package com.ung8023.highfun.currying

import java.io.OutputStream
import java.nio.charset.Charset

/**
 * 科理化
 */
/*
fun hello(x: String, y: Int, z: Double) : Boolean {
    return true
}

fun curriedHello(x: String): (y: Int) -> (z: Double) -> Boolean{

}
 */

fun log(tag: String, target: OutputStream, message: Any?) {
    target.write("[$tag] $message \n".toByteArray())
}

/*
科理化版本
fun log(tag: String)
    = fun (target: OutputStream)
    = fun (message: Any?)
    = target.write("[$tag] $message \n".toByteArray())
*/

fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.curried()
        = fun (p1: P1) = fun (p2: P2) = fun (p3: P3) = this(p1, p2, p3)

fun main(args: Array<String>) {
    log("funny", System.out, "HelloWorld")
//    log("funny")(System.out)("HelloWorld")
    ::log.curried()("funny")(System.out)("HelloWorld")

    val consoleLogWitTag = (::log.curried())("funny")(System.out)

    consoleLogWitTag("Hello,aaaaaa")

    //偏函数，绑定第二个参数
    val bytes = "我是中国人".toByteArray(charset("GBK"))
    val makeStringFromGbkBytes1 = makeStringFromGbkBytes(bytes)

}

val makeString = fun(byteArray: ByteArray, charset: Charset): String {
    return String(byteArray, charset)
}

val makeStringFromGbkBytes = makeString.partial2(charset("GBK"))

fun <P1, P2, R> Function2<P1, P2, R>.partial2(p2: P2) = fun(p1: P1) = this (p1, p2)
fun <P1, P2, R> Function2<P1, P2, R>.partial1(p1: P1) = fun(p2: P2) = this (p1, p2)