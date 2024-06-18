package ru.javaway.stepik.platform

actual class DeviceInfo actual  constructor(){
    actual val osName: String = System.getProperty("os.name") ?: "Desktop"
    actual val osVersion: String = System.getProperty("os.version") ?: "No version"
    actual val model: String = "Desktop"
    actual val cpu: String = System.getProperty("os.arch") ?: "unknown CPU"
    actual val screenWidth: Int = 0
    actual val screenHeight: Int = 0
    actual val screenDestiny: Int = 0

    actual fun getSummary():String = "$osName\n" +
    "osVersion $osVersion\n" +
    "model $model\n" +
    "cpu $cpu\n" +
    "screenWidth $screenWidth\n" +
    "screenHeight $screenHeight\n" +
    "screenDestiny $screenDestiny"

}