package com.example.myapplication.remote

import android.content.ContentProvider
import android.content.ContentValues
import android.content.UriMatcher
import android.database.Cursor
import android.database.MatrixCursor
import android.net.Uri
import android.util.Log

/**
 * 远程共享偏好 Provider - 运行在 :remote 独立进程
 * 跨进程共享配置数据
 */
class RemotePreferenceProvider : ContentProvider() {

    companion object {
        const val TAG = "RemotePrefProvider"
        const val AUTHORITY_SUFFIX = ".remote.preferences"
        private const val CODE_PREFS = 1

        fun getAuthority(packageName: String) = "$packageName$AUTHORITY_SUFFIX"
    }

    private val uriMatcher = UriMatcher(UriMatcher.NO_MATCH)
    private val prefs by lazy {
        context!!.getSharedPreferences("remote_prefs", android.content.Context.MODE_PRIVATE)
    }

    override fun onCreate(): Boolean {
        context?.let {
            uriMatcher.addURI(getAuthority(it.packageName), "prefs/*", CODE_PREFS)
        }
        Log.d(TAG, "RemotePreferenceProvider created")
        return true
    }

    override fun query(
        uri: Uri, projection: Array<out String>?,
        selection: String?, selectionArgs: Array<out String>?,
        sortOrder: String?
    ): Cursor {
        val key = uri.lastPathSegment ?: ""
        val value = prefs.getString(key, "") ?: ""
        val cursor = MatrixCursor(arrayOf("key", "value"))
        cursor.addRow(arrayOf(key, value))
        return cursor
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        values?.let {
            val key = it.getAsString("key") ?: return null
            val value = it.getAsString("value") ?: ""
            prefs.edit().putString(key, value).apply()
            context?.contentResolver?.notifyChange(uri, null)
        }
        return uri
    }

    override fun update(uri: Uri, values: ContentValues?, selection: String?, selectionArgs: Array<out String>?): Int {
        insert(uri, values)
        return 1
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int {
        val key = uri.lastPathSegment ?: return 0
        prefs.edit().remove(key).apply()
        return 1
    }

    override fun getType(uri: Uri): String = "vnd.android.cursor.item/preference"
}
