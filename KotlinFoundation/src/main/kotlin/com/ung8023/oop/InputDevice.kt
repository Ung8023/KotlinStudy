package com.ung8023.oop

interface InputDevice {
    //接口可以有默认实现
    fun input(event: Any) {
        println("aaa")
    }
}

interface USBInputDevice: InputDevice

interface BLEInputDevice: InputDevice

abstract class USBMouse : USBInputDevice, OpticalMouse {
    override fun input(event: Any) {

    }
}

class NBMouse : USBMouse()

interface OpticalMouse

class Computer{
    fun addUSBInputDevice(inputDevice: USBInputDevice) {
        //插入输入设备
        println("add usb input device $inputDevice")
    }

    fun addBLEInputDevice(inputDevice: BLEInputDevice) {
        //插入输入设备
        println("add ble input device $inputDevice")
    }

    fun addInpouDevice(inputDevice: InputDevice) {
        when(inputDevice) {
            is BLEInputDevice -> addBLEInputDevice(inputDevice)
            is USBInputDevice -> addUSBInputDevice(inputDevice)
            else -> {
                throw IllegalArgumentException("输入设备类型不支持")
            }
        }
    }
}

fun main(args: Array<String>) {
    val com : Computer = Computer()
    val usbMouse: USBMouse = NBMouse()
    com. addInpouDevice(usbMouse)
}