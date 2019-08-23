package com.example.multiwindow;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchIntent(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        intent.addFlags(Intent.FLAG_ACTIVITY_LAUNCH_ADJACENT | Intent.FLAG_ACTIVITY_MULTIPLE_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);

        Rect rect = new Rect(0, 0, 100, 100);
        ActivityOptions options = ActivityOptions.makeBasic();
        ActivityOptions bounds = options.setLaunchBounds(rect);
        startActivity(intent, bounds.toBundle());
    }
}
