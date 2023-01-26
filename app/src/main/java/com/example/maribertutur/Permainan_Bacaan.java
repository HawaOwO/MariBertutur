package com.example.maribertutur;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Permainan_Bacaan extends AppCompatActivity implements View.OnClickListener {

    TextView totalQuestionView;
    TextView questionTextViewReading;
    Button answerA, answerB, answerC, answerD;
    Button submitButton;
    ImageButton playBtn, pauseBtn;
    public Button gameButton;

    int scoreReading=0;
    int totalQuestionReading = QuestionAnswerReading.question.length;
    int currentQuestionIndexReading = 0;
    String selectedAnswerReading = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permainan_bacaan);

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

        playBtn = (ImageButton) findViewById(R.id.playbutton);
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent = new Intent(Permainan_Bacaan.this, MusicService.class);
                startService(serviceIntent);
            }
        });

        pauseBtn = (ImageButton) findViewById(R.id.pausebutton);
        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent = new Intent(Permainan_Bacaan.this, MusicService.class);
                stopService(serviceIntent);
            }
        });
    }

    @Override
    public void onClick(View view) {

        answerA.setBackgroundColor(Color.YELLOW);
        answerB.setBackgroundColor(Color.YELLOW);
        answerC.setBackgroundColor(Color.YELLOW);
        answerD.setBackgroundColor(Color.YELLOW);

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
            ImageView imgView = (ImageView) findViewById(R.id.imageView);
            imgView.setBackgroundResource(R.drawable.bus);
            ImageView imgView2 = (ImageView) findViewById(R.id.imageView2);
            imgView2.setBackgroundResource(R.drawable.rocket);
            ImageView imgView3 = (ImageView) findViewById(R.id.imageView4);
            imgView3.setBackgroundResource(R.drawable.car);
            ImageView imgView4 = (ImageView) findViewById(R.id.imageView5);
            imgView4.setBackgroundResource(R.drawable.truck);
        }


        else if(currentQuestionIndexReading == 1)
        {
            ImageView imgView = (ImageView)findViewById(R.id.imageView);
            imgView.setBackgroundResource(R.drawable.burger);

            ImageView imgView2 = (ImageView)findViewById(R.id.imageView2);
            imgView2.setBackgroundResource(R.drawable.icecream);

            ImageView imgView3 = (ImageView)findViewById(R.id.imageView4);
            imgView3.setBackgroundResource(R.drawable.peas);

            ImageView imgView4 = (ImageView)findViewById(R.id.imageView5);
            imgView4.setBackgroundResource(R.drawable.candy);
        }

        else if(currentQuestionIndexReading == 2)
        {
            ImageView imgView = (ImageView)findViewById(R.id.imageView);
            imgView.setBackgroundResource(R.drawable.ball);

            ImageView imgView2 = (ImageView)findViewById(R.id.imageView2);
            imgView2.setBackgroundResource(R.drawable.boat);

            ImageView imgView3 = (ImageView)findViewById(R.id.imageView4);
            imgView3.setBackgroundResource(R.drawable.chair);

            ImageView imgView4 = (ImageView)findViewById(R.id.imageView5);
            imgView4.setBackgroundResource(R.drawable.hat);
        }

        else if(currentQuestionIndexReading == 3)
        {
            ImageView imgView = (ImageView)findViewById(R.id.imageView);
            imgView.setBackgroundResource(R.drawable.cow);

            ImageView imgView2 = (ImageView)findViewById(R.id.imageView2);
            imgView2.setBackgroundResource(R.drawable.bird);

            ImageView imgView3 = (ImageView)findViewById(R.id.imageView4);
            imgView3.setBackgroundResource(R.drawable.lion);

            ImageView imgView4 = (ImageView)findViewById(R.id.imageView5);
            imgView4.setBackgroundResource(R.drawable.rabbit);
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
