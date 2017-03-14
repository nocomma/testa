package com.comma.iqtest;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PictureTest extends AppCompatActivity {
    private PictureLibrary mPictureLibrary = new PictureLibrary();

    private TextView mKlnrView2;
    private ImageView mMainPicture;
    private ImageButton mimageButton1;
    private ImageButton mimageButton2;
    private ImageButton mimageButton3;
    private ImageButton mimageButton4;

    private int[] mAnswer2;
    private int mScore2 = 0;
    private int mQuestionNumber2 = 0;
    private int mKlnr2 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture_test);

        mMainPicture = (ImageView) findViewById(R.id.imageView2);
        mKlnrView2 = (TextView) findViewById(R.id.Klnr2);
        mimageButton1 = (ImageButton) findViewById(R.id.imageButton1);
        mimageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        mimageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        mimageButton4 = (ImageButton) findViewById(R.id.imageButton4);


        updateQuestion();

        updateScore(mKlnr2);



        mimageButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int [] pleasework = (int[])mimageButton1.getTag();
                mKlnr2 = mKlnr2 + 1;
                if (mKlnr2<11)updateScore(mKlnr2);
                if (pleasework == mAnswer2) {
                    mScore2 = mScore2 + 7;

                    if (mQuestionNumber2 == 10) {
                        Intent i = new Intent(PictureTest.this, Rezultatai.class);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("finalScore2", mScore2);
                        i.putExtras(bundle2);
                        PictureTest.this.finish();
                        startActivity(i);
                    } else {updateQuestion();}


                }
                else {
                    if (mQuestionNumber2 == 10) {
                        Intent i = new Intent(PictureTest.this, Rezultatai.class);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("finalScore2", mScore2);
                        i.putExtras(bundle2);
                        PictureTest.this.finish();
                        startActivity(i);
                    } else {updateQuestion();}
                }
            }
        });

        mimageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int [] pleasework = (int[])mimageButton1.getTag();
                mKlnr2 = mKlnr2 + 1;
                if (mKlnr2<11)updateScore(mKlnr2);
                if (pleasework == mAnswer2) {
                    mScore2 = mScore2 + 7;

                    if (mQuestionNumber2 == 10) {
                        Intent i = new Intent(PictureTest.this, Rezultatai.class);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("finalScore2", mScore2);
                        i.putExtras(bundle2);
                        PictureTest.this.finish();
                        startActivity(i);
                    } else {updateQuestion();}

                }
                else {
                    if (mQuestionNumber2 == 10) {
                        Intent i = new Intent(PictureTest.this, Rezultatai.class);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("finalScore2", mScore2);
                        i.putExtras(bundle2);
                        PictureTest.this.finish();
                        startActivity(i);
                    } else {updateQuestion();}
                }
            }
        });


        mimageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int [] pleasework = (int[])mimageButton1.getTag();
                mKlnr2 = mKlnr2 + 1;
                if (mKlnr2<11)updateScore(mKlnr2);
                if (pleasework == mAnswer2) {
                    mScore2 = mScore2 + 7;

                    if (mQuestionNumber2 == 10) {
                        Intent i = new Intent(PictureTest.this, Rezultatai.class);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("finalScore2", mScore2);
                        i.putExtras(bundle2);
                        PictureTest.this.finish();
                        startActivity(i);
                    } else {updateQuestion();}

                }
                else {
                    if (mQuestionNumber2 == 10) {
                        Intent i = new Intent(PictureTest.this, Rezultatai.class);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("finalScore2", mScore2);
                        i.putExtras(bundle2);
                        PictureTest.this.finish();
                        startActivity(i);
                    } else {updateQuestion();}
                }
            }
        });


        mimageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int [] pleasework = (int[])mimageButton1.getTag();
                mKlnr2 = mKlnr2 + 1;
                if (mKlnr2<11)updateScore(mKlnr2);
                if (pleasework == mAnswer2) {
                    mScore2 = mScore2 + 7;

                    if (mQuestionNumber2 == 10) {
                        Intent i = new Intent(PictureTest.this, Rezultatai.class);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("finalScore2", mScore2);
                        i.putExtras(bundle2);
                        PictureTest.this.finish();
                        startActivity(i);
                    } else {updateQuestion();}

                }
                else {
                    if (mQuestionNumber2 == 10) {
                        Intent i = new Intent(PictureTest.this, Rezultatai.class);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("finalScore2", mScore2);
                        i.putExtras(bundle2);
                        PictureTest.this.finish();
                        startActivity(i);
                    } else {updateQuestion();}
                }

            }
        });


    }

    private void updateQuestion() {
        mMainPicture.setImageResource(mPictureLibrary.getQuestion2(mQuestionNumber2));
        mimageButton1.setImageResource(mPictureLibrary.getChoice12(mQuestionNumber2));
        mimageButton2.setImageResource(mPictureLibrary.getChoice22(mQuestionNumber2));
        mimageButton3.setImageResource(mPictureLibrary.getChoice32(mQuestionNumber2));
        mimageButton4.setImageResource(mPictureLibrary.getChoice42(mQuestionNumber2));

        mAnswer2 = mPictureLibrary.getCorrectAnswers2(mQuestionNumber2);
        mQuestionNumber2++;
    }


    private void updateScore(int point) {mKlnrView2.setText(mKlnr2 + ".");
    }


    public void clickExit(View view) {
        askToClose();
    }


    @Override
    public void onBackPressed() {
        askToClose();
    }

    private void askToClose (){
        AlertDialog.Builder builder = new AlertDialog.Builder(PictureTest.this);
        builder.setMessage("Ar tikrai norite grižti i pradžia? Jusu atsakymai nebus išsaugoti.");
        builder.setCancelable(true);
        builder.setPositiveButton("Taip", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });
        builder.setNegativeButton("Ne", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();

            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
