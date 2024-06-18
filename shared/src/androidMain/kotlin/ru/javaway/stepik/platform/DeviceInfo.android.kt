package ru.javaway.stepik.platform

import android.content.res.Resources
import android.os.Build

actual class DeviceInfo actual constructor(){
    val displayMetrics = Resources.getSystem().displayMetrics
    actual val osName: String ="Android"
    actual val osVersion: String = "${Build.VERSION.SDK_INT}"
    actual val model: String ="${Build.MANUFACTURER} ${Build.MODEL}"
    actual val cpu: String = Build.SUPPORTED_ABIS.firstOrNull() ?: "unknown CPU"
    actual val screenWidth: Int = displayMetrics.widthPixels
    actual val screenHeight: Int = displayMetrics.heightPixels
    actual val screenDestiny: Int = displayMetrics.densityDpi

    actual fun getSummary() = "$osName\n" +
            "osVersion $osVersion\n" +
            "model $model\n" +
            "cpu $cpu\n" +
            "screenWidth $screenWidth\n" +
            "screenHeight $screenHeight\n" +
            "screenDestiny $screenDestiny"
}