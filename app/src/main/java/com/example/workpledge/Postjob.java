package com.example.workpledge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Postjob extends AppCompatActivity {
    private EditText nameText, descText, ageText;
    private Button button;
    private String name;
    private String desc;
    private int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postjob);
        nameText = findViewById(R.id.mName);
        descText = findViewById(R.id.mdesc);
        ageText = findViewById(R.id.mAge);
        button = findViewById(R.id.btnsave);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendData();
            }
        });
    }
    public void  sendData(){
        name = nameText.getText().toString().trim();
        desc = descText.getText().toString().trim();
        age = Integer.parseInt(ageText.getText().toString().trim());

        Intent i = new Intent(Postjob.this,createjob.class);

        i.putExtra(createjob.NAME,name);
        i.putExtra(createjob.DESCRIPTION, desc);
        i.putExtra(createjob.AGE, age);

        startActivity(i);
    }
}