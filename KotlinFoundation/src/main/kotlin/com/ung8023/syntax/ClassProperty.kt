package com.ung8023.syntax

class Girl(var kind: String, var look: String) {
    fun song(music: String) {
        println("Girl 正在唱歌: $music")
    }

    fun dance(dance: String) {
        println("Girl 正在跳舞: $dance")
    }
}

fun main(args: Array<String>) {
    val m = Girl("温柔", "广场舞")
    m.song("abcdefg")
    m.dance("天鹅")
}