package com.example.pizzareciper;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.Holder> {

    ArrayList<SingleItem> arrayList;
    Context context;

    public RecyclerViewAdapter(ArrayList<SingleItem> arrayList, Context context) {


        this.arrayList = arrayList;
        this.context = context;
    }


    public class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView imageView;
        public TextView mainText;
        public TextView subText;



        public Holder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            imageView = itemView.findViewById(R.id.image_view);
            mainText = itemView.findViewById(R.id.main_text);
            subText = itemView.findViewById(R.id.sub_text);

        }

        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();
            SingleItem singleItem = arrayList.get(position);

            Intent intent = new Intent(context, SecondActivity.class);
            intent.putExtra("imageResource", singleItem.getPizzaImage());
            intent.putExtra("title", singleItem.getMainText());
            intent.putExtra("subtext", singleItem.getSubText());
            intent.putExtra("desc", singleItem.getDescription());

            context.startActivity(intent);
        }
    }



    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_element, parent, false);

        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        SingleItem singleItem = arrayList.get(position);

        holder.imageView.setImageResource(singleItem.getPizzaImage());
        holder.mainText.setText(singleItem.getMainText());
        holder.subText.setText(singleItem.getSubText());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


}
