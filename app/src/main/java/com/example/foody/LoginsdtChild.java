package com.example.foody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LoginsdtChild extends AppCompatActivity {
    ImageButton imageButton;
    Button btntieptuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginsdt_child);

        imageButton = findViewById(R.id.imgback);
        btntieptuc = findViewById(R.id.btntieptuc);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginsdtChild.this, Login.class);
                startActivity(intent);
            }
        });
        btntieptuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginsdtChild.this, Home.class);
                startActivity(intent);
            }
        });
    }
}