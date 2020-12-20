package com.example.foody.PageHomeDetailFood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody.R;

import java.util.ArrayList;

public class AdapterQuanGanToi extends BaseAdapter {
    public ArrayList<QuanGanToi> arrayingListener;
    Context mContext;


    public AdapterQuanGanToi(ArrayList<QuanGanToi> mListenerList, Context context) {
        mContext = context;
        this.arrayingListener = new ArrayList<QuanGanToi>();
        this.arrayingListener =mListenerList;
    }

    public class ViewHolder {
        ImageView imgQuangan;
        TextView tenQuan,diaChi,giaKhoang,khoangCach,thoiGianDi;
    }

    @Override
    public int getCount() {
        return arrayingListener.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayingListener.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        final AdapterQuanGanToi.ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.row_delivery, null);
            holder = new AdapterQuanGanToi.ViewHolder();
            holder.imgQuangan = (ImageView) view.findViewById(R.id.img_quan);
            holder.tenQuan=(TextView)view.findViewById(R.id.tenQuan);
            holder.diaChi=(TextView)view.findViewById(R.id.diachicuthe);
            holder.giaKhoang=(TextView)view.findViewById(R.id.giakhoang);
            holder.khoangCach=(TextView)view.findViewById(R.id.khoangcach);
            holder.thoiGianDi=(TextView)view.findViewById(R.id.thoigiandi);

            view.setTag(holder);
        } else {
            holder = (AdapterQuanGanToi.ViewHolder) view.getTag();

        }
        try {
            int image = arrayingListener.get(position).getImg();
            holder.imgQuangan.setImageResource(image);
            holder.tenQuan.setText(arrayingListener.get(position).getTenQuan());
            holder.diaChi.setText(arrayingListener.get(position).getDiaChi());
            holder.khoangCach.setText(arrayingListener.get(position).getKhoangCach());
            holder.giaKhoang.setText(arrayingListener.get(position).getGiaKhoang());
            holder.thoiGianDi.setText(arrayingListener.get(position).getThoiGianDi());
        }catch (Exception ex){


        }

        return view;
    }}
