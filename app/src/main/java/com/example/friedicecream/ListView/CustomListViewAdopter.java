package com.example.friedicecream.ListView;

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

import java.util.ArrayList;

public class CustomListViewAdopter extends ArrayAdapter<FAQs> {
    public CustomListViewAdopter(@NonNull Context context, ArrayList<FAQs> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView =
                    LayoutInflater.from(getContext())
                            .inflate(R.layout.custom_listview_item,
                                    parent, false);
        }

        TextView question = convertView.findViewById(R.id.question);
        question.setText(getItem(position).getQuestion());
        TextView answer = convertView.findViewById(R.id.answer);
        answer.setText(getItem(position).getAnswer());
        ImageView image = convertView.findViewById(R.id.dataimage);
        image.setImageResource(getItem(position).getImage());

        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setVisibility(answer.getVisibility()
                        == View.GONE ? View.VISIBLE : View.GONE);
                image.setVisibility(image.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);


            }
        });


        return convertView;
    }
}