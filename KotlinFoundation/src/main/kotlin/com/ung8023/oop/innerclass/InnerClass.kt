package com.ung8023.oop.innerclass

class Outter {

    val a: Int = 0


    //默认为静态内部类
    //逻辑上不相关，不依赖于外部类
    class Inner{

    }
    //指定为非静态内部类,使用inner
    //内部类必须依赖外部类
    inner class Inner2{

        val a: Int = 5
        fun hello() {
            println(this@Outter.a)
        }
    }

}

interface OnClickListener{
    fun onClick()
}

class View {
    var onClickListener: OnClickListener? = null
}

fun main(args: Array<String>) {
    val inner = Outter.Inner()

    val view = View()
    view.onClickListener = object : OnClickListener{
        override fun onClick() {
            println("Click")
        }
    }


}