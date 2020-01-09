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
import com.shidoapp.shido.adapter.CardsRecycleAdapter;
import com.shidoapp.shido.pojo.Cards;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CardsFragment extends Fragment {

    private RecyclerView recyclerView;
  private CardsRecycleAdapter CardRecycleAdapter;

    public CardsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_cards, container, false);
        setUp(view);
    return view;}

    private void setUp(View view) {

        recyclerView = view.findViewById(R.id.cards_recyclerview_id);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));

        //changing when API
        CardRecycleAdapter = new CardsRecycleAdapter(getActivity(), prepareArray());
        recyclerView.setAdapter(CardRecycleAdapter);

    }

    // newInstance constructor for creating fragment with arguments
    public static CardsFragment newInstance(int page, String title) {
        CardsFragment cardsFragment = new CardsFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        cardsFragment.setArguments(args);
        return cardsFragment;
    }


    private ArrayList<Cards> prepareArray() {
        ArrayList<Cards> m = new ArrayList<>();

        Cards p1 = new Cards();
        p1.setName("basic");
        p1.setImgright(R.drawable.barmenu);
        p1.setImgLeft(R.drawable.barmenu);
        m.add(p1);

        p1 = new Cards();
        p1.setName("platinum");
        p1.setImgright(R.drawable.ic_launcher_background);
        p1.setImgLeft(R.drawable.ic_launcher_background);
        m.add(p1);

        p1 = new Cards();
        p1.setName("MArket Vip");
        p1.setImgright(R.drawable.ic_facebook);
        p1.setImgLeft(R.drawable.ic_facebook);
        m.add(p1);

        p1 = new Cards();
        p1.setName("ladies shop");
        p1.setImgright(R.drawable.barshidologo);

        m.add(p1);
        return m;

    }
}
