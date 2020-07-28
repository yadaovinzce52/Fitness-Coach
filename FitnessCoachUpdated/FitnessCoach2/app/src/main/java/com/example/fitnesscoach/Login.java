package com.example.fitnesscoach;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Login extends AppCompatActivity {

    private DatabaseReference myRef;

    private EditText username, password;
    private Button enter, clear, search;
    private String user, pass, temp, temp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent back = getIntent();

        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        enter = findViewById(R.id.enter);
        clear = findViewById(R.id.clear);
        search = findViewById(R.id.search);
        myRef = FirebaseDatabase.getInstance().getReference();

        enter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                /*Intent myIntent = new Intent(Login.this, Information.class);
                myIntent.putExtra("username",user);
                startActivity(myIntent);*/

                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        user = username.getText().toString().trim();
                        pass = password.getText().toString().trim();

                        if(user.isEmpty() || pass.isEmpty()){
                            Toast.makeText(getBaseContext(), "Please enter username and password", Toast.LENGTH_SHORT).show();
                         }

                        if(!snapshot.child("Users").child(user).exists() && !user.equals(pass)) {
                            myRef.child("Users").child(user).setValue(pass);
                            Intent information = new Intent(Login.this, Information.class);
                            information.putExtra("username", user);
                            startActivity(information);
                        }
                        else if(user.equals(pass)){
                            Toast.makeText(getBaseContext(), "username and password cannot be the same", Toast.LENGTH_SHORT).show();
                        }
                        else if(snapshot.child("Users").child(user).exists()){
                            temp = snapshot.child("Users").child(user).getValue().toString().trim();
                            temp2 = snapshot.child("Users").child(user).getKey().toString().trim();
                            if(!pass.equals(snapshot.child("Users").child(user).getValue().toString().trim())
                                    && user.equals(snapshot.child("Users").child(user).getKey().toString().trim())){
                                Toast.makeText(getBaseContext(), "Wrong password for this user", Toast.LENGTH_SHORT).show();
                            }
                            else if(pass.equals(snapshot.child("Users").child(user).getKey().toString().trim())
                                    && user.equals(snapshot.child("Users").child(user).getValue().toString().trim())){
                                Intent workout = new Intent(Login.this, MainActivity.class);
                                startActivity(workout);
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

        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent search = new Intent(getBaseContext(), Search.class);
                startActivity(search);
            }
        });
    }
}