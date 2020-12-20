package com.example.foody.PageHomeDetailFood;

import android.os.Bundle;
import android.widget.HorizontalScrollView;
import android.widget.ListView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foody.R;

import java.util.ArrayList;

public class ReservationActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<QuanGanToi> arrayList;
    AdapterQuanGanToi adapter;
    int location=0;
    ViewFlipper viewFlipper;
    HorizontalScrollView horizontalScrollView,horizontalScrollView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        horizontalScrollView = findViewById(R.id.horizontal);
        horizontalScrollView.setVerticalScrollBarEnabled(false);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);

        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper2);
        viewFlipper.setFlipInterval(1500);
        viewFlipper.setAutoStart(true);
        mapping1();
        mapping2();
        mapping3();
    }

    private void mapping1(){
        ListView listView=(ListView) findViewById(R.id.listView_reservation);
        arrayList=new ArrayList<>();
        arrayList.add(new QuanGanToi(R.drawable.doan1,"Chipmin - Food & Drink","187/29 Tiểu La, P. Hòa Cường Bắc","2km","Giá ~ 77K","10'"));
        arrayList.add(new QuanGanToi(R.drawable.doan2,"Hanatei Hotpot & Sushi","1 Đống Đa, P. Thạch Thang","3km","Giá ~ 99K","15'"));
        arrayList.add(new QuanGanToi(R.drawable.doan3,"Little Tokyo - Phan Bội Châu","11 Phan Bội Châu, Quận Hải Châu","5km","Giá ~ 100K","20'"));
        arrayList.add(new QuanGanToi(R.drawable.doan4,"Nhà Hàng Lẩu Tứ Xuyên","41 Lê Hồng Phong, Quận Hải Châu","6km","Giá ~ 200K","25'"));
        arrayList.add(new QuanGanToi(R.drawable.doan5,"Phiphi - Sushi Nhật & Hàn","172/29 Tô Hiệu, Quận Liên Chiểu","4km","Giá ~ 81K","20'"));
        arrayList.add(new QuanGanToi(R.drawable.doan6,"Chè Dì Bi","Ngô Quyền, P. An Hải Bắc","1km","Giá ~ 69K","5'"));
        arrayList.add(new QuanGanToi(R.drawable.doan7,"Gardénia - Coffee N Bakery","288 Đống Đa, Quận Hải Châu","2km","Giá ~ 55K","10'"));
        arrayList.add(new QuanGanToi(R.drawable.doan8,"Oppa Tokbokki","86 Đường 2 Tháng 9, P. Bình Hiên","1km","Giá ~ 100K","5'"));
        arrayList.add(new QuanGanToi(R.drawable.doan9,"Lẩu Bò Ba Duệ","9 Trần Kế Xương, P. Hải Châu 2,","5km","Giá ~ 59K","25'"));
        arrayList.add(new QuanGanToi(R.drawable.doan10,"Dừa Hiền - Dừa Dầm Ngon","35 Cô Giang, P. Phước Ninh","3km","Giá ~ 89K","15'"));
        arrayList.add(new QuanGanToi(R.drawable.doan1,"Chipmin - Food & Drink","187/29 Tiểu La, P. Hòa Cường Bắc","2km","Giá ~ 77K","10'"));
        arrayList.add(new QuanGanToi(R.drawable.doan2,"Hanatei Hotpot & Sushi","1 Đống Đa, P. Thạch Thang","3km","Giá ~ 99K","15'"));
        arrayList.add(new QuanGanToi(R.drawable.doan3,"Little Tokyo - Phan Bội Châu","11 Phan Bội Châu, Quận Hải Châu","5km","Giá ~ 100K","20'"));
        arrayList.add(new QuanGanToi(R.drawable.doan4,"Nhà Hàng Lẩu Tứ Xuyên","41 Lê Hồng Phong, Quận Hải Châu","6km","Giá ~ 200K","25'"));
        arrayList.add(new QuanGanToi(R.drawable.doan5,"Phiphi - Sushi Nhật & Hàn","172/29 Tô Hiệu, Quận Liên Chiểu","4km","Giá ~ 81K","20'"));
        arrayList.add(new QuanGanToi(R.drawable.doan6,"Chè Dì Bi","Ngô Quyền, P. An Hải Bắc","1km","Giá ~ 69K","5'"));
        arrayList.add(new QuanGanToi(R.drawable.doan7,"Gardénia - Coffee N Bakery","288 Đống Đa, Quận Hải Châu","2km","Giá ~ 55K","10'"));
        arrayList.add(new QuanGanToi(R.drawable.doan8,"Oppa Tokbokki","86 Đường 2 Tháng 9, P. Bình Hiên","1km","Giá ~ 100K","5'"));
        arrayList.add(new QuanGanToi(R.drawable.doan9,"Lẩu Bò Ba Duệ","9 Trần Kế Xương, P. Hải Châu 2,","5km","Giá ~ 59K","25'"));
        arrayList.add(new QuanGanToi(R.drawable.doan10,"Dừa Hiền - Dừa Dầm Ngon","35 Cô Giang, P. Phước Ninh","3km","Giá ~ 89K","15'"));

        adapter=new AdapterQuanGanToi(arrayList,ReservationActivity.this);
        listView.setAdapter(adapter);
    }
    private void mapping2(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView =(RecyclerView) findViewById(R.id.recyclerView_uudai);
        arrayList=new ArrayList<>();
        arrayList.add(new QuanGanToi(R.drawable.ud1,"17h-20h giảm 25%"));
        arrayList.add(new QuanGanToi(R.drawable.ud2,"T2-T6 giảm  25%"));
        arrayList.add(new QuanGanToi(R.drawable.ud3,"Giảm 30% tổng hóa đơn"));
        arrayList.add(new QuanGanToi(R.drawable.ud4,"T2-T6 giảm  25%"));
        arrayList.add(new QuanGanToi(R.drawable.ud5,"17h-20h giảm 25%"));
        arrayList.add(new QuanGanToi(R.drawable.ud6,"Giảm 30% tổng hóa đơn"));
        arrayList.add(new QuanGanToi(R.drawable.ud7,"17h-20h giảm 25%"));
        arrayList.add(new QuanGanToi(R.drawable.ud8,"Giảm 20% tổng hóa đơn"));
        arrayList.add(new QuanGanToi(R.drawable.ud9,"Giảm 15% tổng hóa đơn"));
        arrayList.add(new QuanGanToi(R.drawable.ud10,"Giảm 30% tổng hóa đơn"));
        arrayList.add(new QuanGanToi(R.drawable.ud11,"Giảm 15% tổng hóa đơn"));
        arrayList.add(new QuanGanToi(R.drawable.ud12,"Giảm 30% tổng hóa đơn"));
        arrayList.add(new QuanGanToi(R.drawable.ud1,"17h-20h giảm 25%"));
        arrayList.add(new QuanGanToi(R.drawable.ud2,"T2-T6 giảm  25%"));
        arrayList.add(new QuanGanToi(R.drawable.ud3,"Giảm 30% tổng hóa đơn"));
        arrayList.add(new QuanGanToi(R.drawable.ud4,"T2-T6 giảm  25%"));
        arrayList.add(new QuanGanToi(R.drawable.ud5,"17h-20h giảm 25%"));
        arrayList.add(new QuanGanToi(R.drawable.ud6,"Giảm 30% tổng hóa đơn"));
        arrayList.add(new QuanGanToi(R.drawable.ud7,"17h-20h giảm 25%"));
        arrayList.add(new QuanGanToi(R.drawable.ud8,"Giảm 20% tổng hóa đơn"));
        arrayList.add(new QuanGanToi(R.drawable.ud9,"Giảm 15% tổng hóa đơn"));
        arrayList.add(new QuanGanToi(R.drawable.ud10,"Giảm 30% tổng hóa đơn"));
        arrayList.add(new QuanGanToi(R.drawable.ud11,"Giảm 15% tổng hóa đơn"));
        arrayList.add(new QuanGanToi(R.drawable.ud12,"Giảm 30% tổng hóa đơn"));

        recyclerView.setLayoutManager(linearLayoutManager);
        AdapterRecyclerView adapterQuanGanToi= new AdapterRecyclerView(arrayList,ReservationActivity.this);
        recyclerView.setAdapter(adapterQuanGanToi);
    }
    private void mapping3(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView =(RecyclerView) findViewById(R.id.recyclerView_bosuutap);
        arrayList=new ArrayList<>();
        arrayList.add(new QuanGanToi(R.drawable.st1,"THƯƠNG HIỆU XỊN"));
        arrayList.add(new QuanGanToi(R.drawable.st2,"ĐẠI TIỆC CHUA CAY"));
        arrayList.add(new QuanGanToi(R.drawable.st3,"NHÀ HÀNG MÓN HOA"));
        arrayList.add(new QuanGanToi(R.drawable.st4,"NÀY HỘI DEAL MỚI"));
        arrayList.add(new QuanGanToi(R.drawable.st5,"TOP BUFFET HẢI SẢN"));
        arrayList.add(new QuanGanToi(R.drawable.st6,"TOP BUFFET LẪU"));
        arrayList.add(new QuanGanToi(R.drawable.st7,"MỘC RÊU"));
        arrayList.add(new QuanGanToi(R.drawable.st8,"OPPA TOBOKY"));
        arrayList.add(new QuanGanToi(R.drawable.bst2,"HỆ THÔNG MOO"));
        arrayList.add(new QuanGanToi(R.drawable.st5,"GIẢM 50%"));
        arrayList.add(new QuanGanToi(R.drawable.st1,"THƯƠNG HIỆU XỊN"));
        arrayList.add(new QuanGanToi(R.drawable.bst2,"ĐẠI TIỆC CHUA CAY"));
        arrayList.add(new QuanGanToi(R.drawable.st3,"NHÀ HÀNG MÓN HOA"));
        arrayList.add(new QuanGanToi(R.drawable.st4,"NÀY HỘI DEAL MỚI"));
        arrayList.add(new QuanGanToi(R.drawable.st5,"TOP BUFFET HẢI SẢN"));
        arrayList.add(new QuanGanToi(R.drawable.st6,"TOP BUFFET LẪU"));
        arrayList.add(new QuanGanToi(R.drawable.st7,"MỘC RÊU"));
        arrayList.add(new QuanGanToi(R.drawable.st8,"OPPA TOBOKY"));
        arrayList.add(new QuanGanToi(R.drawable.bst2,"HỆ THÔNG MOO"));
        arrayList.add(new QuanGanToi(R.drawable.st5,"GIẢM 50%"));

        recyclerView.setLayoutManager(linearLayoutManager);
        AdapterRecyclerView adapterQuanGanToi= new AdapterRecyclerView(arrayList,ReservationActivity.this);
        recyclerView.setAdapter(adapterQuanGanToi);
    }
}