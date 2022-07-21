package com.example.workpledge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class createjob extends AppCompatActivity {
    public static final String NAME = "NAME";
    public static final String AGE = "AGE";
    public  static final String DESCRIPTION = "DESCRIPTION";

    private TextView nameText, descText, ageText;
    private String name;
    private String desc;
    private int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createjob);

        nameText = findViewById(R.id.mName);
        descText = findViewById(R.id.mDesc);
        ageText = findViewById(R.id.mAge);

        Intent i = getIntent();
        name = i.getStringExtra(NAME);
        desc = i.getStringExtra(DESCRIPTION);
        age = i.getIntExtra(AGE, 0);

        nameText.setText("Job Name:\n "+name);
        descText.setText("Job Description:\n "+desc);
        ageText.setText("Years of Experience:\n "+age);
    }
}