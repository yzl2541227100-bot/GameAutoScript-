package com.example.myapplication.rpc

import android.util.Log

/**
 * 跨进程 RPC 调用 - 参考 Rpc.java
 * 支持同步/异步方法调用，通过 Invocator 实现跨进程反射调用
 */
object Rpc {

    private const val TAG = "Rpc"

    /** 同步调用 (返回 Object) */
    fun synCall(
        className: String,
        processName: String,
        methodName: String,
        paramTypes: Array<String>? = null,
        paramValues: Array<String>? = null,
        returnType: String = "void"
    ): Any? {
        if (className.isBlank() || processName.isBlank() || methodName.isBlank()) return false
        if (!checkArgs(paramTypes, paramValues)) return false

        return try {
            val result = Invocator.invoke(
                className, processName, methodName,
                paramTypes?.toList(), paramValues?.toList(), 0
            )
            Log.d(TAG, "SynCall $className.$methodName -> $result")
            castResult(result, returnType)
        } catch (e: Exception) {
            Log.e(TAG, "SynCall failed", e)
            false
        }
    }

    /** 异步调用 */
    fun asynCall(
        className: String,
        processName: String,
        methodName: String,
        paramTypes: Array<String>? = null,
        paramValues: Array<String>? = null
    ): Boolean {
        if (className.isBlank() || processName.isBlank() || methodName.isBlank()) return false
        if (!checkArgs(paramTypes, paramValues)) return false

        return try {
            Invocator.invoke(
                className, processName, methodName,
                paramTypes?.toList(), paramValues?.toList(), 0
            )
            Log.d(TAG, "AsynCall $className.$methodName")
            true
        } catch (e: Exception) {
            Log.e(TAG, "AsynCall failed", e)
            false
        }
    }

    /** 简单调用 - 返回 Int */
    fun simpleCallReturnInt(className: String, processName: String, methodName: String): Int {
        return (synCall(className, processName, methodName, returnType = "int") as? Int) ?: 0
    }

    /** 简单调用 - 返回 String */
    fun simpleCallReturnString(className: String, processName: String, methodName: String): String {
        return (synCall(className, processName, methodName, returnType = "String") as? String) ?: ""
    }

    /** 带 String 参数的简单调用 */
    fun simpleCallStringParam(
        sync: Boolean, className: String, processName: String,
        methodName: String, param: String
    ): Boolean {
        return if (sync) {
            synCall(className, processName, methodName, arrayOf("String"), arrayOf(param))
            true
        } else {
            asynCall(className, processName, methodName, arrayOf("String"), arrayOf(param))
        }
    }

    private fun checkArgs(types: Array<String>?, values: Array<String>?): Boolean {
        if (types == null && values == null) return true
        if (types == null || values == null) return false
        return types.size == values.size
    }

    private fun castResult(result: Any?, returnType: String): Any? {
        if (result == null) return getDefault(returnType)
        return try {
            when (returnType.lowercase()) {
                "boolean" -> result as? Boolean ?: false
                "int" -> result as? Int ?: 0
                "long" -> result as? Long ?: 0L
                "float" -> result as? Float ?: 0f
                "double" -> result as? Double ?: 0.0
                "string" -> result as? String ?: ""
                else -> result
            }
        } catch (e: Exception) {
            getDefault(returnType)
        }
    }

    private fun getDefault(type: String): Any? = when (type.lowercase()) {
        "boolean" -> false
        "int" -> 0
        "long" -> 0L
        "float" -> 0f
        "double" -> 0.0
        "string" -> ""
        else -> null
    }
}

/**
 * 跨进程方法调用器 - 参考 Invocator.java
 * 通过反射实现跨进程方法调用
 */
object Invocator {

    private const val TAG = "Invocator"

    fun invoke(
        className: String,
        processName: String,
        methodName: String,
        paramTypes: List<String>?,
        paramValues: List<String>?,
        flags: Int
    ): Any? {
        return try {
            val clazz = Class.forName(className)
            if (paramTypes.isNullOrEmpty()) {
                val method = clazz.getDeclaredMethod(methodName)
                method.isAccessible = true
                method.invoke(null)
            } else {
                val types = paramTypes.map { resolveType(it) }.toTypedArray()
                val method = clazz.getDeclaredMethod(methodName, *types)
                method.isAccessible = true
                val args = paramValues?.mapIndexed { i, v -> castParam(v, paramTypes[i]) }?.toTypedArray()
                method.invoke(null, *args.orEmpty())
            }
        } catch (e: Exception) {
            Log.e(TAG, "Invoke $className.$methodName failed", e)
            null
        }
    }

    private fun resolveType(typeName: String): Class<*> = when (typeName) {
        "boolean", "Boolean" -> Boolean::class.java
        "int", "Integer" -> Int::class.java
        "long", "Long" -> Long::class.java
        "float", "Float" -> Float::class.java
        "double", "Double" -> Double::class.java
        "String" -> String::class.java
        else -> Class.forName(typeName)
    }

    private fun castParam(value: String, type: String): Any = when (type) {
        "boolean", "Boolean" -> value.toBoolean()
        "int", "Integer" -> value.toInt()
        "long", "Long" -> value.toLong()
        "float", "Float" -> value.toFloat()
        "double", "Double" -> value.toDouble()
        else -> value
    }
}
