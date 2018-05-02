package com.ung8023.oop

class House

class Flower

class Countyard {
    private val house: House = House()

    private val flower: Flower = Flower()
}

class forbiddenCity{
    //默认为public
    val housers = arrayOf(House(), House())

    val flowers = arrayOf(Flower(), Flower())

    //子类可见
    //protected

    //模块内可见
    //internal


}
fun main(args: Array<String>) {
    val countryard = Countyard()

    println(countryard)
}