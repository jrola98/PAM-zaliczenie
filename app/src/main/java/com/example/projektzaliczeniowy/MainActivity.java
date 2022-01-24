package com.example.projektzaliczeniowy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText nameInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = (Button) findViewById(R.id.submit);
        nameInput = (EditText) findViewById(R.id.nameInput);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String str = nameInput.getText().toString();
            startMainMenu(str);
            }
        });

    }

    private void startMainMenu(String str){
        Intent startMenu = new Intent(this, MainMenu.class);
        startMenu.putExtra("name", str);
        startActivity(startMenu);
    }
}