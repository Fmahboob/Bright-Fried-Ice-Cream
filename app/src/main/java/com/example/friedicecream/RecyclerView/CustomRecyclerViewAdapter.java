package com.example.friedicecream.RecyclerView;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.friedicecream.R;

import java.util.ArrayList;

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    private ArrayList<Term> terms;

    public CustomRecyclerViewAdapter(ArrayList<Term> terms) {
        this.terms = terms;
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
        Term term = terms.get(position);
        holder.image_recycler.setImageResource(term.getImageRecycler());
        holder.name_recycler.setText(term.getNameRecycler());

    }

    @Override
    public int getItemCount() {
        if(terms != null){
            return terms.size();
        }
        return 0;
    }
}


class CustomViewHolder extends RecyclerView.ViewHolder {
    protected ImageView image_recycler;
    protected TextView name_recycler;


    public CustomViewHolder(@NonNull View itemView) { //recycle_row
        super(itemView);

        this.image_recycler = itemView.findViewById(R.id.image_recycler);
        this.name_recycler = itemView.findViewById(R.id.name_recycler);



    }
}