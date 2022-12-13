package com.example.maribertutur;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

public class Instruction extends AppCompatActivity {
    public Button InstructionBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);

        InstructionBtn = (Button) findViewById(R.id.InstToMenu);
        InstructionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Instruction.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}

