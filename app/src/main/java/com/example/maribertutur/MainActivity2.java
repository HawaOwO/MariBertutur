package com.example.maribertutur;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    public Button ArahanBtn, HurufBtn, PerkataanBtn, BacaBtn, TekaBtn;

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
            }
        //to able user to read the instruction when click on the 'Arahan' Button
        });

        TekaBtn = (Button) findViewById(R.id.button5);
        TekaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity2.this, TekaGame.class);
                startActivity(intent);
            }
            //to able user to play Teka-Teki game when click on the 'Permainan Teka-Teki' Button
        });


        BacaBtn = (Button) findViewById(R.id.button4);
        BacaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity2.this, Permainan_Bacaan.class);
                startActivity(intent);
            }
            //to able user to read the instruction when click on the 'Arahan' Button
        });

        HurufBtn = (Button) findViewById(R.id.button2);
        HurufBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity2.this, Sebutan_Huruf_main.class);
                startActivity(intent);
            }
            //to able user to open Sebutan Huruf page when click on the 'Sebutan Huruf' Button
        });

        PerkataanBtn = (Button) findViewById(R.id.button3);
        PerkataanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, SebutanPerkataan_activity.class);
                startActivity(intent);
            }
        });





    }
}