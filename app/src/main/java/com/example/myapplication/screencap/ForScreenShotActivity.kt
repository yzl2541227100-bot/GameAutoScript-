package com.example.myapplication.screencap

import android.app.Activity
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.media.projection.MediaProjectionManager
import android.os.Build
import android.os.Bundle
import android.util.Log

/**
 * MediaProjection 权限请求 Activity - 参考 ForScreenShotActivity.java
 * 透明 Activity，仅用于请求截屏权限
 */
class ForScreenShotActivity : Activity() {

    companion object {
        private const val TAG = "ForScreenShotActivity"
        const val REQUEST_CODE = 32896
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(android.view.Window.FEATURE_NO_TITLE)
        window.setBackgroundDrawable(ColorDrawable(0))
        window.setDimAmount(0f)
        requestScreenCapture()
    }

    private fun requestScreenCapture() {
        if (Build.VERSION.SDK_INT >= 21) {
            val mgr = getSystemService(MEDIA_PROJECTION_SERVICE) as MediaProjectionManager
            startActivityForResult(mgr.createScreenCaptureIntent(), REQUEST_CODE)
        } else {
            Log.e(TAG, "API version too low, requires >= 21")
            finish()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode != REQUEST_CODE) return

        if (resultCode != RESULT_OK || data == null) {
            // 用户拒绝，重新请求
            requestScreenCapture()
            setResult(RESULT_CANCELED)
        } else {
            setResult(RESULT_OK)
            ScreenShoterV3.getInstance().init(this, data)
            finish()
        }
    }
}
