package com.example.foody.PageOrder;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.foody.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class LichsuFragment extends Fragment {
    View V;
    Spinner spinner;
    TextView ngaytruoc, ngaysau;
    ListView listView;
    Context context;
    CustomAdapter customAdapter;
    ArrayList<CountriesModel> countriesData;
    CountriesModel countriesModel;

    public LichsuFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        V = inflater.inflate(R.layout.lichsu, container, false);

        Employee[] employees = EmployeeDataUtils.getEmployees();
        spinner = (Spinner) V.findViewById(R.id.spinner);
        ArrayAdapter<Employee> LTRadapter = new ArrayAdapter<Employee>(this.getActivity(), R.layout.spinner_item, employees);
        LTRadapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(LTRadapter);
        ngaytruoc = (TextView) V.findViewById(R.id.ngaytruoc);
        ngaysau = (TextView) V.findViewById(R.id.ngaysau);
        layngay();
        ngaytruoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chonngay();
            }
        });
        ngaysau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chonngaysau();
            }
        });
        listView = V.findViewById(R.id.list);
        countriesData = new ArrayList<>();

        //addlichsudata
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

    private void layngay() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd,MM,yyyy");
        ngaytruoc.setText(simpleDateFormat.format(calendar.getTime()));
        ngaysau.setText(simpleDateFormat.format(calendar.getTime()));
    }

    private void chonngay() {
        final Calendar calendar = Calendar.getInstance();
        int ngay = calendar.get(Calendar.DATE);
        int thang = calendar.get(Calendar.MONTH);
        int nam = calendar.get(Calendar.YEAR);
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.getActivity(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(year, month, dayOfMonth);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd,MM,yyyy");
                ngaytruoc.setText(simpleDateFormat.format(calendar.getTime()));
            }
        }, nam, thang, ngay);
        datePickerDialog.show();
    }

    private void chonngaysau() {
        final Calendar calendar = Calendar.getInstance();
        int ngay = calendar.get(Calendar.DATE);
        int thang = calendar.get(Calendar.MONTH);
        int nam = calendar.get(Calendar.YEAR);
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.getActivity(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(year, month, dayOfMonth);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd,MM,yyyy");
                ngaysau.setText(simpleDateFormat.format(calendar.getTime()));
            }
        }, nam, thang, ngay);
        datePickerDialog.show();
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