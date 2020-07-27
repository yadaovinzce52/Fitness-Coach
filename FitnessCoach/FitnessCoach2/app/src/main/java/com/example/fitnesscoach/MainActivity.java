package com.example.fitnesscoach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button_plan1, button_plan2;
    Button button_plan3, button_plan4;
    Button button_plan5, button_plan6;

    String key = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_plan1 = (Button) findViewById(R.id.button_plan1);
        button_plan2 = (Button) findViewById(R.id.button_plan2);
        button_plan3 = (Button) findViewById(R.id.button_plan3);
        button_plan4 = (Button) findViewById(R.id.button_plan4);
        button_plan5 = (Button) findViewById(R.id.button_plan5);
        button_plan6 = (Button) findViewById(R.id.button_plan6);

        button_plan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = "1";
                openActivity_plan();
            }
        });

        button_plan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = "2";
                openActivity_plan();
            }
        });

        button_plan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = "3";
                openActivity_plan();
            }
        });

        button_plan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = "4";
                openActivity_plan();
            }
        });

        button_plan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = "5";
                openActivity_plan();
            }
        });

        button_plan6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key = "6";
                openActivity_plan();
            }
        });
    }

    private void openActivity_plan() {
        Intent intent = new Intent(this, LoadWorkout.class);
        intent.putExtra("URL", key);
        startActivity(intent);
    }









}