package com.example.broadcostexample
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
class LocaleChangeReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_LOCALE_CHANGED) {
            Toast.makeText(context, "Locale Changed", Toast.LENGTH_SHORT).show()
        }
    }
}