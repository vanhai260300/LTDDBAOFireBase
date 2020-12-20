package com.example.foody.PageAccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.foody.R;


public class vi_voucher extends AppCompatActivity {

    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vi_voucher);

        imageButton = (ImageButton) findViewById(R.id.bt_vi);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vi_voucher.this, AccountFragment.class); intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); finish();

            }
        });

    }


}