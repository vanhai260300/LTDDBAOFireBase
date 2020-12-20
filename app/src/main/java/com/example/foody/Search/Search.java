package com.example.foody.Search;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.foody.PageNoti.NotiFragment;
import com.example.foody.R;
import com.google.android.material.tabs.TabLayout;

public class Search extends AppCompatActivity {
    TabLayout mTapLayout;
    ViewPager mViewPager;
    ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        mTapLayout = (TabLayout) findViewById(R.id.tab_layout3);
        mViewPager =(ViewPager) findViewById(R.id.viewpager3);

        ViewPagerAdapter2 viewPagerAdapter= new ViewPagerAdapter2(getSupportFragmentManager());
        mViewPager.setAdapter(viewPagerAdapter);
        mTapLayout.setupWithViewPager(mViewPager);
        back = findViewById(R.id.imgback);
        Intent intent = getIntent();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Search.this, NotiFragment.class); intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); finish();
            }
        });


    }
}