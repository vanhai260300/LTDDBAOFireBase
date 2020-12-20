package com.example.foody.PageNoti;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.foody.R;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;

public class ListViewBaseAdapter extends BaseAdapter {
    public ArrayList<ListViewBean> arrayingListener;
    Context context;


    public ListViewBaseAdapter(ArrayList<ListViewBean> mListenerList, Context context) {
        this.context = context;
        this.arrayingListener = new ArrayList<ListViewBean>();
        this.arrayingListener =mListenerList;
    }

    public class ViewHolder {
        ImageView mItemPic;
        TextView mLangName,mota;
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
        final ListViewBean listViewBean= arrayingListener.get(position);
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.mItemPic = (ImageView) view.findViewById(R.id.img);
            holder.mLangName=(TextView)view.findViewById(R.id.ten);
            holder.mota=(TextView)view.findViewById(R.id.mota);


            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();

        }
        try {
            Bitmap image = arrayingListener.get(position).getImage();
            holder.mItemPic.setImageBitmap(image);
            holder.mLangName.setText(arrayingListener.get(position).getTensp());
            holder.mota.setText(arrayingListener.get(position).getMota());
        }catch (Exception ex){


        }

        return view;
    }


}
