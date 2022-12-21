package com.example.maribertutur;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

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
        sebutan_1.setBackgroundColor(Color.CYAN);
        sebutan_2.setBackgroundColor(Color.CYAN);
        perkataan.setBackgroundColor(Color.MAGENTA);

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
    }

}
