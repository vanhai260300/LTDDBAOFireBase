package com.example.foody.PageOrder;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.foody.R;

import java.util.ArrayList;

public class Fragmentdonnhap extends Fragment {
    View V;
    ListView listView;
    Context context;
    CustomAdapter customAdapter;
    ArrayList<CountriesModel> countriesData;
    CountriesModel countriesModel;
    public Fragmentdonnhap(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       V = inflater.inflate(R.layout.donnhap,container,false);
        listView = V.findViewById(R.id.list_donnhap);
        countriesData = new ArrayList<>();
        LichsuaddData();
        context = this.getActivity();
        customAdapter = new CustomAdapter(context, countriesData);
        listView.setAdapter(customAdapter);

        //setsukien
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            }
        });
        return V;
    }
    private void LichsuaddData() {
        //food1
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setImgship(R.drawable.shipper1);
        countriesModel.setTencuahang("Gong Cha Đà Nẵng");
        countriesModel.setTensp("Trà sữa khoai môn full thạch Size M");
        countriesModel.setDiachi("30 Nguyễn Văn Linh");
        countriesModel.setNgaythang("20/10/2020");
        countriesModel.setMadonhang("DN10001");
        countriesModel.setNgaygiao("20/11/2000 10:10 pm");
        countriesModel.setTong("2 Ly - 50.000đ - COD");
        countriesModel.setTenship("Chu Văn Hùng");
        countriesData.add(countriesModel);
        //food2
        countriesModel = new CountriesModel();
        countriesModel.setId(2);
        countriesModel.setImgship(R.drawable.shipper1);
        countriesModel.setTencuahang("Gong Cha Đà Nẵng");
        countriesModel.setTensp("Trà sữa khoai môn full thạch Size M");
        countriesModel.setDiachi("30 Nguyễn Văn Linh");
        countriesModel.setNgaythang("20/10/2020");
        countriesModel.setMadonhang("DN10001");
        countriesModel.setNgaygiao("20/11/2000 10:10 pm");
        countriesModel.setTong("2 Ly - 50.000đ - COD");
        countriesModel.setTenship("Chu Văn Hùng");
        countriesData.add(countriesModel);

        countriesModel = new CountriesModel();
        countriesModel.setId(3);
        countriesModel.setImgship(R.drawable.shipper1);
        countriesModel.setTencuahang("Gong Cha Đà Nẵng");
        countriesModel.setTensp("Trà sữa khoai môn full thạch Size M");
        countriesModel.setDiachi("30 Nguyễn Văn Linh");
        countriesModel.setNgaythang("20/10/2020");
        countriesModel.setMadonhang("DN10001");
        countriesModel.setNgaygiao("20/11/2000 10:10 pm");
        countriesModel.setTong("2 Ly - 50.000đ - COD");
        countriesModel.setTenship("Chu Văn Hùng");
        countriesData.add(countriesModel);

        countriesModel = new CountriesModel();
        countriesModel.setId(4);
        countriesModel.setImgship(R.drawable.shipper1);
        countriesModel.setTencuahang("Gong Cha Đà Nẵng");
        countriesModel.setTensp("Trà sữa khoai môn full thạch Size M");
        countriesModel.setDiachi("30 Nguyễn Văn Linh");
        countriesModel.setNgaythang("20/10/2020");
        countriesModel.setMadonhang("DN10001");
        countriesModel.setNgaygiao("20/11/2000 10:10 pm");
        countriesModel.setTong("2 Ly - 50.000đ - COD");
        countriesModel.setTenship("Chu Văn Hùng");
        countriesData.add(countriesModel);

        countriesModel = new CountriesModel();
        countriesModel.setId(5);
        countriesModel.setImgship(R.drawable.shipper1);
        countriesModel.setTencuahang("Gong Cha Đà Nẵng");
        countriesModel.setTensp("Trà sữa khoai môn full thạch Size M");
        countriesModel.setDiachi("30 Nguyễn Văn Linh");
        countriesModel.setNgaythang("20/10/2020");
        countriesModel.setMadonhang("DN10001");
        countriesModel.setNgaygiao("20/11/2000 10:10 pm");
        countriesModel.setTong("2 Ly - 50.000đ - COD");
        countriesModel.setTenship("Chu Văn Hùng");
        countriesData.add(countriesModel);

        countriesModel = new CountriesModel();
        countriesModel.setId(6);
        countriesModel.setImgship(R.drawable.shipper1);
        countriesModel.setTencuahang("Gong Cha Đà Nẵng");
        countriesModel.setTensp("Trà sữa khoai môn full thạch Size M");
        countriesModel.setDiachi("30 Nguyễn Văn Linh");
        countriesModel.setNgaythang("20/10/2020");
        countriesModel.setMadonhang("DN10001");
        countriesModel.setNgaygiao("20/11/2000 10:10 pm");
        countriesModel.setTong("2 Ly - 50.000đ - COD");
        countriesModel.setTenship("Chu Văn Hùng");
        countriesData.add(countriesModel);

        countriesModel = new CountriesModel();
        countriesModel.setId(7);
        countriesModel.setImgship(R.drawable.shipper1);
        countriesModel.setTencuahang("Gong Cha Đà Nẵng");
        countriesModel.setTensp("Trà sữa khoai môn full thạch Size M");
        countriesModel.setDiachi("30 Nguyễn Văn Linh");
        countriesModel.setNgaythang("20/10/2020");
        countriesModel.setMadonhang("DN10001");
        countriesModel.setNgaygiao("20/11/2000 10:10 pm");
        countriesModel.setTong("2 Ly - 50.000đ - COD");
        countriesModel.setTenship("Chu Văn Hùng");
        countriesData.add(countriesModel);
    }

}
