package com.example.broadcostexample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast


class AirplaneModeReceiver:BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_AIRPLANE_MODE_CHANGED) {
            val isAirplaneModeOn = intent.getBooleanExtra("state", false)
            Toast.makeText(context, if (isAirplaneModeOn) "Airplane Mode Enabled" else "Airplane Mode Disabled", Toast.LENGTH_SHORT).show()
        }
    }
}