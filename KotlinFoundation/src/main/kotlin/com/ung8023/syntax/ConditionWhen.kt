package com.ung8023.syntax

class Player {
    enum class State {
        IDLE, BUFFERING, PLAYING, PAUSED
    }

    private val state = State.IDLE

    fun pause() {
        when(state) {
            State.BUFFERING, State.PLAYING -> doPause()
            else -> {
                //相当于default
            }
        }
    }

    fun doPause() {
        println("pause")
    }
}

fun main(args: Array<String>) {
    val x = 5
    when (x) {
        is Int -> println("Hello $x")
        in 1 .. 100 -> println("$x is in 1..100")
        !in 1 .. 100 -> println("$x is not in 1..100")
        "12".toInt() -> println("$x is 12")
    }

    val mode = when {
        args.isNotEmpty() && args[0] == "1" ->1
        else -> 0
    }
}