package com.example.intentservice;

import android.app.IntentService;
import android.content.Intent;
        import android.util.Log;

public class MyIntentService extends IntentService {

    private static final String TAG = "ServiceExampleTag";

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG, "Intent Service started");
    }

    public MyIntentService() {
        super("MyIntentService");
    }
}
