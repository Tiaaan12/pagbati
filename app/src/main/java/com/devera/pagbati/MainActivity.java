package com.devera.pagbati;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View firstCard = findViewById(R.id.firstCard);
        View secondCard = findViewById(R.id.secondCard);

        Button giftButton = findViewById(R.id.btnGreeting);
        Button backButton = findViewById(R.id.btnBack);

        giftButton.setOnClickListener(v -> {
            firstCard.setVisibility(View.GONE);
            secondCard.setVisibility(View.VISIBLE);
        });

        backButton.setOnClickListener(v -> {
            firstCard.setVisibility(View.VISIBLE);
            secondCard.setVisibility(View.GONE);
        });


    }
}