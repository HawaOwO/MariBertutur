package com.example.maribertutur;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;

public class Sebutan_Huruf1 extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19,
            btn20, btn21, btn22, btn23, btn24, btn25, btn26;
    MediaPlayer suara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sebutan_huruf1);

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suara = MediaPlayer.create(Sebutan_Huruf1.this,R.raw.huruf_a);
                suara.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        suara.start();
                    }
                });

                suara.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        suara.release();
                    }
                });
            }
        });

        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(this);

        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(this);

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

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn2:
                break;
            default:
                return;
        }

    }
}