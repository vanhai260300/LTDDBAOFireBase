package com.example.foody.PageAccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.foody.R;


import java.util.ArrayList;

public class caidat extends AppCompatActivity {
    private ImageButton imageButton;
    ListView lv_cdtk, lv_tcdh, lv_cdud, lv_ttk;
    AdapterAc adapter;
    ArrayList<ListAc> arr_bean_cdtk, arr_bean_tcdh, arr_bean_cdud, arr_bean_ttk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caidat);
        lv_cdtk = (ListView) findViewById(R.id.list_cdtk);
        lv_tcdh = (ListView) findViewById(R.id.list_tcdh);
        lv_cdud = (ListView) findViewById(R.id.list_cdud);
        lv_ttk = (ListView) findViewById(R.id.list_ttk);
        imageButton = (ImageButton) findViewById(R.id.bt_caidat);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        arr_bean_cdtk = new ArrayList<ListAc>();
        arr_bean_cdtk.add(new ListAc(R.drawable.people,"Hình đại diện"));
        arr_bean_cdtk.add(new ListAc(R.drawable.pass,"Mật khẩu"));
        arr_bean_cdtk.add(new ListAc(R.drawable.profile,"Thông tin & liên hệ"));
        adapter = new AdapterAc(arr_bean_cdtk, this);
        lv_cdtk.setAdapter(adapter);

        arr_bean_tcdh = new ArrayList<ListAc>();
        arr_bean_tcdh.add(new ListAc(R.drawable.hoan,"Hoãn xác nhận đơn hàng"));
        adapter = new AdapterAc(arr_bean_tcdh, this);
        lv_tcdh.setAdapter(adapter);

        arr_bean_cdud = new ArrayList<ListAc>();
        arr_bean_cdud.add(new ListAc(R.drawable.diadiem,"Đổi tỉnh thành"));
        arr_bean_cdud.add(new ListAc(R.drawable.danhmuc,"Đổi danh mục"));
        arr_bean_cdud.add(new ListAc(R.drawable.ngonngu,"Đổi ngôn ngữ"));
        arr_bean_cdud.add(new ListAc(R.drawable.thongbao,"Cài đặt thông báo"));
        adapter = new AdapterAc(arr_bean_cdud, this);
        lv_cdud.setAdapter(adapter);

        arr_bean_ttk = new ArrayList<ListAc>();
        arr_bean_ttk.add(new ListAc(R.drawable.thongtin,"Về Foody"));
        arr_bean_ttk.add(new ListAc(R.drawable.facebook,"Theo dõi chúng tôi trên Facebook"));
        arr_bean_ttk.add(new ListAc(R.drawable.instagram,"Theo dõi chúng tôi trên Instagram"));
        arr_bean_ttk.add(new ListAc(R.drawable.website,"Website"));
        arr_bean_ttk.add(new ListAc(R.drawable.mail,"Liên hệ"));
        adapter = new AdapterAc(arr_bean_ttk, this);
        lv_ttk.setAdapter(adapter);


    }
    public void openMainActivity(){
        Intent intent = new Intent(caidat.this, AccountFragment.class); intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); finish();

    }
}