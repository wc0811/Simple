package com.yp.toastutil

import android.util.Log

fun setLog(tag: String? = "TimeTable", msg: String? = "") {
    var message = "系统异常，请练习管理员"
    msg?.let {
        message = it
    }
    Log.v(tag, message)

}