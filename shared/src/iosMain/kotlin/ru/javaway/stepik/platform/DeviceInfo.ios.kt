package ru.javaway.stepik.platform

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import platform.CoreGraphics.CGRectGetHeight
import platform.CoreGraphics.CGRectGetWidth
import platform.Foundation.NSString
import platform.Foundation.NSStringEncoding
import platform.Foundation.NSUTF8StringEncoding
import platform.Foundation.stringWithCString
import platform.Foundation.stringWithString
import platform.UIKit.UIDevice
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceIdiomPad
import platform.UIKit.UIUserInterfaceIdiomPhone
import platform.UIKit.UIUserInterfaceIdiomTV
import platform.posix.uname
import platform.posix.utsname
import kotlin.experimental.ExperimentalNativeApi
import kotlin.math.roundToInt

actual class DeviceInfo actual constructor(){
    @OptIn(ExperimentalNativeApi::class)
    actual val osName: String = when(UIDevice.currentDevice.userInterfaceIdiom){
        UIUserInterfaceIdiomPhone -> "IOS"
        UIUserInterfaceIdiomPad -> "ipadOS"
        else -> Platform.osFamily.name
    }
    actual val osVersion: String = UIDevice.currentDevice.systemVersion
    @OptIn(ExperimentalForeignApi::class)
    actual val model: String = memScoped {
        val systemInfo:utsname = alloc()
        uname(systemInfo.ptr)
        return@memScoped NSString.stringWithCString(
            systemInfo.machine,
            encoding = NSUTF8StringEncoding
        ) ?: "Unknown model"
    }
    @OptIn(ExperimentalNativeApi::class)
    actual val cpu: String = Platform.cpuArchitecture.name
    @OptIn(ExperimentalForeignApi::class)
    actual val screenWidth: Int = CGRectGetWidth(UIScreen.mainScreen().nativeBounds).toInt()
    @OptIn(ExperimentalForeignApi::class)
    actual val screenHeight: Int = CGRectGetHeight(UIScreen.mainScreen().nativeBounds).toInt()
    actual val screenDestiny: Int = UIScreen.mainScreen().scale().toInt()
    actual fun getSummary():String = "$osName\n" +
    "osVersion $osVersion\n" +
    "model $model\n" +
    "cpu $cpu\n" +
    "screenWidth $screenWidth\n" +
    "screenHeight $screenHeight\n" +
    "screenDestiny $screenDestiny"
}