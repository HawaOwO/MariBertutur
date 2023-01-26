package com.example.maribertutur;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
    public Button ArahanBtn, HurufBtn, PerkataanBtn, BacaBtn, TekaBtn;
    ImageButton playBtn, pauseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArahanBtn = (Button) findViewById(R.id.button);
        ArahanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity2.this, Instruction.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        //to able user to read the instruction when click on the 'Arahan' Button
        });

        TekaBtn = (Button) findViewById(R.id.button5);
        TekaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity2.this, TekaGame.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
            //to able user to play Teka-Teki game when click on the 'Permainan Teka-Teki' Button
        });


        BacaBtn = (Button) findViewById(R.id.button4);
        BacaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity2.this, Permainan_Bacaan.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
            //to able user to open Permainan Bacaan page when click on the 'Permainan Bacaan' Button
        });

        HurufBtn = (Button) findViewById(R.id.button2);
        HurufBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity2.this, Sebutan_Huruf_main.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
            //to able user to open Sebutan Huruf page when click on the 'Sebutan Huruf' Button
        });

        PerkataanBtn = (Button) findViewById(R.id.button3);
        PerkataanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, SebutanPerkataan_activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        playBtn = (ImageButton) findViewById(R.id.sound2);
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent = new Intent(MainActivity2.this, MusicService.class);
                startService(serviceIntent);
            }
        });

        pauseBtn = (ImageButton) findViewById(R.id.sound22);
        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent = new Intent(MainActivity2.this, MusicService.class);
                stopService(serviceIntent);
            }
        });

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}