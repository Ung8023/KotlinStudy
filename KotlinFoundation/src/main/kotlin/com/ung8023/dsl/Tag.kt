package com.ung8023.dsl

open class Tag(val name: String) :Node{

    val children = ArrayList<Node>()

    val properties = HashMap<String, String> ()

    operator fun String.invoke(value: String) {
        properties[this] = value
    }

    operator fun String.invoke(block: Tag.() -> Unit) {
        children.add(Tag(this).apply(block))
    }

    operator fun String.unaryPlus() {
        children.add(StringNode(this))
    }

    override fun render(): String {
        return StringBuilder().
                append("<").
                append(name).
                let {
                    stringBuilder ->
                    if (this.properties.isNotEmpty()) {
                        this.properties.forEach{
                            stringBuilder.append(" ")
                            stringBuilder.append(it.key)
                            stringBuilder.append("=\"").
                                    append(it.value).
                                    append("\" ")
                        }
                    }
                    stringBuilder
                }.
                append(">").
                let {
                    stringBuilder ->
                    children.map(Node::render).map(stringBuilder::append)
                    stringBuilder
                }.
                append("</$name>")
                .toString()
    }
}