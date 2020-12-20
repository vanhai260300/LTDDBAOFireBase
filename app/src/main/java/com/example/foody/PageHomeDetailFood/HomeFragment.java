package com.example.foody.PageHomeDetailFood;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.foody.R;
import com.example.foody.Search.Search;
import com.google.android.material.tabs.TabLayout;

public class HomeFragment extends Fragment {
    CardView cardView,cardView2;
    TabLayout mTapLayout;
    ViewPager mViewPager;
    ViewFlipper viewFlipper;
    EditText editText;
    //int[] arrHinh = {R.drawable.slide1,R.drawable.slide2,R.drawable.slide3};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view;

        view = inflater.inflate(R.layout.fragment_home,container,false);
        //viewFlipper = (ViewFlipper)view.findViewById(R.id.viewflipper);
        //for (int i=0;i<arrHinh.length;i++){
            //ImageView imageView = new ImageView(getActivity());
            //imageView.setImageResource(arrHinh[i]);
            //viewFlipper.addView(imageView);
        //}
        //viewFlipper.setFlipInterval(1500);
        //viewFlipper.setAutoStart(true);
        viewFlipper = (ViewFlipper) view.findViewById(R.id.viewFlipper);
        viewFlipper.setFlipInterval(1500);
        viewFlipper.setAutoStart(true);

        cardView = view.findViewById(R.id.carview_delivery);
        cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(view.getContext(), DeliveryActivity.class);
                        startActivity(intent);
                    }
                });

        cardView2 = view.findViewById(R.id.carview_res);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), ReservationActivity.class);
                startActivity(intent);
            }
        });
        editText = view.findViewById(R.id.seach);
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), Search.class);
                startActivity(intent);
            }
        });
        /////
        mTapLayout = view.findViewById(R.id.tab_layout2);
        mViewPager = view.findViewById(R.id.viewpager2);
        ViewPagerAdapterHome viewPagerAdapter= new ViewPagerAdapterHome(getActivity().getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(viewPagerAdapter);
        mTapLayout.setupWithViewPager(mViewPager);

        return view;
    }
}
