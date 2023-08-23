package com.example.contclick;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tvResultado;
    EditText p1,p2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1=findViewById(R.id.p1);
        p2=findViewById(R.id.p2);
        tvResultado = findViewById(R.id.calc);
    }

    public void sort(View w){

        int num1 = Integer.parseInt(p1.getText().toString());
        int num2 = Integer.parseInt(p2.getText().toString());

        Random rand = new Random();
        int randomNum = rand.nextInt((num2 - num1) + 1) + num1;
        tvResultado.setText(Integer.toString(randomNum));
    }
}