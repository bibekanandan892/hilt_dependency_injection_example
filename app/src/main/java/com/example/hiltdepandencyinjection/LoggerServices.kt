package com.example.hiltdepandencyinjection

import android.util.Log
import javax.inject.Inject

class LoggerServices @Inject constructor() {
    fun log(message : String){
        Log.d(TAG, "log: $message")
    }
}