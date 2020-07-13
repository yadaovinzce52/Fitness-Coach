package com.example.fitnesscoach;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference myRef;

    private EditText username, password;
    private Button enter, clear;
    private String user, pass, temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        enter = findViewById(R.id.enter);
        clear = findViewById(R.id.clear);
        myRef = FirebaseDatabase.getInstance().getReference();

        enter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                user = username.getText().toString().trim();
                pass = password.getText().toString().trim();
                myRef.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(!snapshot.child("Users").hasChild(user)){
                            myRef.child("Users").child(user).setValue(pass);
                            //Intent information = new Intent(getBaseContext(), Information.class);
                            //startActivity(information);
                        }
                        else{
                            temp = snapshot.getValue().toString().trim();
                            if(!temp.equals(pass)){
                                Toast.makeText(getBaseContext(), "Password is incorrect", Toast.LENGTH_SHORT).show();
                            }
                            else {
                             //   Intent plans = new Intent(getBaseContext(), Plans.class);
                             //   startActivity(plans);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.setText("");
                password.setText("");
            }
        });
    }
}