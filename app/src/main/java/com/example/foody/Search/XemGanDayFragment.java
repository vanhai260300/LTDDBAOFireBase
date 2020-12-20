package com.example.foody.Search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.foody.PageHomeDetailFood.AdapterQuanGanToi;
import com.example.foody.PageHomeDetailFood.QuanGanToi;
import com.example.foody.PageNoti.Detail_noti;
import com.example.foody.PageNoti.ListViewBean;
import com.example.foody.R;

import java.util.ArrayList;

public class XemGanDayFragment extends Fragment {

    ListView lv;
    ArrayList<QuanGanToi> arrayList;
    AdapterQuanGanToi adapter;
    ArrayList<ListViewBean> arr_bean;
    Context context;
    View v;
    //lấy của Noti
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_xem_gan_day, container, false);
        lv = v.findViewById(R.id.list_foods2);
        arr_bean = new ArrayList<>();

        mapping1();
        context = this.getActivity();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context,arr_bean.get(position).getTensp(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), Detail_noti.class);
                intent.putExtra("name",arr_bean.get(position).getTensp());
                intent.putExtra("image",arr_bean.get(position).getImage());
                intent.putExtra("mota",arr_bean.get(position).getMota());
                startActivity(intent);
            }
        });
        return v;
        ///////


    }

    private void mapping1(){
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

        adapter=new AdapterQuanGanToi(arrayList, getContext());
        lv.setAdapter(adapter);
    }

}