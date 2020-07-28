package com.example.fitnesscoach;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoadWorkout extends AppCompatActivity {

    TextView textView, textView_diet;

    Button button_bench, button_diet, button_squat, button_ohp;

    String string_vid = " ";

    Boolean isKeto = false;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_workout);

        textView = (TextView) findViewById(R.id.textView_1);
        textView_diet = (TextView) findViewById(R.id.textView_mealRec);

        button_bench = (Button) findViewById(R.id.button_bench);
        button_ohp = (Button) findViewById(R.id.button_ohp);
        button_squat = (Button) findViewById(R.id.button_squat);

        button_diet = (Button) findViewById(R.id.button_diet);

        String url = getIntent().getExtras().getString("URL");
        assert url != null;
        if (url.equals("1")) {
            textView.setText("Day 1\n" + "Bench Press: 5x5 @ 225\n" + "Squat: 5x5 @ 315\n\n" +
                    "Optional: Day 2\n" + "Overhead Press: 5x5 @185\n" + "Front Squats: 5x5 @275\n\n");
        } else if (url.equals("2")) {
            textView.setText("Day 1\n" + "Bench Press: 10x5 @ 225\n" + "Squat: 10x5 @ 315\n\n" +
                    "Day 2\n" + "Overhead Press: 10x5 @185\n" + "Front Squats: 10x5 @275\n\n");
        } else if (url.equals("3")) {
            textView.setText("Day 1\n" + "Bench Press: 5x5 @ 225\n" + "Squat: 5x5 @ 315\n\n" +
                    "Day 2\n" + "Overhead Press: 5x5 @185\n" + "Front Squats: 5x5 @275\n\n" +
                    "Day 3\n" + "4x400m sprints with 2:00 recoveries\n\n");
        } else if (url.equals("4")) {
            textView.setText("Day 1\n" + "Bench Press: 5x5 @ 225\n" + "Squat: 5x5 @ 315\n\n" +
                    "Day 2\n" + "Overhead Press: 5x5 @185\n" + "Front Squats: 5x5 @275\n\n" +
                    "Day 3\n" + "4x400m sprints with 2:00 recoveries\n\n" +
                    "Day 4\n" + "AMRAP (as many reps as possible): push ups & squats\n");
        } else if (url.equals("5")) {
            textView.setText("Day 1\n" + "Bench Press: 5x5 @ 225\n" + "Squat: 5x5 @ 315\n" +
                    "Day 2\n" + "Overhead Press: 5x5 @185\n" + "Front Squats: 5x5 @275\n" +
                    "Day 3\n" + "4x400m sprints with 2:00 recoveries\n" +
                    "Day 4\n" + "AMRAP (as many reps as possible): push ups & squats\n" +
                    "Day 5\n" + "Murph for time:\n" +"1 mile run, 100 pull ups, 300 squats, 1 mile run\n");
        } else if (url.equals("6")) {
            textView.setText("Day 1\n" + "Bench Press: 5x5 @ 225\n" + "Squat: 5x5 @ 315\n" +
                    "Day 2\n" + "Overhead Press: 5x5 @185\n" + "Front Squats: 5x5 @275\n" +
                    "Day 3\n" + "4x400m sprints with 2:00 recoveries\n" +
                    "Day 4\n" + "AMRAP (as many reps as possible): push ups & squats\n" +
                    "Day 5\n" + "Murph for time:\n" +"1 mile run, 100 pull ups, 300 squats, 1 mile run\n" +
                    "Day 6\n" + "Max out on squat & bench");
        }

        if (url.equals("1") || url.equals("3") || url.equals("5")) {
            textView_diet.setText("Our dietary recommendations: KETO");
        } else {
            textView_diet.setText("Our dietary recommendations: PALEO");
        }

        button_diet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isKeto) {
                    string_vid = "https://youtu.be/Q89St6BTxIQ";
                } else {
                    string_vid = "https://youtu.be/w07W0D9z6v4";
                }
                openActivity();
            }
        });

        button_bench.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string_vid = "https://youtu.be/gRVjAtPip0Y";
                openActivity();
            }
        });

        button_ohp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string_vid = "https://youtu.be/wol7Hko8RhY";
                openActivity();
            }
        });

        button_squat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string_vid = "https://youtu.be/nEQQle9-0NA";
                openActivity();
            }
        });
    }

    private void openActivity() {
        Intent intent = new Intent(this, LoadWeb.class);
        intent.putExtra("URL", string_vid);
        startActivity(intent);
    }
}