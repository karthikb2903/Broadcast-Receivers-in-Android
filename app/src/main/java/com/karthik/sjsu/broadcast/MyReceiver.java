package com.karthik.sjsu.broadcast;

/**
 * Created by Karthik on 03-01-2016.
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String message2 = intent.getStringExtra("message1");
        Toast.makeText(context, "Intent Received from first receiver -"+message2, Toast.LENGTH_LONG).show();
    }
}