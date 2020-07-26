package com.example.myfitnesscoach;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    Button button_plan1, button_plan2;
    Button button_plan3, button_plan4;
    Button button_plan5, button_plan6;

    Button button_meal1, button_meal2;
    Button button_meal3, button_meal4;
    Button button_meal5, button_meal6;

    String string_activity = " ";
    String string_meal = " ";


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

        button_meal1 = (Button) findViewById(R.id.button_meal1);
        button_meal2 = (Button) findViewById(R.id.button_meal2);
        button_meal3 = (Button) findViewById(R.id.button_meal3);
        button_meal4 = (Button) findViewById(R.id.button_meal4);
        button_meal5 = (Button) findViewById(R.id.button_meal5);
        button_meal6 = (Button) findViewById(R.id.button_meal6);

        button_meal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string_meal = "https://youtu.be/f3vDx2qBcNI";
                openMeal_plan();
            }
        });

        button_meal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string_meal = "https://youtu.be/Q89St6BTxIQ";
                openMeal_plan();
            }
        });

        button_meal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string_meal = "https://youtu.be/XeSL_jzMedU";
                openMeal_plan();
            }
        });

        button_meal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string_meal = "https://youtu.be/6fV54bvkXWI";
                openMeal_plan();
            }
        });

        button_meal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string_meal = "https://youtu.be/tYAcMeDA1qU";
                openMeal_plan();
            }
        });

        button_meal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string_meal = "https://youtu.be/Zxuwkptf-Es";
                openMeal_plan();
            }
        });

        button_plan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string_activity = "https://youtu.be/7qFp5khuoFA";
                openActivity_plan();
            }
        });

        button_plan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string_activity = "https://youtu.be/3IQVNjWH60A";
                openActivity_plan();
            }
        });

        button_plan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string_activity = "https://youtu.be/7USunyFGITk";
                openActivity_plan();
            }
        });

        button_plan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string_activity = "https://youtu.be/didU4ZwAkPI";
                openActivity_plan();
            }
        });

        button_plan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string_activity = "https://youtu.be/R38OvrWZLSw";
                openActivity_plan();
            }
        });

        button_plan6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string_activity = "https://youtu.be/3hyuPjZDveI";
                openActivity_plan();
            }
        });

    }

    private void openActivity_plan() {
//        Intent intent = new Intent(this, LoadWeb.class);
//        intent.putExtra("URL", "https://youtu.be/3hyuPjZDveI");
//        startActivity(intent);
        webView = (WebView) findViewById(R.id.webView_main);
        webView.loadUrl(string_activity);
    }

    private void openMeal_plan() {
        webView = (WebView) findViewById(R.id.webView_main);
        webView.loadUrl(string_meal);
    }







}