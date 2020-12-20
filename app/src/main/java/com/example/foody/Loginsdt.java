package com.example.foody;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Loginsdt extends AppCompatActivity {
    Button btntieptuc;
    ImageButton img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginsdt);
        btntieptuc = findViewById(R.id.btntieptuc);
        img = findViewById(R.id.imgback);
        btntieptuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Loginsdt.this, LoginsdtChild.class);
                startActivity(intent);
            }
        });
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Loginsdt.this, Login.class);
                startActivity(intent);
            }
        });
    }
}