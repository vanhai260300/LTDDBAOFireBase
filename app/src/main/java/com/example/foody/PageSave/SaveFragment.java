package com.example.foody.PageSave;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.foody.R;
import com.google.android.material.tabs.TabLayout;

public class SaveFragment extends Fragment {
    TabLayout mTapLayout;
    ViewPager mViewPager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_save, container, false);

        mTapLayout = view.findViewById(R.id.tab_layoutsave);
        mViewPager = view.findViewById(R.id.viewpagersave);
        ViewPagerAdapterSave viewPagerAdapter= new ViewPagerAdapterSave(getActivity().getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(viewPagerAdapter);
        mTapLayout.setupWithViewPager(mViewPager);


        return  view;
    }
}
