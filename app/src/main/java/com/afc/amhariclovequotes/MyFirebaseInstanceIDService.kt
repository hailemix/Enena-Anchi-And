package com.afc.amhariclovequotes

import android.app.Service
import android.content.Intent
import android.os.IBinder

/**
 * Created by user on 06/9/20.
 */


class MyFirebaseInstanceIDService : Service() {
    override fun onBind(intent: Intent): IBinder? {
        return null
    }
}

