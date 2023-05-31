package dev.makuch.simplyTime

import android.content.Context
import com.google.android.gms.wearable.MessageClient
import com.google.android.gms.wearable.MessageEvent
import com.google.android.gms.wearable.Wearable

class MessageListener : MessageClient.OnMessageReceivedListener {
    constructor(context: Context) {
        Wearable.getMessageClient(context).addListener(this);
    }

    override fun onMessageReceived(p0: MessageEvent) {

    }
}
