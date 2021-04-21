package com.example.studentatfmiunibuc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartPoint extends AppCompatActivity {


    private Button buttonLearn;
    private Button buttonSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_point);

        buttonLearn = (Button) findViewById(R.id.learn);
        buttonSettings = (Button) findViewById(R.id.settings);

        buttonLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToLearnPage();
            }
        });
        buttonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ProfileActivity.class);
                startActivity(intent);
            }
        });
    }

    private void goToLearnPage() {
        Intent intent = new Intent(getBaseContext(), LearnPage.class);
        startActivity(intent);
    }
}