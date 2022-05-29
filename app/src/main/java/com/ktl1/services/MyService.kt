package com.ktl1.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import com.ktl1.services.MainActivity.Companion.NAME
import com.ktl1.services.MainActivity.Companion.TAG

class MyService : Service() {

    init {
        Log.i(TAG,"Service has been Created!")
    }


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i(MainActivity.TAG,"Service has been Started!")

        val name = intent?.getStringExtra(NAME)
        val mark = intent?.getIntExtra(MainActivity.MARK,0)
        Log.i(TAG,"name is $name , mark is $mark")

        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"Destroying........!")

    }


    //    override fun onBind(p0: Intent?): IBinder? {
//        return null
//    }
    override fun onBind(p0: Intent?): IBinder? = null
}