package com.example.projektzaliczeniowy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class bmi extends AppCompatActivity {
    private EditText height, weight, answer, answerText;
    private Button submit, previous;

    double weightMetric, heightMetric, bmi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        weight = (EditText) findViewById(R.id.weight);
        height = (EditText) findViewById(R.id.height);
        answer = (EditText) findViewById(R.id.bmiAnswer2);
        answerText = (EditText) findViewById(R.id.bmiTextAnswer);


        submit = (Button) findViewById(R.id.bmiSubmit);
        previous = (Button) findViewById(R.id.previous);

       submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (weight.length() == 0 || height.length() == 0) {
                    Toast.makeText(bmi.this, getString(R.string.toastBmi), Toast.LENGTH_SHORT).show();

                } else {
                    weightMetric = Double.parseDouble(weight.getText().toString());
                    heightMetric = Double.parseDouble(height.getText().toString());

                    bmi = heightMetric / (weightMetric * weightMetric);

                    answer.setText(String.valueOf(bmi));

                    if (bmi < 18.5) answerText.setText(getString(R.string.underweight));
                    else if (bmi >= 18.5 && bmi < 25) answerText.setText(getString(R.string.healthy));
                    else if (bmi >= 25 && bmi < 30) answerText.setText(getString(R.string.overweight));
                    else if (bmi >= 30) answerText.setText(getString(R.string.obesity));
                }
            }


        });







        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}