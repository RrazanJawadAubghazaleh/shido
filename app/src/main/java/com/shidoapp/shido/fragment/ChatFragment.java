package com.shidoapp.shido.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shidoapp.shido.R;
import com.shidoapp.shido.adapter.ChatRecycleAdapter;
import com.shidoapp.shido.pojo.UsersInfo;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChatFragment extends Fragment {



    private RecyclerView recyclerView;
    private ChatRecycleAdapter chatRecycleAdapter;
    public ChatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_chat, container, false);

        setUp(view);
    return view;}



    private void setUp(View root) {

        recyclerView = root.findViewById(R.id.chat_recyclerview_id);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));


        //changing when API
        chatRecycleAdapter = new ChatRecycleAdapter(getActivity(), prepareArray());
        recyclerView.setAdapter(chatRecycleAdapter);
    }



    // newInstance constructor for creating fragment with arguments
    public static ChatFragment newInstance(int page, String title) {
        ChatFragment chatFragment = new ChatFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        chatFragment.setArguments(args);
        return chatFragment;
    }



    private ArrayList<UsersInfo> prepareArray() {
        ArrayList<UsersInfo> m = new ArrayList<>();

        UsersInfo p1 = new UsersInfo();
        p1.setName("merchant name 1");
        p1.setNumberOfMassiges(5);
        m.add(p1);

        p1 = new UsersInfo();
        p1.setName("merchant name 2");
        p1.setNumberOfMassiges(5);
        m.add(p1);

        p1 = new UsersInfo();
        p1.setName("merchant name 3");
        p1.setNumberOfMassiges(5);
        m.add(p1);

        p1 = new UsersInfo();
        p1.setName("merchant name 4");
        m.add(p1);
        return m;

    }
}
