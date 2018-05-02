package com.ung8023.datatype

fun getName(): String {
    return "asd"
}

fun getNullableName(): String? {
    return null
}

fun main(args: Array<String>) {
    if (getName() != null) {
        println(getName().length)
    }

    val name = getNullableName()
    if (name == null) {
        println("为 null")
    }else{
        println(name)
    }

    println(name?.length)

    val name2: String = getNullableName() ?: return
    println(name2.length)

    val value: String? = "asdasd"
    //确定不是空，使用!! 告诉编译器不为空
    println(value!!.length)
}