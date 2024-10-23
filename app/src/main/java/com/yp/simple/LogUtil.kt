package com.yp.simple

import android.util.Log

class LogUtil {
    private val TAG = "LogUtil"
    fun log(tag: String? = TAG, msg: String) {
        Log.v(tag, msg)
    }
}