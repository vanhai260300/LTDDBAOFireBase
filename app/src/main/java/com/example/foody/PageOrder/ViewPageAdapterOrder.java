package com.example.foody.PageOrder;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPageAdapterOrder extends FragmentStatePagerAdapter {
    public ViewPageAdapterOrder(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return new Fragmentdanggiao();
            case 1:
                return new LichsuFragment();
            case 2:
                return new Fragmentdonnhap();
            default:
                return  new Fragmentdanggiao();
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
                title ="Đang Giao";
                break;
            case 1:
                title ="Lịch Sử";
                break;
            case 2:
                title ="Đơn Nháp";
                break;
        }
        return title;
    }
}
