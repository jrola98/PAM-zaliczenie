package com.example.projektzaliczeniowy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {
    char operator;
    int numA, numB;

    Button backToMain, zero, one, two, three, four, five, six,
            seven, eight, nine, plus, minus, multiply, div, equals, clear;

    EditText solutionView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        backToMain = findViewById(R.id.backToMain);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        div = findViewById(R.id.div);
        equals = findViewById(R.id.equals);
        clear = findViewById(R.id.clear);


        solutionView = findViewById(R.id.solutionView);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solutionView.setText(solutionView.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solutionView.setText(solutionView.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solutionView.setText(solutionView.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solutionView.setText(solutionView.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solutionView.setText(solutionView.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solutionView.setText(solutionView.getText() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solutionView.setText(solutionView.getText() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solutionView.setText(solutionView.getText() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solutionView.setText(solutionView.getText() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solutionView.setText(solutionView.getText() + "0");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numA = Integer.parseInt(solutionView.getText() + "");
                operator = '+';
                solutionView.setText(null);

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numA = Integer.parseInt(solutionView.getText() + "");
                operator = '-';
                solutionView.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numA = Integer.parseInt(solutionView.getText() + "");
                operator = '*';
                solutionView.setText(null);

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numA = Integer.parseInt(solutionView.getText() + "");
                operator = '/';
                solutionView.setText(null);

            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numB = Integer.parseInt(solutionView.getText() + "");

                switch(operator){
                    case '+':
                        solutionView.setText(numA + numB + "");
                        operator = Character.MIN_VALUE;
                        break;
                    case '-':
                        solutionView.setText(numA - numB + "");
                        operator = Character.MIN_VALUE;
                        break;
                    case '*':
                        solutionView.setText(numA * numB + "");
                        operator = Character.MIN_VALUE;
                        break;
                    case '/':
                        if (numB == 0) solutionView.setText("Error");
                        else solutionView.setText(numA / numB + "");
                        operator = Character.MIN_VALUE;
                        break;
                }

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solutionView.setText(null);
                operator = Character.MIN_VALUE;
            }
        });

        backToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}