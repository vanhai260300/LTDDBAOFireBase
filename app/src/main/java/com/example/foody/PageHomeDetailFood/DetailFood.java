package com.example.foody.PageHomeDetailFood;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foody.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class DetailFood extends AppCompatActivity {

    TextView name;
    ImageView imageView;
    ImageButton back;
    ListView listView;
    ArrayList<Food> arrayList;
    AdapterFood adapter;
    int location=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_food);

        name = findViewById(R.id.detail_name);
        imageView = findViewById(R.id.detail_img);
        back = findViewById(R.id.imgback);

        Intent intent = getIntent();

        String receivedName =  intent.getStringExtra("name");
        //int receivedImage = intent.getIntExtra("image",0);

        name.setText(receivedName);
        //imageView.setImageResource(receivedImage);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailFood.this, MoidayFragment.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); finish();
            }
        });

        mapping();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                View dialogSheetview= LayoutInflater.from(DetailFood.this).inflate(R.layout.dialog_custom_dathang,null);
                BottomSheetDialog dialog=new BottomSheetDialog(DetailFood.this);
                dialog.setContentView(dialogSheetview);

                ImageView imageView = dialog.findViewById(R.id.dil_img);
                TextView tenmon = dialog.findViewById(R.id.dil_tenmon);
                TextView gia = dialog.findViewById(R.id.dil_gia);


                dialog.show();
            }
        });

    }
    private void mapping(){
        listView=(ListView) findViewById(R.id.lv);
        arrayList=new ArrayList<>();
        arrayList.add(new Food(R.drawable.stbo,"Sinh tố bơ","25000đ"));
        arrayList.add(new Food(R.drawable.cocbia,"Sinh tố lúa mạch","100000đ"));
        arrayList.add(new Food(R.drawable.travai,"Trà vải","25000đ"));
        arrayList.add(new Food(R.drawable.tradao,"Trà đào","25000đ"));
        arrayList.add(new Food(R.drawable.epoi,"Nước ép ổi","25000đ"));
        arrayList.add(new Food(R.drawable.epdau,"Nước ép dâu","20000đ"));
        arrayList.add(new Food(R.drawable.trachanh,"Trà chanh","20000đ"));
        arrayList.add(new Food(R.drawable.epcoc,"Nước ép cóc","20000đ"));
        arrayList.add(new Food(R.drawable.suadau,"Sữa chua dâu","20000đ"));
        arrayList.add(new Food(R.drawable.stbo,"Sinh tố bơ","25000đ"));
        arrayList.add(new Food(R.drawable.cocbia,"Sinh tố lúa mạch","100000đ"));
        arrayList.add(new Food(R.drawable.travai,"Trà vải","25000đ"));
        arrayList.add(new Food(R.drawable.tradao,"Trà đào","25000đ"));
        arrayList.add(new Food(R.drawable.epoi,"Nước ép ổi","25000đ"));
        arrayList.add(new Food(R.drawable.epdau,"Nước ép dâu","20000đ"));
        arrayList.add(new Food(R.drawable.trachanh,"Trà chanh","20000đ"));
        arrayList.add(new Food(R.drawable.epcoc,"Nước ép cóc","20000đ"));
        arrayList.add(new Food(R.drawable.suadau,"Sữa chua dâu","20000đ"));
        arrayList.add(new Food(R.drawable.stbo,"Sinh tố bơ","25000đ"));
        arrayList.add(new Food(R.drawable.cocbia,"Sinh tố lúa mạch","100000đ"));
        arrayList.add(new Food(R.drawable.travai,"Trà vải","25000đ"));
        arrayList.add(new Food(R.drawable.tradao,"Trà đào","25000đ"));
        arrayList.add(new Food(R.drawable.epoi,"Nước ép ổi","25000đ"));
        arrayList.add(new Food(R.drawable.epdau,"Nước ép dâu","20000đ"));
        arrayList.add(new Food(R.drawable.trachanh,"Trà chanh","20000đ"));
        arrayList.add(new Food(R.drawable.epcoc,"Nước ép cóc","20000đ"));
        arrayList.add(new Food(R.drawable.suadau,"Sữa chua dâu","20000đ"));

        adapter=new AdapterFood(arrayList,DetailFood.this);
        listView.setAdapter(adapter);
    }
}