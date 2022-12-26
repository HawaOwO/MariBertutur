package com.example.maribertutur;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sebutan_Huruf2 extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13,
            btn14, btn15, btn16, btn17, btn18;
    MediaPlayer suara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sebutan_huruf2);

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

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn1:
                suara = MediaPlayer.create(this, R.raw.word_ba); //untuk perkataan ba
                suara.start();
                break;

            case R.id.btn2:
                suara = MediaPlayer.create(this, R.raw.word_ca);
                suara.start();
                break;

            case R.id.btn3:
                suara = MediaPlayer.create(this, R.raw.word_da);
                suara.start();
                break;

            case R.id.btn4:
                suara = MediaPlayer.create(this, R.raw.word_fa);
                suara.start();
                break;

            case R.id.btn5:
                suara = MediaPlayer.create(this, R.raw.word_ga);
                suara.start();
                break;

            case R.id.btn6:
                suara = MediaPlayer.create(this, R.raw.word_ha);
                suara.start();
                break;

            case R.id.btn7:
                suara = MediaPlayer.create(this, R.raw.word_ja);
                suara.start();
                break;

            case R.id.btn8:
                suara = MediaPlayer.create(this, R.raw.word_ka);
                suara.start();
                break;

            case R.id.btn9:
                suara = MediaPlayer.create(this, R.raw.word_la);
                suara.start();
                break;

            case R.id.btn10:
                suara = MediaPlayer.create(this, R.raw.word_ma);
                suara.start();
                break;

            case R.id.btn11:
                suara = MediaPlayer.create(this, R.raw.word_na);
                suara.start();
                break;

            case R.id.btn12:
                suara = MediaPlayer.create(this, R.raw.word_pa);
                suara.start();
                break;

            case R.id.btn13:
                suara = MediaPlayer.create(this, R.raw.word_ra);
                suara.start();
                break;

            case R.id.btn14:
                suara = MediaPlayer.create(this, R.raw.word_sa);
                suara.start();
                break;

            case R.id.btn15:
                suara = MediaPlayer.create(this, R.raw.word_ta);
                suara.start();
                break;

            case R.id.btn16:
                suara = MediaPlayer.create(this, R.raw.word_wa);
                suara.start();
                break;

            case R.id.btn17:
                suara = MediaPlayer.create(this, R.raw.word_ya);
                suara.start();
                break;

            case R.id.btn18:
                suara = MediaPlayer.create(this, R.raw.word_za);
                suara.start();
                break;
        }
    }

}