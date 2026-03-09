package com.example.myapplication.screencap

/**
 * 截图原始数据 - 参考 ScreenShotImage.java
 */
data class ScreenShotImage(
    var width: Int = 0,
    var height: Int = 0,
    var rotation: Int = 0,
    var rowStride: Int = 0,
    var pixelStride: Int = 0,
    var data: ByteArray = ByteArray(0)
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScreenShotImage) return false
        return width == other.width && height == other.height && data.contentEquals(other.data)
    }

    override fun hashCode(): Int = 31 * width + height
}
