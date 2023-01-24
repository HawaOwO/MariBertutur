package com.example.maribertutur;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.widget.ImageButton;

public class Sebutan_Huruf1 extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn27, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19,
            btn20, btn21, btn22, btn23, btn24, btn25, btn26;
    MediaPlayer suara;
    ImageButton playBtn, pauseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sebutan_huruf1);

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(this);

        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(this);

        btn27 = (Button) findViewById(R.id.btn27);
        btn27.setOnClickListener(this);

        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(this);

        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(this);

        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(this);

        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(this);

        btn10 = (Button) findViewById(R.id.btn10);
        btn10.setOnClickListener(this);

        btn11 = (Button) findViewById(R.id.btn11);
        btn11.setOnClickListener(this);

        btn12 = (Button) findViewById(R.id.btn12);
        btn12.setOnClickListener(this);

        btn13 = (Button) findViewById(R.id.btn13);
        btn13.setOnClickListener(this);

        btn14 = (Button) findViewById(R.id.btn14);
        btn14.setOnClickListener(this);

        btn15 = (Button) findViewById(R.id.btn15);
        btn15.setOnClickListener(this);

        btn16 = (Button) findViewById(R.id.btn16);
        btn16.setOnClickListener(this);

        btn17 = (Button) findViewById(R.id.btn17);
        btn17.setOnClickListener(this);

        btn18 = (Button) findViewById(R.id.btn18);
        btn18.setOnClickListener(this);

        btn19 = (Button) findViewById(R.id.btn19);
        btn19.setOnClickListener(this);

        btn20 = (Button) findViewById(R.id.btn20);
        btn20.setOnClickListener(this);

        btn21 = (Button) findViewById(R.id.btn21);
        btn21.setOnClickListener(this);

        btn22 = (Button) findViewById(R.id.btn22);
        btn22.setOnClickListener(this);

        btn23 = (Button) findViewById(R.id.btn23);
        btn23.setOnClickListener(this);

        btn24 = (Button) findViewById(R.id.btn24);
        btn24.setOnClickListener(this);

        btn25 = (Button) findViewById(R.id.btn25);
        btn25.setOnClickListener(this);

        btn26 = (Button) findViewById(R.id.btn26);
        btn26.setOnClickListener(this);


        playBtn = (ImageButton) findViewById(R.id.imageBtn1);
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent = new Intent(Sebutan_Huruf1.this, MusicService.class);
                startService(serviceIntent);
            }
        });

        pauseBtn = (ImageButton) findViewById(R.id.imageBtn2);
        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent = new Intent(Sebutan_Huruf1.this, MusicService.class);
                stopService(serviceIntent);
            }
        });

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn1:
                suara = MediaPlayer.create(this, R.raw.huruf_a); //untuk letter A
                suara.start();
                break;

            case R.id.btn2:
                suara = MediaPlayer.create(this, R.raw.huruf_b);
                suara.start();
                break;

            case R.id.btn3:
                suara = MediaPlayer.create(this, R.raw.huruf_c);
                suara.start();
                break;

            case R.id.btn4:
                suara = MediaPlayer.create(this, R.raw.huruf_d);
                suara.start();
                break;

            case R.id.btn5:
                suara = MediaPlayer.create(this, R.raw.huruf_first_e); //untuk bunyi pertama
                suara.start();
                break;

            case R.id.btn27:
                suara = MediaPlayer.create(this, R.raw.huruf_second_e); //bunyi kedua
                suara.start();
                break;

            case R.id.btn6:
                suara = MediaPlayer.create(this, R.raw.huruf_f);
                suara.start();
                break;

            case R.id.btn7:
                suara = MediaPlayer.create(this, R.raw.huruf_g);
                suara.start();
                break;

            case R.id.btn8:
                suara = MediaPlayer.create(this, R.raw.huruf_h);
                suara.start();
                break;

            case R.id.btn9:
                suara = MediaPlayer.create(this, R.raw.huruf_i); //untuk letter A
                suara.start();
                break;

            case R.id.btn10:
                suara = MediaPlayer.create(this, R.raw.huruf_j);
                suara.start();
                break;

            case R.id.btn11:
                suara = MediaPlayer.create(this, R.raw.huruf_k);
                suara.start();
                break;

            case R.id.btn12:
                suara = MediaPlayer.create(this, R.raw.huruf_l);
                suara.start();
                break;

            case R.id.btn13:
                suara = MediaPlayer.create(this, R.raw.huruf_m);
                suara.start();
                break;

            case R.id.btn14:
                suara = MediaPlayer.create(this, R.raw.huruf_n);
                suara.start();
                break;

            case R.id.btn15:
                suara = MediaPlayer.create(this, R.raw.huruf_o);
                suara.start();
                break;

            case R.id.btn16:
                suara = MediaPlayer.create(this, R.raw.huruf_p);
                suara.start();
                break;

            case R.id.btn17:
                suara = MediaPlayer.create(this, R.raw.huruf_q);
                suara.start();
                break;

            case R.id.btn18:
                suara = MediaPlayer.create(this, R.raw.huruf_r);
                suara.start();
                break;

            case R.id.btn19:
                suara = MediaPlayer.create(this, R.raw.huruf_s);
                suara.start();
                break;

            case R.id.btn20:
                suara = MediaPlayer.create(this, R.raw.huruf_t);
                suara.start();
                break;

            case R.id.btn21:
                suara = MediaPlayer.create(this, R.raw.huruf_u);
                suara.start();
                break;

            case R.id.btn22:
                suara = MediaPlayer.create(this, R.raw.huruf_v);
                suara.start();
                break;

            case R.id.btn23:
                suara = MediaPlayer.create(this, R.raw.huruf_w);
                suara.start();
                break;

            case R.id.btn24:
                suara = MediaPlayer.create(this, R.raw.huruf_x);
                suara.start();
                break;

            case R.id.btn25:
                suara = MediaPlayer.create(this, R.raw.huruf_y);
                suara.start();
                break;

            case R.id.btn26:
                suara = MediaPlayer.create(this, R.raw.huruf_z);
                suara.start();
                break;


            default:
                return;
        }

    }
}