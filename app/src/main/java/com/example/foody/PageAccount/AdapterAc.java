package com.example.foody.PageAccount;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody.R;

import java.util.ArrayList;
import java.util.List;

public  class AdapterAc extends BaseAdapter {
    public ArrayList<ListAc> arraylistListener;
    private List<ListAc> mListenerList;
    Context mContext;

    public AdapterAc(List<ListAc> mListenerList, Context context){
        mContext = context;
        this.mListenerList = mListenerList;
        this.arraylistListener = new ArrayList<ListAc>();
        this.arraylistListener.addAll(mListenerList);
    }
    public class  ViewHolder{
        ImageView mItemPic;
        TextView mLangName;
    }
    @Override
    public int getCount(){
        return mListenerList.size();
    }
    @Override
    public Object getItem(int position){
        return mListenerList.size();
    }
    @Override
    public long getItemId(int position){
        return position;
    }
    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.row_account, null);
            holder = new ViewHolder();
            holder.mItemPic = (ImageView) view.findViewById(R.id.im_test);
            holder.mLangName=(TextView)view.findViewById(R.id.tv_langName);
            view.setTag(holder);

        } else {
            holder = (ViewHolder) view.getTag();
        }
        try {
            int image = mListenerList.get(position).getImage();
            holder.mItemPic.setImageResource(image);
            holder.mLangName.setText(mListenerList.get(position).getCourse());
        }catch (Exception ex){
        }
        return view;
    }
}