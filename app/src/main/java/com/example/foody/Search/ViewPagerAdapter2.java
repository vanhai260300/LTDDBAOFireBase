package com.example.foody.Search;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter2 extends FragmentStatePagerAdapter{

    public ViewPagerAdapter2(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return new XemGanDayFragment();
            case 1:
                return new XemGanDayFragment();
            case 2:
                return new XemGanDayFragment();
            default:
                return  new XemGanDayFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){

            case 0:
                title ="Xem gần đây";
                break;
            case 1:
                title ="Đặt gần đây";
                break;
            case 2:
                title ="Địa điểm đã tìm";
                break;
        }
        return title;
    }
}