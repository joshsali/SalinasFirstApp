package com.example.salinasfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText myName;
    TextView display;
    Button enter;
    Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myName = findViewById(R.id.txtMyName);
        display = findViewById(R.id.txtDisplay);
        enter = findViewById(R.id.btnEnter);
        clear = findViewById(R.id.btnClear);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String MyValue = myName.getText().toString();
                display.setText("Hello "+MyValue+"!");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("Hello!");
                myName.setText(" ");
            }
        });
    }
}