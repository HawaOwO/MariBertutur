package com.example.maribertutur;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Permainan_Bacaan extends AppCompatActivity implements View.OnClickListener {

    TextView totalQuestionView;
    TextView questionTextViewReading;
    Button answerA, answerB, answerC, answerD;
    Button submitButton;
    public Button gameButton;

    int scoreReading=0;
    int totalQuestionReading = QuestionAnswerReading.question.length;
    int currentQuestionIndexReading = 0;
    String selectedAnswerReading = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permainan_bacaan);

        totalQuestionView = findViewById(R.id.jumlahSoalan);
        questionTextViewReading = findViewById(R.id.questionReadingGame);
        answerA = findViewById(R.id.answerOneRead);
        answerB = findViewById(R.id.answerTwoRead);
        answerC = findViewById(R.id.answerThreeRead);
        answerD = findViewById(R.id.answerFourRead);
        submitButton = findViewById(R.id.next);

        answerA.setOnClickListener(this);
        answerB.setOnClickListener(this);
        answerC.setOnClickListener(this);
        answerD.setOnClickListener(this);
        submitButton.setOnClickListener(this);

        totalQuestionView.setText("Jumlah Soalan: " +totalQuestionReading);

        loadNewQuestion();

        gameButton = (Button) findViewById(R.id.menu);
        gameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Permainan_Bacaan.this, MainActivity2.class);
                startActivity(intent);
            }
            // to able user to go back to the main menu
        });
    }

    @Override
    public void onClick(View view) {

        answerA.setBackgroundColor(Color.CYAN);
        answerB.setBackgroundColor(Color.CYAN);
        answerC.setBackgroundColor(Color.CYAN);
        answerD.setBackgroundColor(Color.CYAN);

        Button clickedButton = (Button) view;
        if(clickedButton.getId() == R.id.next){
            if(selectedAnswerReading.equals(QuestionAnswerReading.correctAnswers[currentQuestionIndexReading])){
                scoreReading++;
            }
            currentQuestionIndexReading++;
            loadNewQuestion();

        } else {
            // Choices button clicked
            selectedAnswerReading = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.WHITE);
        }
    }

    void loadNewQuestion() {

        if(currentQuestionIndexReading == totalQuestionReading) {
            finishQuiz();
            return;
        }

        if(currentQuestionIndexReading == 0)
        {
            ImageView imgView = (ImageView)findViewById(R.id.imageView);
            imgView.setBackgroundResource(R.drawable.buku);

            ImageView imgView2 = (ImageView)findViewById(R.id.imageView2);
            imgView2.setBackgroundResource(R.drawable.kek);

            ImageView imgView3 = (ImageView)findViewById(R.id.imageView3);
            imgView3.setBackgroundResource(R.drawable.kereta);

            ImageView imgView4 = (ImageView)findViewById(R.id.imageView4);
            imgView4.setBackgroundResource(R.drawable.pensel);
        }

        else if(currentQuestionIndexReading == 1)
        {
            ImageView imgView = (ImageView)findViewById(R.id.imageView);
            imgView.setBackgroundResource(R.drawable.epal);

            ImageView imgView2 = (ImageView)findViewById(R.id.imageView2);
            imgView2.setBackgroundResource(R.drawable.oren);

            ImageView imgView3 = (ImageView)findViewById(R.id.imageView3);
            imgView3.setBackgroundResource(R.drawable.anggur);

            ImageView imgView4 = (ImageView)findViewById(R.id.imageView4);
            imgView4.setBackgroundResource(R.drawable.pisang);
        }

        else if(currentQuestionIndexReading == 2)
        {
            ImageView imgView = (ImageView)findViewById(R.id.imageView);
            imgView.setBackgroundResource(R.drawable.rumah);

            ImageView imgView2 = (ImageView)findViewById(R.id.imageView2);
            imgView2.setBackgroundResource(R.drawable.bicycle);

            ImageView imgView3 = (ImageView)findViewById(R.id.imageView3);
            imgView3.setBackgroundResource(R.drawable.airplane);

            ImageView imgView4 = (ImageView)findViewById(R.id.imageView4);
            imgView4.setBackgroundResource(R.drawable.computer);
        }

        else if(currentQuestionIndexReading == 3)
        {
            ImageView imgView = (ImageView)findViewById(R.id.imageView);
            imgView.setBackgroundResource(R.drawable.bottle);

            ImageView imgView2 = (ImageView)findViewById(R.id.imageView2);
            imgView2.setBackgroundResource(R.drawable.cawan);

            ImageView imgView3 = (ImageView)findViewById(R.id.imageView3);
            imgView3.setBackgroundResource(R.drawable.pinggan);

            ImageView imgView4 = (ImageView)findViewById(R.id.imageView4);
            imgView4.setBackgroundResource(R.drawable.teapot);
        }

        questionTextViewReading.setText(QuestionAnswerReading.question[currentQuestionIndexReading]);
        answerA.setText(QuestionAnswerReading.choices[currentQuestionIndexReading][0]);
        answerB.setText(QuestionAnswerReading.choices[currentQuestionIndexReading][1]);
        answerC.setText(QuestionAnswerReading.choices[currentQuestionIndexReading][2]);
        answerD.setText(QuestionAnswerReading.choices[currentQuestionIndexReading][3]);
    }

    void finishQuiz() {
        String passStatus = "";
        if(scoreReading > totalQuestionReading * 0.60) {
            passStatus = "Lulus";
        } else {
            passStatus = "Gagal";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Skor anda ialah  "+ scoreReading+" daripada "+ totalQuestionReading)
                .setPositiveButton("Ulang Semula",(dialogInterface, i) -> restartQuiz() )
                .setCancelable(false)
                .show();
    }

    void restartQuiz() {
        scoreReading = 0;
        currentQuestionIndexReading = 0;
        loadNewQuestion();
    }
}









