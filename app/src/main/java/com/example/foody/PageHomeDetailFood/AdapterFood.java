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
public class AdapterFood extends BaseAdapter {
    public ArrayList<Food> arrayingListener;
    Context mContext;


    public AdapterFood(ArrayList<Food> mListenerList, Context context) {
        mContext = context;
        this.arrayingListener = new ArrayList<Food>();
        this.arrayingListener =mListenerList;
    }

    public class ViewHolder {
        ImageView mItemPic;
        TextView mLangName,moTa;
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
        final ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.row_home_detail_food, null);
            holder = new AdapterFood.ViewHolder();
            holder.mItemPic = (ImageView) view.findViewById(R.id.img2);
            holder.mLangName=(TextView)view.findViewById(R.id.name2);
            holder.moTa=(TextView)view.findViewById(R.id.gia2);

            view.setTag(holder);
        } else {
            holder = (AdapterFood.ViewHolder) view.getTag();

        }
        try {
            int image = arrayingListener.get(position).getImage();
            holder.mItemPic.setImageResource(image);
            holder.mLangName.setText(arrayingListener.get(position).getLangName());
            holder.moTa.setText(arrayingListener.get(position).getGia());
        }catch (Exception ex){


        }

        return view;
    }}
