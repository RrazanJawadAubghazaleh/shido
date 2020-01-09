package com.shidoapp.shido.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shidoapp.shido.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SpecialOffersFragment extends Fragment {


    public SpecialOffersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_specal_offers2, container, false);
    }

    // newInstance constructor for creating fragment with arguments
    public static SpecialOffersFragment newInstance(int page, String title) {
        SpecialOffersFragment specialOffersFragment = new SpecialOffersFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        specialOffersFragment.setArguments(args);
        return specialOffersFragment;
    }
}
