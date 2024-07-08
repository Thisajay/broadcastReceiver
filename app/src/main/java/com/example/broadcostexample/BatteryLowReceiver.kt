package com.example.broadcostexample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BatteryLowReceiver:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == Intent.ACTION_BATTERY_LOW) {
            Toast.makeText(context, "Battery Low", Toast.LENGTH_SHORT).show()
        }
    }

}