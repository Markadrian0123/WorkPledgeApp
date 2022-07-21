package com.example.workpledge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
        MaterialButton registerbtn = (MaterialButton) findViewById(R.id.registerbtn);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("jester") && password.getText().toString().equals("jester")){
                    //correct
                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                    openHomepage();

                }else
                    //incorect
                    Toast.makeText(MainActivity.this,"LOGIN FAILED!!", Toast.LENGTH_SHORT).show();
            }
        });
        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openRegister();
            }
        });

        }
    public void openHomepage(){
        Intent intent = new Intent(this,Homepage.class);
        startActivity(intent);
    }

        public void openRegister(){
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);
        }
    }
