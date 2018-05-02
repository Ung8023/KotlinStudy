package com.ung8023.oop

fun main(args: Array<String>) {
//    val a = minOf(args[0].toInt(), args[1].toInt())

    val latitude = Latitude.idDouble(1.2)

    val latitude2 = Latitude.ofLatitude(latitude)

    println(Latitude.TAG)
}

class Latitude private constructor(val vlue: Double) {
    //伴生对象，相当于java的静态方法
    companion object {
        @JvmStatic
        fun idDouble(double: Double): Latitude {
            return Latitude(double)
        }

        @JvmStatic
        fun ofLatitude(latitude: Latitude): Latitude {
            return Latitude(latitude.vlue)
        }

        @JvmField
        val TAG: String = "Latitude"
    }
}