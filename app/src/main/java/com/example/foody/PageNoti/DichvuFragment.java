package com.example.foody.PageNoti;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
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

public class DichvuFragment extends Fragment {
    ListView lv;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean;
    Context context;
    View v;

    DatabaseReference databaseReference;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_dichvu,container,false);
        lv = v.findViewById(R.id.list_foods1);
        context = this.getActivity();
        homeData();


//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                Toast.makeText(context,arr_bean.get(position).getTensp(), Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(getActivity(),Detail_noti.class);
//                intent.putExtra("name",arr_bean.get(position).getTensp());
//                intent.putExtra("image",arr_bean.get(position).getImage());
//                intent.putExtra("mota",arr_bean.get(position).getMota());
//                startActivity(intent);
//            }
//        });
        return v;
        ///////


    }

    private void homeData() {
        lv = v.findViewById(R.id.list_foods1);
        arr_bean = new ArrayList<>();
        adapter = new ListViewBaseAdapter(arr_bean, getContext());
        lv.setAdapter(adapter);
        //final ProgressBar progressBar;
        ValueEventListener valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull final DataSnapshot dataSnapshot) {
                for (final DataSnapshot data : dataSnapshot.child("thongbao").getChildren()) {
                    final ListViewBean listViewBean = data.getValue(ListViewBean.class);
                    listViewBean.setMasp(data.getKey());

                    final List<Bitmap> hinh = new ArrayList<>();
                    for (final DataSnapshot hinhanh : dataSnapshot.child("hinhanhthongbao").child(data.getKey()).getChildren()) {
                        StorageReference storageReference = FirebaseStorage.getInstance().getReference().child(hinhanh.getValue(String.class));
                        final long ONE_MEGABYTE = 1024 * 1024;

                        storageReference.getBytes(ONE_MEGABYTE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
                            @Override
                            public void onSuccess(byte[] bytes) {
                                Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                                hinh.add(bitmap);
                                if (hinh.size() == dataSnapshot.child("hinhanhthongbao").child(data.getKey()).getChildrenCount()) {
                                    listViewBean.setDanhSachHinhAnh(hinh);
                                    listViewBean.setImage(hinh.get(0));

                                    arr_bean.add(listViewBean);
                                    adapter.notifyDataSetChanged();
                                    //progressBar.setVisibility(View.GONE);
                                }
                            }
                        });

                    }
                    listViewBean.setDanhSachHinhAnh(hinh);
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