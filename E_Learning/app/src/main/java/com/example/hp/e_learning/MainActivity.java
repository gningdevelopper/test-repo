package com.example.hp.e_learning;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


import cn.pedant.SweetAlert.SweetAlertDialog;

public class MainActivity extends AppCompatActivity {

    Button answer1, answer2,answer3,answer4;
    TextView question, score,noQuestion;
    private Questions mQuestions=new Questions();
    private String manswer;
    private int mscore;
    ProgressBar progres;
    private int mQuestionLength=mQuestions.mQuestions.length;

    int currentposition=0;
    int numberofCorrectAnswer=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer1=(Button)findViewById(R.id.answer1);
        answer2=(Button)findViewById(R.id.answer2);
        answer3=(Button)findViewById(R.id.answer3);
        answer4=(Button)findViewById(R.id.answer4);
        noQuestion=(TextView)findViewById(R.id.noQuestion);
        progres=(ProgressBar)findViewById(R.id.progress);

        question=(TextView)findViewById(R.id.question);
        score=(TextView)findViewById(R.id.score);
        noQuestion.setText("Question No : "+currentposition);
        score.setText("Score :"+numberofCorrectAnswer+"/"+mQuestionLength);

        updateQuestion();
        answer1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(answer1.getText()==manswer)
                {
                    numberofCorrectAnswer++;
                    //score.setText("Score :"+numberofCorrectAnswer+"/"+mQuestionLength);

                    updateQuestion();


                }

                /*else
                    gameOver();*/
                if(currentposition==10)
                {
                    gameOver();
                }
                else
                    currentposition++;
                int x=((currentposition+1)*100)/mQuestionLength;
                progres.setProgress(x);

            }
        });

        answer2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                if(answer2.getText()==manswer)
                {
                    numberofCorrectAnswer++;
                    //score.setText("Score :"+numberofCorrectAnswer+"/"+mQuestionLength);
                    //noQuestion.setText("Question No : "+currentposition);
                    updateQuestion();


                }

                /*else
                    gameOver();*/
                if(currentposition==10)
                {
                    gameOver();
                }
                else
                    currentposition++;
                int x=((currentposition+1)*100)/mQuestionLength;
                progres.setProgress(x);
            }

        });

        answer3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(answer3.getText()==manswer)
                {
                    numberofCorrectAnswer++;
                    updateQuestion();


                }

                /*else
                    gameOver();*/
                if(currentposition==10)
                {
                    gameOver();
                }
                else
                    currentposition++;
                int x=((currentposition+1)*100)/mQuestionLength;
                progres.setProgress(x);


            }
        });

        answer4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(answer4.getText()==manswer)
                {
                    numberofCorrectAnswer++;
                    updateQuestion();


                }

                /*else
                    gameOver();*/
                if(currentposition==10)
                {
                    gameOver();
                }
                else
                    currentposition++;
                int x=((currentposition+1)*100)/mQuestionLength;
                progres.setProgress(x);

            }


        });
    }

    private void gameOver() {
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("GAME OVER SCORE : "+mscore)
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            }
                        })
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                finish();
                            }
                        });
        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();
    }

    public void updateQuestion(){
        question.setText(mQuestions.getQuestion(currentposition));

        //question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(currentposition));
        answer2.setText(mQuestions.getchoice2(currentposition));
        answer3.setText(mQuestions.getChoice3(currentposition));
        answer4.setText(mQuestions.getChoice4(currentposition));
        manswer=mQuestions.getCorrectAnswer(currentposition);

        score.setText("Score :"+numberofCorrectAnswer+"/"+mQuestionLength);
        noQuestion.setText("Question No : "+currentposition+1);
    }


}
