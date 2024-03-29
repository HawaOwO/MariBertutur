package com.example.maribertutur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sebutan_Huruf_main extends AppCompatActivity {

    public Button BtnAsas, BtnA, BtnI, BtnU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sebutan_huruf_main);


        BtnAsas = (Button) findViewById(R.id.button);
        BtnAsas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sebutan_Huruf_main.this, Sebutan_Huruf1.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
            //to able user to go into 'Sebutan Huruf Asas' page when click on 'Sebutan Huruf Asas' Button
        });

        BtnA = (Button) findViewById(R.id.button2);
        BtnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sebutan_Huruf_main.this, Sebutan_Huruf2.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
            //to able user to go into "Sebutan Perkataan A" page when click on 'Sebutan Perkataan 'A'' Button
        });

        BtnI = (Button) findViewById(R.id.button3);
        BtnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sebutan_Huruf_main.this, Sebutan_Huruf3.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
            //to able user to go into "Sebutan Perkataan I" page when click on 'Sebutan Perkataan 'I'' Button
        });

        BtnU = (Button) findViewById(R.id.button4);
        BtnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sebutan_Huruf_main.this, Sebutan_Huruf4.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
            //to able user to go into "Sebutan Perkataan U" page when click on 'Sebutan Perkataan 'U'' Button
        });








    }

}