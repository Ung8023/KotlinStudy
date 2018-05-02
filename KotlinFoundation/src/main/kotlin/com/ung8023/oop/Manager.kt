package com.ung8023.oop

class Manager: Driver, Writer {
    override fun write() {
    }

    override fun drive() {
    }

}

/*
class SeniorManager(driver: Driver, writer: Writer) : Driver, Writer {
    override fun drive() {
    }

    override fun write() {
    }
}

*/

//接口代理
class SeniorManager(driver: Driver, writer: Writer) : Driver by driver, Writer by writer

class CarDeiver: Driver {
    override fun drive() {
        println("我是司机，我开车")
    }
}

class PPTWriter: Writer {
    override fun write() {
        println("我是写手，我写PPT")
    }
}

fun main(args: Array<String>) {
    val driver = CarDeiver()
    val writer = PPTWriter()
    val seniorManager = SeniorManager(driver, writer)
    seniorManager.write()
    seniorManager.drive()
}

interface Driver{
    fun drive()
}

interface Writer{
    fun write()
}