package com.iut.CSE180041108_lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nextBtn = findViewById(R.id.nextButton);

        nextBtn.setOnClickListener(view -> {
            Intent last_page_intent = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(last_page_intent);
        });
    }
}