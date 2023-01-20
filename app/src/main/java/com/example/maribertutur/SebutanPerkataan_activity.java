package com.example.maribertutur;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.media.MediaPlayer;

public class SebutanPerkataan_activity extends AppCompatActivity implements View.OnClickListener {

    Button sebutan_1, sebutan_2, perkataan, nextWord;
    public Button TTGameToMenu;
    MediaPlayer suara;

    int totalWord = SebutanPerkataan.perkataan.length;
    int currWordIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_pronunciation);

        sebutan_1 = findViewById(R.id.sebutan_1);
        sebutan_2 = findViewById(R.id.sebutan_2);
        perkataan = findViewById(R.id.perkataan);
        nextWord = findViewById(R.id.nextword);

        sebutan_1.setOnClickListener(this);
        sebutan_2.setOnClickListener(this);
        perkataan.setOnClickListener(this);
        nextWord.setOnClickListener(this);

        loadNewWord();

        TTGameToMenu = (Button) findViewById(R.id.TTGameToMenu);
        TTGameToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //prompts user to go back to the Menu page MainActivity2 when click on the 'Kembali Ke Menu' Button
                Intent intent = new Intent(SebutanPerkataan_activity.this, MainActivity2.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
    }

    @Override
    public void onClick(View view) {

        Button clickedBtn = (Button) view;
        if (clickedBtn.getId()==R.id.nextword) {
            //prompts user to learn new word after clicking on 'Seterusnya' Button
            currWordIndex++;
            loadNewWord();
        }

        if (currWordIndex == 0) {
            switch (view.getId()) {
                case R.id.sebutan_1:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_da);
                    suara.start();
                    break;
                case R.id.sebutan_2:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_du);
                    suara.start();
                    break;
                case R.id.perkataan:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_dadu);
                    suara.start();
                    break;
                default:
                    return;
            }
        }
        else if (currWordIndex == 1) {
            switch (view.getId()){
                case R.id.sebutan_1:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_na);
                    suara.start();
                    break;
                case R.id.sebutan_2:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_ga);
                    suara.start();
                    break;
                case R.id.perkataan:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_naga);
                    suara.start();
                    break;
                default:
                    return;
            }
        }
        else if (currWordIndex == 2) {
            switch (view.getId()){
                case R.id.sebutan_1:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_ci);
                    suara.start();
                    break;
                case R.id.sebutan_2:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_li);
                    suara.start();
                    break;
                case R.id.perkataan:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_cili);
                    suara.start();
                    break;
                default:
                    return;
            }
        }
        else if (currWordIndex == 3) {
            switch (view.getId()){
                case R.id.sebutan_1:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_te);
                    suara.start();
                    break;
                case R.id.sebutan_2:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_bu);
                    suara.start();
                    break;
                case R.id.perkataan:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_tebu);
                    suara.start();
                    break;
                default:
                    return;
            }
        }
        else if (currWordIndex == 4) {
            switch (view.getId()){
                case R.id.sebutan_1:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_be);
                    suara.start();
                    break;
                case R.id.sebutan_2:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_ca);
                    suara.start();
                    break;
                case R.id.perkataan:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_beca);
                    suara.start();
                    break;
                default:
                    return;
            }
        }
        else if (currWordIndex == 5) {
            switch (view.getId()){
                case R.id.sebutan_1:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_mu);
                    suara.start();
                    break;
                case R.id.sebutan_2:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_ka);
                    suara.start();
                    break;
                case R.id.perkataan:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_muka);
                    suara.start();
                    break;
                default:
                    return;
            }
        }
        else if (currWordIndex == 6) {
            switch (view.getId()){
                case R.id.sebutan_1:
                case R.id.sebutan_2:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_yo);
                    suara.start();
                    break;
                case R.id.perkataan:
                    suara = MediaPlayer.create(this, R.raw.sebutperkataan_yoyo);
                    suara.start();
                    break;
                default:
                    return;
            }
        }

    }

    void loadNewWord() {
        if (currWordIndex == totalWord) {
            Intent intent = new Intent(this, AfterBelajarInterface.class);
            startActivity(intent);
        }

        if (currWordIndex == 0) {
            ImageView img = (ImageView)findViewById(R.id.imgViewWord);
            img.setBackgroundResource(R.drawable.dice);
        }

        else if (currWordIndex == 1) {
            ImageView img = (ImageView)findViewById(R.id.imgViewWord);
            img.setBackgroundResource(R.drawable.dragon);
        }

        else if (currWordIndex == 2) {
            ImageView img = (ImageView)findViewById(R.id.imgViewWord);
            img.setBackgroundResource(R.drawable.cili);
        }

        else if (currWordIndex == 3) {
            ImageView img = (ImageView)findViewById(R.id.imgViewWord);
            img.setBackgroundResource(R.drawable.tebu);
        }

        else if (currWordIndex == 4) {
            ImageView img = (ImageView)findViewById(R.id.imgViewWord);
            img.setBackgroundResource(R.drawable.beca);
        }

        else if (currWordIndex == 5) {
            ImageView img = (ImageView)findViewById(R.id.imgViewWord);
            img.setBackgroundResource(R.drawable.face);
        }

        else if (currWordIndex == 6) {
            ImageView img = (ImageView)findViewById(R.id.imgViewWord);
            img.setBackgroundResource(R.drawable.yoyo);
        }

        sebutan_1.setText(SebutanPerkataan.sebutan[currWordIndex][0]);
        sebutan_2.setText(SebutanPerkataan.sebutan[currWordIndex][1]);
        perkataan.setText(SebutanPerkataan.perkataan[currWordIndex]);
    }

}
