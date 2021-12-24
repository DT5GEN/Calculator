package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivityCalculator extends AppCompatActivity {
    private TextView  button1;
    private TextView  button2;
    private TextView  button3;
    private TextView  button4;
    private TextView  button5;
    private TextView  button6;
    private TextView  button7;
    private TextView  button8;
    private TextView  button9;
    private TextView  button0;
    private TextView  buttonResult;
    private TextView  buttonDot;
    private TextView  buttonReset;
    private TextView  buttonSeparation;
    private TextView  buttonMultiplication;
    private TextView  buttonBackspace;
    private TextView  buttonSubtraction;
    private TextView  buttonPercent;
    private TextView  buttonSum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_constraint_layout);
        button0 = findViewById(R.id.button_0_text_view);
        button1 = findViewById(R.id.button_1_text_view);
        button2 = findViewById(R.id.button_2_text_view);
        button3 = findViewById(R.id.button_3_text_view);
        button4 = findViewById(R.id.button_4_text_view);
        button5 = findViewById(R.id.button_5_text_view);
        button6 = findViewById(R.id.button_6_text_view);
        button7 = findViewById(R.id.button_7_text_view);
        button8 = findViewById(R.id.button_8_text_view);
        button9 = findViewById(R.id.button_9_text_view);

        button0.setOnClickListener(onButtonClickListener);
        button1.setOnClickListener(onButtonClickListener);
        button2.setOnClickListener(onButtonClickListener);
        button3.setOnClickListener(onButtonClickListener);
        button4.setOnClickListener(onButtonClickListener);
        button5.setOnClickListener(onButtonClickListener);
        button6.setOnClickListener(onButtonClickListener);
        button7.setOnClickListener(onButtonClickListener);
        button8.setOnClickListener(onButtonClickListener);
        button9.setOnClickListener(onButtonClickListener);

        Toast.makeText(MainActivityCalculator.this, "Sobrano!", Toast.LENGTH_SHORT).show();

    }

    private View.OnClickListener onButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
         //   button9.setTextColor(new Random().nextInt());
            Toast.makeText(MainActivityCalculator.this,"Button Otclickana",Toast.LENGTH_SHORT).show();

        }
    };

    @Override
    protected void onStart() {
        super.onStart();
    }

}