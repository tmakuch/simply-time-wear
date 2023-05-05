package dev.makuch.simplyTime

import android.content.Intent
import android.os.IBinder
import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification


class NotificationListener: NotificationListenerService() {

    override fun onBind(intent: Intent?): IBinder? {
        return super.onBind(intent)
    }

    override fun onNotificationPosted(sbn: StatusBarNotification) {
        val activeNotifications = this.activeNotifications
        if (activeNotifications != null && activeNotifications.size > 0) {
            val intent = Intent("dev.makuch.simplyTime")
            intent.putExtra("Notification Count", activeNotifications.size)
            sendBroadcast(intent)
        }
    }

    override fun onNotificationRemoved(sbn: StatusBarNotification) {
        val activeNotifications = this.activeNotifications
        if (activeNotifications != null && activeNotifications.size > 0) {
            val intent = Intent("dev.makuch.simplyTime")
            intent.putExtra("Notification Count", activeNotifications.size)
            sendBroadcast(intent)
        }
    }
}
