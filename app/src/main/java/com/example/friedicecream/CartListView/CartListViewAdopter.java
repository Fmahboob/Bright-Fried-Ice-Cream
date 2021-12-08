package com.example.friedicecream.CartListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.friedicecream.R;
import com.example.friedicecream.RecyclerView.IceCreamItem;

import java.util.ArrayList;

public class CartListViewAdopter extends ArrayAdapter<IceCreamItem> {
    public CartListViewAdopter(@NonNull Context context, ArrayList<IceCreamItem> items) {
        super(context, 0, items);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView =
                    LayoutInflater.from(getContext())
                            .inflate(R.layout.custom_cart_item,
                                    parent, false);
        }

        TextView cartName = convertView.findViewById(R.id.cartName);
        cartName.setText(getItem(position).getName());

        TextView cartPrice = convertView.findViewById(R.id.cartPrice);
        cartPrice.setText((int) getItem(position).getPrice());


        return convertView;
    }
}
