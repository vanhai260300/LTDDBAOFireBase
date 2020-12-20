package com.example.foody.PageOrder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody.R;

import java.util.ArrayList;


public class CustomAdapter extends BaseAdapter {
    Context context;
    ArrayList<CountriesModel> countriesData;
    LayoutInflater layoutInflater;
    CountriesModel countriesModel;

    public CustomAdapter(Context context, ArrayList<CountriesModel> countriesData) {
        this.context = context;
        this.countriesData = countriesData;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return countriesData.size();
    }

    @Override
    public Object getItem(int i) {
        return countriesData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return countriesData.get(i).getId();
    }


    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View rowView = view;
        if (rowView==null) {
            rowView = layoutInflater.inflate(R.layout.row, null, true);
        }
        //link views
        TextView tencuahang = rowView.findViewById(R.id.tenquan);
        TextView diachi = rowView.findViewById(R.id.diachiquan);
        TextView madonhang = rowView.findViewById(R.id.madonhang);
        TextView ngaydat    = rowView.findViewById(R.id.ngaydat);
        TextView giaohang   = rowView.findViewById(R.id.giaohang);
        TextView tong   = rowView.findViewById(R.id.tong);
        ImageView anhship = rowView.findViewById(R.id.anhship);
        TextView tenship   = rowView.findViewById(R.id.tenship);

        countriesModel = countriesData.get(position);

        tencuahang.setText(countriesModel.getTencuahang());
        diachi.setText(countriesModel.getDiachi());
        madonhang.setText(countriesModel.getMadonhang());
        ngaydat.setText(countriesModel.getNgaythang());
        giaohang.setText(countriesModel.getNgaygiao());
        tong.setText(countriesModel.getTong());
        anhship.setImageAlpha(countriesModel.getImgship());
        tenship.setText(countriesModel.getTenship());

        return rowView;
    }
}