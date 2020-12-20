package com.example.foody.PageHomeDetailFood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foody.R;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {
    public ArrayList<QuanGanToi> arrayingListener;
    Context mContext;

    public AdapterRecyclerView(ArrayList<QuanGanToi> arrayingListener, Context mContext) {
        this.arrayingListener = new ArrayList<QuanGanToi>();
        this.arrayingListener = arrayingListener;
        this.mContext = mContext;
    }

    private static final String TAG = "AdapterRecyclerView";
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_reservation,parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        QuanGanToi quanGanToi= arrayingListener.get(position);

        int image = arrayingListener.get(position).getImg();
        holder.imgQuangan.setImageResource(image);
        holder.tenQuan.setText(arrayingListener.get(position).getTenQuan());

    }

    @Override
    public int getItemCount() {
        return arrayingListener.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgQuangan;
        TextView tenQuan,diaChi,giaKhoang,khoangCach,thoiGianDi;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgQuangan = (ImageView) itemView.findViewById(R.id.img_quan1);
            tenQuan=(TextView)itemView.findViewById(R.id.tenQuan1);



        }
    }
}
