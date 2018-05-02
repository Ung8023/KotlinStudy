package com.ung8023.oop.delegate

import kotlin.reflect.KProperty

class Delegate {
    val hello by lazy {
        "HelloWorld"
    }

    val hello2 by X()

    var hello3 by X()
}

class X {
    private var value: String? = null

    operator fun getValue(thisRet: Any?, property: KProperty<*>): String {
        println("getValue $thisRet -> ${property.name}")
        return value?:""
    }

    operator fun setValue(thisRet: Any?, property: KProperty<*>, value: String) {
        println("setValue $thisRet -> ${property.name} = $value")
        this.value = value
    }
}

fun main(args: Array<String>) {
    val deleagte = Delegate()
    println(deleagte.hello)
    println(deleagte.hello2)
    println(deleagte.hello3)

    deleagte.hello3 = "hello3"
    println(deleagte.hello3)
}