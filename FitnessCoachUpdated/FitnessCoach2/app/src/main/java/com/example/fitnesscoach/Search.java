package com.example.fitnesscoach;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

public class Search extends AppCompatActivity {

    private DatabaseReference myRef;

    private EditText username;
    private TextView name, experience, plan;
    private Button search, back;
    private String user, name1, experience1, plan1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        username = findViewById(R.id.username);
        search = findViewById(R.id.search);
        back = findViewById(R.id.back);
        name = findViewById(R.id.name);
        experience = findViewById(R.id.experience);
        plan = findViewById(R.id.plan);
        myRef = FirebaseDatabase.getInstance().getReference();


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = username.getText().toString().trim();

                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        if(snapshot.child("User").child(user).exists()){
                            name1 = snapshot.child("User").child(user).getKey().toString().trim();
                            experience1 = snapshot.child("User").child(user).child("Information").child("experience").getValue().toString().trim();
                            plan1 = snapshot.child("User").child(user).child("Information").child("availability").getValue().toString().trim();
                            name.setText(name1);
                            experience.setText(experience1);
                            plan.setText("Workout plan " + plan1);
                        }
                        else{
                            name.setText("N/A");
                            experience.setText("N/A");
                            plan.setText("N/A");
                            Toast.makeText(getBaseContext(), "User does not exist", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(getBaseContext(), Login.class);
                startActivity(back);
            }
        });
    }
}