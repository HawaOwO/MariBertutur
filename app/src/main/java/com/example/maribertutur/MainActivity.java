package com.example.maribertutur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    public Button FirstBtn;
    ImageButton playBtn, pauseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstBtn = (Button) findViewById(R.id.FirstPage);
        FirstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        playBtn = (ImageButton) findViewById(R.id.imageButton);
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent = new Intent(MainActivity.this, MusicService.class);
                startService(serviceIntent);
            }
        });

        pauseBtn = (ImageButton) findViewById(R.id.imageButton2);
        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent = new Intent(MainActivity.this, MusicService.class);
                stopService(serviceIntent);
            }
        });

        //bindService(serviceIntent, mServiceConnection, Context.BIND_AUTO_CREATE);

    }

    //private boolean mBound = false;
    //private MusicService mService;
    //private ServiceConnection mServiceConnection = new ServiceConnection() {
    //@Override
    // public void onServiceConnected(ComponentName name, IBinder service) {
    //MusicService.LocalBinder binder = (MusicService.LocalBinder) service;
    //mService = binder.getService();
    //mBound = true;
    // }
    //@Override
    //public void onServiceDisconnected(ComponentName name) {
    // mBound = false;
    //}
    //};

}


