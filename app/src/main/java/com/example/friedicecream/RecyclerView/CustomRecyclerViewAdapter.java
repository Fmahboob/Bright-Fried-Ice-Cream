package com.example.friedicecream.RecyclerView;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.example.friedicecream.CartListView.Cart;
import com.example.friedicecream.R;

import java.util.ArrayList;

/*
@author Farina Mahboob
 * CustomRecyclerView Adapter for hosting recycler view
 */

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomRecyclerViewAdapter.CustomViewHolder> {
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
            holder.image_iceCream.setImageResource(iceCreamItem.getImage());
            holder.name_iceCream.setText(iceCreamItem.getName());
            holder.price_iceCream.setText("$" + String.valueOf(iceCreamItem.getPrice()));

            /*
            Button that will add item in the cart
             */

            holder.cart_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Cart.getInstance().getCartItems().add(iceCreamItem);

                }
            });

    }


    @Override
    public int getItemCount() {
        if (iceCreamItems != null) {
            return iceCreamItems.size();
        }
        return 0;
    }


    class CustomViewHolder extends RecyclerView.ViewHolder {
        protected ImageView image_iceCream;
        protected TextView name_iceCream;
        protected TextView price_iceCream;
        protected Button cart_button;


        /*
        Create CustomViewHolder that will hold data on recycler View
         */
        public CustomViewHolder(@NonNull View itemView) { //recycle_row
            super(itemView);

            this.image_iceCream = itemView.findViewById(R.id.iceCream_image);
            this.name_iceCream = itemView.findViewById(R.id.iceCream_name);
            this.price_iceCream = itemView.findViewById(R.id.iceCream_price);
            this.cart_button = itemView.findViewById(R.id.addToCartButton);


        }

    }
}
