package com.ung8023.syntax.member

class X

class A {

    //如果是基本类型，可以初始化为默认值
    var a = 0
    //延时初始化,需要妥善处理
    lateinit var c: String
    lateinit var d: X

    var cc:String? = null

    //val 不能用lateinit,  使用Delegate, 只在调用时初始化
    val e : X by lazy {
        println("init x")
        X()
    }

    var b = 0
        get() {
            println("get kt b")
            return field
        }
       set(value) {
            field = value
        }
    /*
        //如果使用默认的set与get也想控制权限
        protected get
        protected set
     */

}

fun main(args: Array<String>) {
    println("start")
    val a = A()
    println("init A")
    println(a.e)
    println(a.d)

    println(a.cc!!.length)
}