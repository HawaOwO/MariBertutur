package com.example.maribertutur;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class SebutanPerkataan_activity extends AppCompatActivity implements View.OnClickListener {

    Button sebutan_1, sebutan_2, perkataan, nextWord;
    public Button TTGameToMenu;

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
            public void onClick(View view) {
                //prompts user to go back to the Menu page MainActivity2 when click on the 'Kembali Ke Menu' Button
                Intent intent = new Intent(SebutanPerkataan_activity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {

        Button clickedBtn = (Button) view;
        if (clickedBtn.getId()==R.id.nextword) {
            //prompts user to learn new word after clicking on 'Seterusnya' Button
            loadNewWord();
        }
    }

    void loadNewWord() {
        if (currWordIndex == totalWord) {
            // finishWord();
            return;
        }

        if (currWordIndex == 0) {
            ImageView img = (ImageView)findViewById(R.id.imgViewWord);
            img.setBackgroundResource(R.drawable.egg);
        }

        else if (currWordIndex == 1) {
            ImageView img = (ImageView)findViewById(R.id.imgViewWord);
            img.setBackgroundResource(R.drawable.dice);
        }

        else if (currWordIndex == 2) {
            ImageView img = (ImageView)findViewById(R.id.imgViewWord);
            img.setBackgroundResource(R.drawable.box);
        }

        else if (currWordIndex == 3) {
            ImageView img = (ImageView)findViewById(R.id.imgViewWord);
            img.setBackgroundResource(R.drawable.silat);
        }

        else if (currWordIndex == 4) {
            ImageView img = (ImageView)findViewById(R.id.imgViewWord);
            img.setBackgroundResource(R.drawable.beca);
        }

        else if (currWordIndex == 5) {
            ImageView img = (ImageView)findViewById(R.id.imgViewWord);
            img.setBackgroundResource(R.drawable.flower);
        }

        sebutan_1.setText(SebutanPerkataan.sebutan[currWordIndex][0]);
        sebutan_2.setText(SebutanPerkataan.sebutan[currWordIndex][1]);
        perkataan.setText(SebutanPerkataan.perkataan[currWordIndex]);
    }

}
