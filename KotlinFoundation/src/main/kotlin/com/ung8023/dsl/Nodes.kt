package com.ung8023.dsl

fun html(block: Tag.() -> Unit): Tag {
    return Tag("html").apply{this.block()}
}

class StringNode(val content: String): Node {
    override fun render(): String = content
}