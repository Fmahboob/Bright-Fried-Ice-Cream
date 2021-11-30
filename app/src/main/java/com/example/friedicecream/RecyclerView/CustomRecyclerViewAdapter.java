package com.example.friedicecream.RecyclerView;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.friedicecream.R;

import java.util.ArrayList;

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    private ArrayList<IceCreamItem> iceCreamItems;

    public CustomRecyclerViewAdapter(ArrayList<IceCreamItem> iceCreamItems) {
        this.iceCreamItems = iceCreamItems;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycle_row, parent, false);
        return new CustomViewHolder(view);

    }


    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        IceCreamItem iceCreamItem = iceCreamItems.get(position);
        holder.image_recycler.setImageResource(iceCreamItem.getImage());
        holder.name_recycler.setText(iceCreamItem.getName());
        holder.name_recycler.setText("$" + String.valueOf(iceCreamItem.getPrice()));

    }

    @Override
    public int getItemCount() {
        if (iceCreamItems != null) {
            return iceCreamItems.size();
        }
        return 0;
    }


    class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        protected ImageView image_iceCream;
        protected TextView name_iceCream;


        public CustomViewHolder(@NonNull View itemView) { //recycle_row
            super(itemView);

            this.image_iceCream = itemView.findViewById(R.id.iceCream_image);
            this.name_iceCream = itemView.findViewById(R.id.iceCream_name);


        }

        @Override
        public void onClick(View view) {
            IceCreamItem currentItem = iceCreamItems.get(getAdapterPosition());
            Bundle bundle = new Bundle();
            bundle.putInt("DRAWABLE", currentItem.getImage());
            bundle.putString("NAME", currentItem.getName());
            bundle.putString("DESCRIPTION", currentItem.getName());
            Navigation.findNavController(view)
                    .navigate(R.id.action_nav_menu_to_menuItemDetailed, bundle);

        }
    }
}