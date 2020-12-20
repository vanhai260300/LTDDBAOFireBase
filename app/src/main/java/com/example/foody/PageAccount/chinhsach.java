package com.example.foody.PageAccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;


import com.example.foody.R;

import java.util.ArrayList;

public class chinhsach extends AppCompatActivity {
    private ImageButton imageButton;

    ListView lv_chinhsach;
    AdapterAc adapter;
    ArrayList<ListAc> arr_bean_chinhsach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinhsach);

        lv_chinhsach = (ListView) findViewById(R.id.list_chinhsach);
        imageButton = (ImageButton) findViewById(R.id.bt_chinhsach);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        arr_bean_chinhsach = new ArrayList<ListAc>();
        arr_bean_chinhsach.add(new ListAc(R.drawable.huongdan,"Hướng dẫn thanh toán"));
        arr_bean_chinhsach.add(new ListAc(R.drawable.thoathuan,"Thỏa thuận sử dụng dịch vụ"));
        arr_bean_chinhsach.add(new ListAc(R.drawable.dieukhoan,"Điều khoản sử dụng"));
        arr_bean_chinhsach.add(new ListAc(R.drawable.chinhsach,"Chính sách bảo mật"));
        arr_bean_chinhsach.add(new ListAc(R.drawable.quyche,"Quy chế ứng dụng"));
        arr_bean_chinhsach.add(new ListAc(R.drawable.tranhchap,"Chính sách giải quyết tranh chấp"));
        arr_bean_chinhsach.add(new ListAc(R.drawable.danhgia,"Đánh giá App Foody"));
        adapter = new AdapterAc(arr_bean_chinhsach, this);
        lv_chinhsach.setAdapter(adapter);
    }
    public void openMainActivity(){
        Intent intent = new Intent(this, AccountFragment.class);
        startActivity(intent);

    }
}