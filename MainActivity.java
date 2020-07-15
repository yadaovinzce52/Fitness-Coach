package com.example.myfitnesscoach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    Button button_plan1, button_plan2;
    Button button_plan3, button_plan4;
    Button button_plan5, button_plan6;


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
                openActivity_plan1();
            }
        });

        button_plan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_plan2();
            }
        });

        button_plan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_plan3();
            }
        });

        button_plan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_plan4();
            }
        });

        button_plan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_plan5();
            }
        });

        button_plan6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_plan6();
            }
        });

    }

    private void openActivity_plan6() {
        Intent intent = new Intent(this, LoadWeb.class);
        intent.putExtra("URL", "https://youtu.be/3hyuPjZDveI");
        startActivity(intent);
    }

    private void openActivity_plan5() {
        Intent intent = new Intent(this, LoadWeb.class);
        intent.putExtra("URL", "https://youtu.be/R38OvrWZLSw");
        startActivity(intent);
    }

    private void openActivity_plan4() {
        Intent intent = new Intent(this, LoadWeb.class);
        intent.putExtra("URL", "https://youtu.be/didU4ZwAkPI");
        startActivity(intent);
    }

    private void openActivity_plan3() {
        Intent intent = new Intent(this, LoadWeb.class);
        intent.putExtra("URL", "https://youtu.be/7USunyFGITk");
        startActivity(intent);
    }


    private void openActivity_plan2() {
        Intent intent = new Intent(this, LoadWeb.class);
        intent.putExtra("URL", "https://youtu.be/3IQVNjWH60A");
        startActivity(intent);
    }

    private void openActivity_plan1() {
        Intent intent = new Intent(this, LoadWeb.class);
        intent.putExtra("URL", "https://youtu.be/7qFp5khuoFA");
        startActivity(intent);
    }

}