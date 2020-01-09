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
public class CallFragment extends Fragment {


    public CallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_call, container, false);
    }


    // newInstance constructor for creating fragment with arguments
    public static CallFragment newInstance(int page, String title) {
        CallFragment callFragment = new CallFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        callFragment.setArguments(args);
        return callFragment;
    }

}
