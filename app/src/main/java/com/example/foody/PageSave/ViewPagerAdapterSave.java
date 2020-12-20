package com.example.foody.PageSave;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapterSave extends FragmentStatePagerAdapter{

    public ViewPagerAdapterSave(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return new TatcaFragment();
            case 1:
                return new DiadiemFragment();
            case 2:
                return new AnhFragment();
            case 3:
                return new BaivietFragment();
            default:
                return  new TatcaFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){

            case 0:
                title ="Tất cả";
                break;
            case 1:
                title ="Địa điểm";
                break;
            case 2:
                title ="Ảnh";
                break;
            case 3:
                title ="Bài viết";
                break;
        }
        return title;
    }
}