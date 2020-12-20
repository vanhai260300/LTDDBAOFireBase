package com.example.foody.PageAccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.foody.R;


public class activity_hoadon extends AppCompatActivity {

    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoadon);

        imageButton = (ImageButton) findViewById(R.id.bt_hoadon);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }
    public void openMainActivity(){

        Intent intent = new Intent(activity_hoadon.this, AccountFragment.class); intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); finish();
    }
}