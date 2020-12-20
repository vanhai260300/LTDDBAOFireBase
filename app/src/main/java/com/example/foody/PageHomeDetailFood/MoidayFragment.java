package com.example.foody.PageHomeDetailFood;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.foody.R;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.List;

public class MoidayFragment extends Fragment {
    GridView gridView;
    GirdViewBaseAdapter adapter;
    ArrayList<GirdViewBean> arr_bean;
    Context context;
    GirdViewBean girdViewBean;
    View v;
    DatabaseReference databaseReference;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_moiday,container,false);


        homeData();
        context = this.getActivity();
        adapter = new GirdViewBaseAdapter(arr_bean,context);
        gridView.setAdapter(adapter);
        //


        //
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context,arr_bean.get(position).getTensp(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(), DetailFood.class);
                intent.putExtra("name",arr_bean.get(position).getTensp());
                //intent.putExtra("image",arr_bean.get(position).getImage());
                startActivity(intent);
            }
        });

        return v;
        ///////
    }
    private void homeData(){
        gridView = v.findViewById(R.id.gridview1);
        arr_bean = new ArrayList<>();
        adapter=new GirdViewBaseAdapter(arr_bean, getContext());
        gridView.setAdapter(adapter);
        ValueEventListener valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull final DataSnapshot dataSnapshot) {
                for(final DataSnapshot data: dataSnapshot.child("sanpham").getChildren()){
                    final GirdViewBean girdViewBean= data.getValue(GirdViewBean.class);
                    girdViewBean.setMasp(data.getKey());

                    final List<Bitmap> hinh = new ArrayList<>();
                    for (final DataSnapshot hinhanh:dataSnapshot.child("hinhanhsanpham").child(data.getKey()).getChildren()){
                        StorageReference storageReference = FirebaseStorage.getInstance().getReference().child(hinhanh.getValue(String.class));
                        final long ONE_MEGABYTE = 1024*1024;

                        storageReference.getBytes(ONE_MEGABYTE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
                            @Override
                            public void onSuccess(byte[] bytes) {
                                Bitmap bitmap = BitmapFactory.decodeByteArray(bytes,0,bytes.length);
                                hinh.add(bitmap);
                                if (hinh.size()==dataSnapshot.child("hinhanhsanpham").child(data.getKey()).getChildrenCount()){
                                    girdViewBean.setDanhSachHinhAnh(hinh);
                                    girdViewBean.setImage(hinh.get(0));

                                    arr_bean.add(girdViewBean);
                                    adapter.notifyDataSetChanged();
                                }
                            }
                        });

                    }
                    girdViewBean.setDanhSachHinhAnh(hinh);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        databaseReference = FirebaseDatabase.getInstance().getReference();
        databaseReference.addListenerForSingleValueEvent(valueEventListener);
    }

}