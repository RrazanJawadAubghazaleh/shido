package com.shidoapp.shido.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.shidoapp.shido.R;
import com.shidoapp.shido.fragment.CallFragment;
import com.shidoapp.shido.fragment.CardsFragment;
import com.shidoapp.shido.fragment.ChatFragment;
import com.shidoapp.shido.fragment.ContactsFragment;
import com.shidoapp.shido.fragment.MerchantsFragment;
import com.shidoapp.shido.fragment.SpecialOffersFragment;

public class MyPagerAdapterChat extends FragmentPagerAdapter {

    private static int NUM_ITEMS = 3;
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3};
    private  Context mContext;

    public MyPagerAdapterChat(FragmentManager fragmentManager, Context mContext) {
        super(fragmentManager);
        this.mContext = mContext;
    }

    public MyPagerAdapterChat(Context mContext, FragmentManager childFragmentManager) {
        super(childFragmentManager);
        this.mContext=mContext;
    }


    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment

            return CallFragment.newInstance(2, "Page # Call");

            case 1: // Fragment # 0 - This will show FirstFragment different title
                return ChatFragment.newInstance(0, "Page # Chat");

            case 2: // Fragment # 1 - This will show SecondFragment
                return ContactsFragment.newInstance(1, "Page #Contacts");
            default:
                return null;
        }

    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);

    }


}

