package com.example.foody.PageNoti;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.foody.R;

import java.util.ArrayList;

public class TinmoiFragment extends Fragment {
    ListView lv;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean;
    Context context;
    ListViewBean listViewBean;
    View v;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_tinmoi,container,false);
        lv = v.findViewById(R.id.list_foods);
        arr_bean = new ArrayList<>();


        context = this.getActivity();
        adapter = new ListViewBaseAdapter(arr_bean,context);
        lv.setAdapter(adapter);

        return v;
        ///////


    }


}