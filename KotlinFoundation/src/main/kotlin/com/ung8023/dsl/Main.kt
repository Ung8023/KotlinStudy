package com.ung8023.dsl

fun main(args: Array<String>) {
    html {
        "id"("htmlId")
        "head"{
            "id"("headId")
        }
        "body"{
            "a"{
                "href"("www.ung8023.cn")
                + "网站"
            }
        }
    }.render().let (::println)
}