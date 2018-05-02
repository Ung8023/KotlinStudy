package com.ung8023.highfun

fun main(args: Array<String>) {
    //函数引用
    args.forEach(::println)
    val helloWorld = Hello::world
    args.filter(String::isNotEmpty)

    val pdfPrinter: PdfPrinter = PdfPrinter()
    args.forEach(pdfPrinter::println)
}

class PdfPrinter{
    fun println(any: Any) {
        kotlin.io.println(any)
    }
}

class Hello {
    fun world() {
        println("HelloWorld")
    }
}