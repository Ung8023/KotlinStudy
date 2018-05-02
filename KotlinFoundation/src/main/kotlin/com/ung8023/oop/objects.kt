package com.ung8023.oop

class DeviceDriver

interface OnExternalDriverMoutListener {
    fun onMount(driver: DeviceDriver)

    fun onUnMount(driver: DeviceDriver)
}

abstract class Player

/**
 * 只有一个类，与一个实例
 */
object MusicPlayer :Player(), OnExternalDriverMoutListener{


    override fun onUnMount(driver: DeviceDriver) {
    }

    override fun onMount(driver: DeviceDriver) {
    }

    val state: Int = 0

    fun play(url: String) {

    }

    fun stop() {

    }

}

fun main(args: Array<String>) {
    MusicPlayer.state
    MusicPlayer.play("aaaaa")
}