package com.shidoapp.shido.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.shidoapp.shido.R;
import com.shidoapp.shido.adapter.MyPagerAdapterChat;
import com.shidoapp.shido.adapter.MyPagerAdapterLoyality;

public class LoyalityActivity extends AppCompatActivity {


    private FragmentPagerAdapter adapterViewPager;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loyality);

        mViewPager =  findViewById(R.id.view_pager_loy_id);
        adapterViewPager = new MyPagerAdapterLoyality(getSupportFragmentManager(), this);
        mViewPager.setAdapter(adapterViewPager);

        SmartTabLayout viewPagerTab = findViewById(R.id.viewpagertab_loy_id);
        viewPagerTab.setViewPager(mViewPager);

        mViewPager.setCurrentItem(0);

    }
}
