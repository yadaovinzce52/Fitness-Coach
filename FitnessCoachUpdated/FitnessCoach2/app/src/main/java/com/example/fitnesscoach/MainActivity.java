package com.example.fitnesscoach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button_plan1, button_plan2;
    Button button_plan3, button_plan4;
    Button button_plan5, button_plan6;

    TextView textView;

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

        Intent workout = getIntent();
        Intent newIntent = getIntent();

        /*textView = (TextView) findViewById(R.id.textView);

        String experienceString = getIntent().getExtras().getString("exp");
        String numberString = getIntent().getExtras().getString("availability");

        // 1, 3, and 5 are the "beginner" workouts

        assert experienceString != null;
        if (experienceString.equals("Beginner")) {
            if (numberString.equals("1") || numberString.equals("2")) {
                textView.setText("You are : " + experienceString + "\nYour availability: " + numberString + " days per week\nBased off this we recommend: Workout Plan 1");
            }
            else if (numberString.equals("3") || numberString.equals("4")) {
                textView.setText("You are : " + experienceString + "\nYour availability: " + numberString + " days per week\nBased off this we recommend: Workout Plan 3");
            }
            else {
                textView.setText("You are : " + experienceString + "\nYour availability: " + numberString + " days per week\nBased off this we recommend: Workout Plan 5");
            }
        } else {
            if (numberString.equals("1") || numberString.equals("2")) {
                textView.setText("You are : " + experienceString + "\nYour availability: " + numberString + " days per week\nBased off this we recommend: Workout Plan 2");
            }
            else if (numberString.equals("3") || numberString.equals("4")) {
                textView.setText("You are : " + experienceString + "\nYour availability: " + numberString + " days per week\nBased off this we recommend: Workout Plan 4");
            }
            else {
                textView.setText("You are : " + experienceString + "\nYour availability: " + numberString + " days per week\nBased off this we recommend: Workout Plan 6");
            }
        }*/

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