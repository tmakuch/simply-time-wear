package dev.makuch.simplyTime.data

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class NotificationBroadcastReceiver : BroadcastReceiver() {
    var notificationCount = 0
    override fun onReceive(context: Context, intent: Intent) {
        this.notificationCount = intent.getIntExtra("Notification Count", 0)
    }
}
