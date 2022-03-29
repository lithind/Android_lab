package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","Paused");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","Restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","Destroyed");
    }
}
