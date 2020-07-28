package com.example.fitnesscoach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Information extends AppCompatActivity {

    private EditText weight;
    private EditText availability;
    private EditText goal;
    private RadioGroup experience;
    private RadioButton selectedExperience;
    //private RadioButton beginner;
    //private RadioButton advanced;
    private Button save;
    DatabaseReference reff;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        weight = (EditText) findViewById((R.id.editWeight));
        availability = (EditText) findViewById(R.id.editAvailability);
        goal = (EditText) findViewById(R.id.editGoal);
        experience = (RadioGroup) findViewById(R.id.radioGroupExperience);
        //beginner = (RadioButton) findViewById(R.id.radioBeginner);
        //advanced = (RadioButton) findViewById(R.id.radioAdvanced);
        save = (Button) findViewById(R.id.saveButton);

       Bundle b = getIntent().getExtras();
       String i = b.getString("username");

        user = new User();
        reff = FirebaseDatabase.getInstance().getReference().child("User").child(i).child("Information");

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 user.setWeight(weight.getText().toString().trim());
                 user.setAvailability(availability.getText().toString().trim());
                 user.setWeightGoal(goal.getText().toString().trim());

                 int selectedID = experience.getCheckedRadioButtonId();
                 selectedExperience = (RadioButton) findViewById(selectedID);
                 user.setExperience(selectedExperience.getText().toString().trim());
                 reff.setValue(user);

                 Intent newIntent = new Intent(getBaseContext(), MainActivity.class);
                 startActivity(newIntent);

                 //Toast.makeText(MainActivity.this, "data inserted successfully", Toast.LENGTH_LONG).show();
            }
        });


        //Toast.makeText(this,"Firebase connection success",Toast.LENGTH_LONG).show();

    }
}
