package com.ung8023.datatype.autocast

fun main(args: Array<String>) {
    val p: ParentJ = ChildJ()
    if (p is ChildJ) {
        println(p.name)
    }

    val str: String? = "Hello"
    if (str != null) {
        println(str.length)
    }

    val child: ChildJ = p as ChildJ
    val p2: ParentJ = ParentJ()

    val child2: ChildJ? = p2 as? ChildJ
    println(child2?.name)
}