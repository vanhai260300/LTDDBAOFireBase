package com.example.foody.PageOrder;

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

public class OrderFragment extends Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapterOrder adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View V;
        V = inflater.inflate(R.layout.fragment_order,container,false);
        tabLayout= (TabLayout) V.findViewById(R.id.tablayout_idtrang);
        viewPager=(ViewPager) V.findViewById(R.id.viewpage_idtrang);
        ViewPageAdapterOrder adapter = new ViewPageAdapterOrder(getActivity().getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        //add fragment


        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        return V;

    }
}
