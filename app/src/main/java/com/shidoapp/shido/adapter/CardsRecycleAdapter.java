package com.shidoapp.shido.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.shidoapp.shido.R;
import com.shidoapp.shido.pojo.Cards;

import java.util.ArrayList;

public class CardsRecycleAdapter extends RecyclerView.Adapter<CardsRecycleAdapter.viewitem> {


    ArrayList<Cards> items;


    public CardsRecycleAdapter(FragmentActivity activity, ArrayList<Cards> item) {
        this.items = item;

    }


    //onCreateViewHolder used to HAndle on Clicks
    @Override
    public viewitem onCreateViewHolder(final ViewGroup parent, int viewType) {


        //the itemView now is the row
        //We will add 2 onClicks


        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item_cards, parent, false);


        //this on click is for the row
//        itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(parent.getContext(),"ROW Clicked",Toast.LENGTH_SHORT).show();
//
//            }
//        });


        return new viewitem(itemView);
    }


    //to fill each item with data from the array depending on position
    @Override
    public void onBindViewHolder(viewitem holder, final int position) {


        holder.imageview.setImageResource(items.get(position).getImgright());


//to moving from recycale activty to anthaer activity
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ///int id = items.get(position).getId(); // get Id
//                Intent intent = new Intent(holder.itemView.getContext(),MovieInformationActivity.class);
//                intent.putExtra("pos", id); // Pass Id
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                holder.itemView.getContext().startActivity(intent);
//            }
//        });


//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("ResourceAsColor")
//            @Override
//            public void onClick(View v) {
//                holder.textViewTital.setTextColor(R.color.design_default_color_primary_dark);
//
//            }
//        });
    }


    @Override
    public int getItemCount() {

        if (items == null)
            return 0;

        return items.size();
    }


    //The View Item part responsible for connecting the row.xml with
    // each item in the RecyclerView
    //make declare and initalize
    class viewitem extends RecyclerView.ViewHolder {

        //Declare
        ImageView imageview, imageViewLift;


        //initialize
        public viewitem(View itemView) {
            super(itemView);

            imageview = itemView.findViewById(R.id.cards_img_id);
           // imageViewLift = itemView.findViewById(R.id.cards_imgLift_id);
        }
    }

}





