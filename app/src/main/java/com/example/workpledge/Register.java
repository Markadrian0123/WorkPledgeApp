package com.example.workpledge;



import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);
        TextView cpassword =(TextView) findViewById(R.id.cpassword);

        MaterialButton registerbtn = (MaterialButton) findViewById(R.id.registerbtn);
        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //registerbtn

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomepage();
                Toast.makeText(Register.this,"REGISTER SUCCESSFUL", Toast.LENGTH_SHORT).show();

            }
        }); loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });

    }
    public void openHomepage(){
        Intent intent = new Intent(this,Homepage.class);
        startActivity(intent);
    }
    public void openMainActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    }

