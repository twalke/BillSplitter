package com.example.twalke.billsplitter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.SyncStateContract.Constants;


public class LauncherActivity extends AppCompatActivity {

    private boolean firstLaunch = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        Intent i;

       // SharedPreferences pref = getSharedPreferences(Constants.ApplicationTag, MODE_PRIVATE);
       // firstLaunch = pref.getBoolean(Constants.FIRST_LAUNCH, true);

        if (firstLaunch) {
            i = new Intent(LauncherActivity.this, LoginActivity.class);
            startActivity(i);
        } else {
            i = new Intent(LauncherActivity.this, MainActivity.class);
            startActivity(i);
        }

        finish();
    }
}