package com.example.myapplication.entity

import android.os.Parcel
import android.os.Parcelable
import java.io.File

/**
 * 脚本日志实体 - 参考 ScriptLog.java (Parcelable)
 * 支持跨进程传递和持久化存储
 */
data class ScriptLog(
    var name: String = "",
    var size: String = "",
    var file: File? = null,
    var isSelect: Boolean = false
) : Parcelable {

    constructor(parcel: Parcel) : this(
        name = parcel.readString() ?: "",
        size = parcel.readString() ?: "",
        file = parcel.readSerializable() as? File,
        isSelect = parcel.readByte() != 0.toByte()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(size)
        parcel.writeSerializable(file)
        parcel.writeByte(if (isSelect) 1 else 0)
    }

    override fun describeContents(): Int = 0

    companion object CREATOR : Parcelable.Creator<ScriptLog> {
        override fun createFromParcel(parcel: Parcel): ScriptLog = ScriptLog(parcel)
        override fun newArray(size: Int): Array<ScriptLog?> = arrayOfNulls(size)
    }

    override fun toString(): String = "ScriptLog[name=$name, size=$size, file=$file]"
}
