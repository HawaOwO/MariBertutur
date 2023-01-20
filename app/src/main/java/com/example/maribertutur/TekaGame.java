package com.example.maribertutur;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;

public class TekaGame extends AppCompatActivity implements View.OnClickListener{

    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ansA, ansB, ansC, ansD;
    Button submitBtn;
    public Button TTGameBtn;
    MediaPlayer suara, finishing;


    int score=0;
    int totalQuestion = QuestionAnswer.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teka_game);

        totalQuestionsTextView = findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);
        submitBtn = findViewById(R.id.submit_btn);

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);

        //totalQuestionsTextView.setText("Jumlah Soalan : "+totalQuestion);

        loadNewQuestion();

        TTGameBtn = (Button) findViewById(R.id.TTGameToMenu);
        TTGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(TekaGame.this, MainActivity2.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
            //to able user to go back to the Menu page aka MainActivity2 when click on the 'Kembali Ke Menu' Button
        });
    }


    @Override
    public void onClick(View view) {

        ansA.setBackgroundColor(Color.CYAN);
        ansB.setBackgroundColor(Color.CYAN);
        ansC.setBackgroundColor(Color.CYAN);
        ansD.setBackgroundColor(Color.CYAN);

        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.submit_btn){
            if(selectedAnswer.equals(QuestionAnswer.correctAnswers[currentQuestionIndex])){
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();


        }else{
            //choices button clicked
            selectedAnswer  = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.WHITE);
            if(currentQuestionIndex==0)
            {
                switch(view.getId()){
                    case R.id.ans_A:
                        suara = MediaPlayer.create(this, R.raw.game_teka_kucing);
                        suara.start();
                        break;
                    case R.id.ans_B:
                        suara = MediaPlayer.create(this, R.raw.game_teka_anjing);
                        suara.start();
                        break;
                    case R.id.ans_C:
                        suara = MediaPlayer.create(this, R.raw.game_teka_lembu);
                        suara.start();
                        break;
                    case R.id.ans_D:
                        suara = MediaPlayer.create(this, R.raw.game_teka_ayam);
                        suara.start();
                        break;
                    default:
                        return;

                }

            }
            else if(currentQuestionIndex==1)
            {
                switch(view.getId()){
                    case R.id.ans_A:
                        suara = MediaPlayer.create(this, R.raw.game_teka_kerusi);
                        suara.start();
                        break;
                    case R.id.ans_B:
                        suara = MediaPlayer.create(this, R.raw.game_teka_rumah);
                        suara.start();
                        break;
                    case R.id.ans_C:
                        suara = MediaPlayer.create(this, R.raw.game_teka_orang);
                        suara.start();
                        break;
                    case R.id.ans_D:
                        suara = MediaPlayer.create(this, R.raw.game_teka_haiwan);
                        suara.start();
                        break;
                    default:
                        return;

                }

            }
            else if(currentQuestionIndex==2)
            {
                switch(view.getId()){
                    case R.id.ans_A:
                        suara = MediaPlayer.create(this, R.raw.game_teka_bayi);
                        suara.start();
                        break;
                    case R.id.ans_B:
                        suara = MediaPlayer.create(this, R.raw.game_teka_anak);
                        suara.start();
                        break;
                    case R.id.ans_C:
                        suara = MediaPlayer.create(this, R.raw.game_teka_wanita);
                        suara.start();
                        break;
                    case R.id.ans_D:
                        suara = MediaPlayer.create(this, R.raw.game_teka_lelaki);
                        suara.start();
                        break;
                    default:
                        return;

                }
            }
            else if(currentQuestionIndex==3)
            {
                switch(view.getId()){
                    case R.id.ans_A:
                        suara = MediaPlayer.create(this, R.raw.game_teka_lima);
                        suara.start();
                        break;
                    case R.id.ans_B:
                        suara = MediaPlayer.create(this, R.raw.game_teka_enam);
                        suara.start();
                        break;
                    case R.id.ans_C:
                        suara = MediaPlayer.create(this, R.raw.game_teka_satu);
                        suara.start();
                        break;
                    case R.id.ans_D:
                        suara = MediaPlayer.create(this, R.raw.game_teka_tiga);
                        suara.start();
                        break;
                    default:
                        return;

                }
            }

        }

    }

    void loadNewQuestion(){

        if(currentQuestionIndex == totalQuestion ){
            finishQuiz();
            return;
        }

        if(currentQuestionIndex==0)
        {
            ImageView imgView = (ImageView)findViewById(R.id.imageView3);
            imgView.setBackgroundResource(R.drawable.cat);
        }

        else if(currentQuestionIndex==1)
        {
            ImageView imgView = (ImageView)findViewById(R.id.imageView3);
            imgView.setBackgroundResource(R.drawable.house);
        }

        else if(currentQuestionIndex==2)
        {
            ImageView imgView = (ImageView)findViewById(R.id.imageView3);
            imgView.setBackgroundResource(R.drawable.woman);
        }
        else if(currentQuestionIndex==3)
        {
            ImageView imgView = (ImageView)findViewById(R.id.imageView3);
            imgView.setBackgroundResource(R.drawable.three);
        }

        questionTextView.setText(QuestionAnswer.question[currentQuestionIndex]);
        ansA.setText(QuestionAnswer.choices[currentQuestionIndex][0]);
        ansB.setText(QuestionAnswer.choices[currentQuestionIndex][1]);
        ansC.setText(QuestionAnswer.choices[currentQuestionIndex][2]);
        ansD.setText(QuestionAnswer.choices[currentQuestionIndex][3]);

    }

    void finishQuiz(){
        String passStatus = "";
        if(score > totalQuestion*0.60){
            passStatus = "Lulus";
            finishing = MediaPlayer.create(this, R.raw.game_teka_lulus);
            finishing.start();
        }else{
            passStatus = "Gagal";
            finishing = MediaPlayer.create(this, R.raw.game_teka_gagal);
            finishing.start();
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Skor anda ialah  "+ score+" daripada "+ totalQuestion)
                .setPositiveButton("Ulang Semula",(dialogInterface, i) -> restartQuiz() )
                .setCancelable(false)
                .show();


    }

    void restartQuiz(){
        score = 0;
        currentQuestionIndex =0;
        loadNewQuestion();
    }


}