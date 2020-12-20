package com.example.foody.PageAccount;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;


import com.example.foody.Login;
import com.example.foody.R;

import java.util.ArrayList;

public class MainAccountActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView_vc, lview, listView_gopy, listView_chinhsach;
    AdapterAc adapter;
    Button bt_logout;
    ArrayList<ListAc> arr_bean_vc, arr_bean, arr_been_gopy, array_bean_chinhsach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_account);



        listView_vc = (ListView)findViewById(R.id.list);
        lview = (ListView) findViewById(R.id.list1);
        listView_gopy = (ListView) findViewById(R.id.list2);
        listView_chinhsach = (ListView) findViewById(R.id.list3);

        //vivoucher

        listView_vc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(view.getContext(), vi_voucher.class);
                    startActivity(intent);
                }
            }
        });

        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //payment
                if (position == 0){
                    Intent intent = new Intent(view.getContext(), payment.class);
                    startActivity(intent);

                }
                //hoadon
                if (position == 2){
                    Intent intent = new Intent(view.getContext(), activity_hoadon.class);
                    startActivity(intent);

                }

            }
        });
        // moi ban be
        listView_gopy.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(view.getContext(), moibanbe.class);
                    startActivity(intent);
                }
                //gopy
                if (position == 1){
                    Intent intent = new Intent(view.getContext(), gopy.class);
                    startActivity(intent);
                }
            }
        });

        //chinhsach
        listView_chinhsach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(view.getContext(), chinhsach.class);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(view.getContext(), caidat.class);
                    startActivity(intent);
                }
                if (position == 2){
                    Intent inten= new Intent(view.getContext(), Login.class);
                    startActivity(inten);
                }
            }
        });

        arr_bean_vc = new ArrayList<ListAc>();
        arr_bean_vc.add(new ListAc(R.drawable.vi, "Voucher"));
        adapter = new AdapterAc(arr_bean_vc, this);
        listView_vc.setAdapter(adapter);

        arr_bean = new ArrayList<ListAc>();
        arr_bean.add(new ListAc(R.drawable.payment, "Payment"));
        arr_bean.add(new ListAc(R.drawable.history, "Lịch sử đơn hàng"));
        arr_bean.add(new ListAc(R.drawable.bill, "Hóa đơn"));
        arr_bean.add(new ListAc(R.drawable.credit, "Reward Credits"));
        arr_bean.add(new ListAc(R.drawable.app, "Ứng dụng cho chủ quán"));
        adapter = new AdapterAc(arr_bean, this);
        lview.setAdapter(adapter);

        arr_been_gopy = new ArrayList<ListAc>();
        arr_been_gopy.add(new ListAc(R.drawable.people, "Mời bạn bè"));
        arr_been_gopy.add(new ListAc(R.drawable.mail, "Góp ý"));
        adapter = new AdapterAc(arr_been_gopy, this);
        listView_gopy.setAdapter(adapter);

        array_bean_chinhsach = new ArrayList<ListAc>();
        array_bean_chinhsach.add(new ListAc(R.drawable.chinhsach, "Chính sách quy định"));
        array_bean_chinhsach.add(new ListAc(R.drawable.setting, "Cài đặt"));
        array_bean_chinhsach.add(new ListAc(R.drawable.logout_gray, "Đăng xuất"));
        adapter = new AdapterAc(array_bean_chinhsach, this);
        listView_chinhsach.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



    }

}