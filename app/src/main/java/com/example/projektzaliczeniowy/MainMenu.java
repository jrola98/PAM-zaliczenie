package com.example.projektzaliczeniowy;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {
    Button bmi, calculator, newActivity;
    TextView greeting, newText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        bmi = (Button) findViewById(R.id.bmi);
        calculator = (Button) findViewById(R.id.calculator);
        greeting = (TextView) findViewById(R.id.greeting);
        newText = findViewById(R.id.newText);
        newActivity = findViewById(R.id.newActivity);

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

        newActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNewActivity();
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

    private  void startNewActivity(){
        Intent newActivity = new Intent(this, Ocena.class);
        startActivityForResult(newActivity, 2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2){
            if (resultCode == Activity.RESULT_OK){
                String result = data.getStringExtra("result");
                newText.setText(result);
            }
        }
    }
}