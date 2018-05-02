package com.ung8023.oop.dataclass

import com.ung8023.oop.annotations.Poko

/**
 * data Class 是final的，没有默认的无参构造方法
 * allopen， noarg  // 将data class 变为可继承的，并且有一个无参构造方法
 */
@Poko
data class Country(val id: Int , val name: String)

class DataA(val a: Int) {}

class ComponentX {
    operator fun component1() : String {
        return "hello"
    }
    operator fun component2() : String {
        return "hello2"
    }
    operator fun component3() : String {
        return "hello3"
    }
    operator fun component4() : Int {
        return 123
    }

}

fun main(args: Array<String>) {
    val china = Country(0, "中国")
    println(china)
    println(china.component1())
    println(china.component2())

    val (id, name) = china
    println(id)
    println(name)

    val componentX = ComponentX()
    val (a, b ,c ,d) = componentX
    println("$a $b $c $d")
}