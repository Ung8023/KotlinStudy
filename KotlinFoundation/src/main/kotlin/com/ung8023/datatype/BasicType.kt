package com.ung8023.datatype


//定义一个Boolean型变量
val aBoolean: Boolean = true
val bBoolean: Boolean = false

val anInt: Int = 8
val anotherInt: Int = 0xff
val moreInt: Int = 0b00001001

val maxInt: Int = Int.MAX_VALUE
val minInt: Int = Int.MIN_VALUE

val aLong : Long = 12312213123
val another: Long = 123
val maxLong: Long = Long.MAX_VALUE
val minLong: Long = Long.MIN_VALUE

val aFloat: Float = 2.0F
val anotherFloat: Float = 3.0f
val minFloat: Float = Float.MIN_VALUE
val maxFloat: Float = Float.MAX_VALUE

val aDouble: Double = 3.0
val bDouble: Double = 3.1415925
val minDouble: Double = - Double.MAX_VALUE
val maxDouble: Double = Double.MAX_VALUE

val aShort: Short = 127
val maxShort: Short = Short.MAX_VALUE
val minShort: Short = Short.MIN_VALUE

val maxByte: Byte = Byte.MAX_VALUE
val minByte: Byte = Byte.MIN_VALUE

fun main(args: Array<String>) {
    println(anotherInt)
    println(moreInt)

    println(maxInt)
    println(Math.pow(2.0, 31.0) - 1)
    println(minInt)
    println(-Math.pow(2.0, 31.0) -1)

    println(maxLong)
    println(Math.pow(2.0, 64.0) - 1)
    println(minLong)
    println(-Math.pow(2.0, 64.0) -1)

    println(aFloat)
    println(anotherFloat)
    println(minFloat)
    println(maxFloat)

    println(0.0F/0.0F == Float.NaN)

    println(maxDouble)
    println(minDouble)

    println(maxByte)
    println(minByte)
}