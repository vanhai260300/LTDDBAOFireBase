package com.example.foody.PageNoti;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foody.R;

public class Detail_noti extends AppCompatActivity {

    TextView name,mota;
    ImageView imageView;
    ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_noti);
        name = findViewById(R.id.dname);
        imageView = findViewById(R.id.imageView);
        mota = findViewById(R.id.dmota);
        back = findViewById(R.id.imgback);

        ListViewBean listViewBean =getIntent().getParcelableExtra("ten");

        Log.d("kiemtra",listViewBean.getTensp());


//        int receivedImage = intent.getIntExtra("image",0);
//        String receivedMota =  intent.getStringExtra("mota");
//
//        name.setText(receivedName);
//        imageView.setImageResource(receivedImage);
//        mota.setText(receivedMota);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Detail_noti.this,NotiFragment.class); intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); finish();
            }
        });
    }
}