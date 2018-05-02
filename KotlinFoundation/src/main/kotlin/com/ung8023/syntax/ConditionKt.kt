package com.ung8023.syntax

private const val USERNAME = "kotlin"
private const val PASSWORD = "123456"

private const val ADMIN_USER = "admin"
private const val ADMIN_PASSWD = "admin"

private const val DEBUG = 1
private const val USER = 0

fun main(args: Array<String>) {

    val mode = if (args.isNotEmpty() && args[0] == "1") {
        DEBUG
    }else{
        USER
    }
    /*
    var mode = USER
    if (args.isNotEmpty() && args[0] == "1") {
        mode = DEBUG
    }
    */
    println("请输入用户名:")
    val username = readLine()

    println("请输入密码:")
    val password = readLine()

    if (mode  == DEBUG && username == ADMIN_USER && password == ADMIN_PASSWD) {
        println("管理员登陆成功")
    } else if (username == USERNAME && PASSWORD == password) {
        println("登陆成功")
    }else{
        println("登陆失败")
    }
}

