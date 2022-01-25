package com.example.projektzaliczeniowy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ocena extends AppCompatActivity {

    EditText gradeInput;
    Button gradeSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocena);

        gradeInput = findViewById(R.id.gradeInput);
        gradeSubmit = findViewById(R.id.button);

        gradeSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                String s = gradeInput.getText().toString();
                i.putExtra("result", s);
                setResult(RESULT_OK, i);
                finish();
            }
        });

    }


}