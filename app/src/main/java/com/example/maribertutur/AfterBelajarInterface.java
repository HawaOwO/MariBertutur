package com.example.maribertutur;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AfterBelajarInterface extends AppCompatActivity {

    public Button TTGameToMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_belajar);

        TTGameToMenu = (Button) findViewById(R.id.BackToMenu);
        TTGameToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //prompts user to go back to the Menu page MainActivity2 when click on the 'Kembali Ke Menu' Button
                Intent intent = new Intent(AfterBelajarInterface.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}
