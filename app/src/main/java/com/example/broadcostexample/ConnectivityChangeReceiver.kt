package com.example.broadcostexample

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.widget.Toast

class ConnectivityChangeReceiver(private val context: Context) : ConnectivityManager.NetworkCallback() {
    override fun onAvailable(network: Network) {
        super.onAvailable(network)
        Toast.makeText(context, "Connected to the Internet", Toast.LENGTH_SHORT).show()
    }

    override fun onLost(network: Network) {
        super.onLost(network)
        Toast.makeText(context, "Disconnected from the Internet", Toast.LENGTH_SHORT).show()
    }
}