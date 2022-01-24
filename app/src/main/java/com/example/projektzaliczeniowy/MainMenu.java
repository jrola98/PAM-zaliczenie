package com.example.projektzaliczeniowy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {
    Button bmi, calculator;
    TextView greeting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        bmi = (Button) findViewById(R.id.bmi);
        calculator = (Button) findViewById(R.id.calculator);
        greeting = (TextView) findViewById(R.id.greeting);

        Intent intent = getIntent();
        String name = intent.getExtras().getString("name");
        greeting.setText(getString(R.string.greeting) + " "+ name);


        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startBmi();
            }
        });

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startCalculator();
            }
        });
    }




    private void startBmi(){
        Intent startBmi = new Intent(this, bmi.class);
        startActivity(startBmi);
    }

    private void startCalculator(){
        Intent startCalculator = new Intent(this, Calculator.class);
        startActivity(startCalculator);
    }
}