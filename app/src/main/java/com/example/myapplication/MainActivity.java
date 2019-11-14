package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 1
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("RRRRRRRR","onCreate");

    }

    @Override
    protected void onStart() {
        // 2
        super.onStart();
        Log.e("RRRRRRRR","onStart");
    }

    @Override
    protected void onResume() {
        // 3
        super.onResume();
        Log.e("RRRRRRRR","onResume");
    }

    @Override
    protected void onDestroy() {
        // 4
        super.onDestroy();
        Log.e("RRRRRRRR","onDestroy");
    }

    @Override
    protected void onRestart() {
        // 5
        super.onRestart();
        Log.e("RRRRRRRR","onRestart");
    }

    @Override
    protected void onPause() {
        // 6
        super.onPause();
        Log.e("RRRRRRRR","onPause");
    }

    @Override
    protected void onStop() {
        // 7
        super.onStop();
        Log.e("RRRRRRRR","onStop");
    }


}
