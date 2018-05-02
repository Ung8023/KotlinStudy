package com.ung8023.oop.enums

enum class LogLevel {
    VERBOSE, DEBUG, INFO, WARN, ERROR, ASSERT
}
enum class LogLevel1(val id: Int) {
    VERBOSE(0), DEBUG(1), INFO(2), WARN(3), ERROR(4), ASSERT(5); // 必须写;

    fun getTag(): String{
        return "$id, $name"
    }

}
class LogLevel2 protected constructor() {
    companion object {
        val VERBOSE = LogLevel2()
        val DEBUG = LogLevel2()
        val INFO = LogLevel2()
        val WARN = LogLevel2()
        val ERROR = LogLevel2()
        val ASSERT = LogLevel2()
    }

}

fun main(args: Array<String>) {
    println(LogLevel.DEBUG.ordinal)
    LogLevel.values().map(::println)
}