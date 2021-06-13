package com.example.assignment1_quiz;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //variable declaration
    Button button1,button2,button3;
    ImageView celeb_pic;
    TextView score;

    private final Images pic = new Images();
    private int finalScore = 0;
    private  String Answer;
    private final int imagesLength = pic.pictures.length;

    Random random;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();

        button1 = findViewById(R.id.butn1);
        button2 = findViewById(R.id.butn2);
        button3 =  findViewById(R.id.butn3);
        celeb_pic = findViewById(R.id.celeb_pic);
        score = findViewById(R.id.score);

        score.setText("Your score: " + finalScore +" points");
        updateImage(random.nextInt(imagesLength));

        //setting buttons responce when clicked and updating score
        button1.setOnClickListener(v -> {
            if (button1.getText() == Answer) {
                finalScore++;
                score.setText("Your score: " + finalScore +" points");
                updateImage(random.nextInt(imagesLength));
            }

        });
        button2.setOnClickListener(v -> {
            if (button2.getText() == Answer) {
                finalScore++;
                score.setText("Your score: " + finalScore +" points");
                updateImage(random.nextInt(imagesLength));
            }
        });

        button3.setOnClickListener(v -> {
            if (button3.getText() == Answer) {
                finalScore++;
                score.setText("Your score: " + finalScore +" points");
                updateImage(random.nextInt(imagesLength));
            }
        });
        }

        //updating image and answers
    private void updateImage(int i) {
        celeb_pic.setImageResource(pic.getPic(i));
        button1.setText(pic.getChoice1(i));
        button2.setText(pic.getChoice2(i));
        button3.setText(pic.getChoice3(i));

        Answer = pic.getCorrectAnswer(i);
    }
}