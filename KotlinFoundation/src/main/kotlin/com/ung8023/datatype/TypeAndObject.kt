package com.ung8023.datatype
/*
class Girl(var kind: String,  var look: String, var voice: String) {
    init {
        println("妹子性格: $kind , 长相 : $look ,  声音: $voice")
    }
}

class Boy(var kind: String,  var look: String, var voice: String) {
    init {
        println("帅哥性格: $kind , 长相 : $look ,  声音: $voice")
    }
}
*/

class Girl(kind: String,  look: String, voice: String) : Person(kind, look, voice)

class Boy(kind: String,  look: String, voice: String) : Person(kind, look, voice)

open class Person(var kind: String,  var look: String, var voice: String) {
    init {
        println("${this.javaClass.simpleName}性格: $kind , 长相 : $look ,  声音: $voice")
    }
}

fun main(args: Array<String>) {
    val aGirl: Girl = Girl("好", "好", "好听")
    val aBoy: Boy = Boy("a", "b", "c")

    println(aGirl is Person)
}