package com.example.friedicecream;

import android.app.SearchManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContactFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContactFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ContactFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ContactFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ContactFragment newInstance(String param1, String param2) {
        ContactFragment fragment = new ContactFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        // Phone Button
        Button callButton = view.findViewById(R.id.callButton);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:5191234567"));
                try{
                    startActivity(intent);
                }catch (Exception e){
                    Toast.makeText(getContext(),"No Apps found",Toast.LENGTH_LONG).show();
                }
            }
        });


        //Email Button
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        String name = sharedPreferences.getString("name", "");
        Button emailButton = view.findViewById(R.id.emailButton);
        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String EmailAddress[] = {"ummibrahim227@gmail.com"};
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, EmailAddress);
                intent.putExtra(Intent.EXTRA_TITLE, "Hello" + name);
                intent.putExtra(Intent.EXTRA_TEXT, "Thanks for your Contact we will contact you shortly");
                try{
                    startActivity(intent);
                }catch (Exception e){
                    Toast.makeText(getContext(),"No Apps found",Toast.LENGTH_LONG).show();
                }
            }
        });


        //Address Button
        Button addressButton = view.findViewById(R.id.addressButton);
        addressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri location = Uri.parse("geo:42.248594597585544, -83.02032341285967?&q=Bright+Fried+ice+Cream");
                Intent intent = new Intent(Intent.ACTION_VIEW, location);
                try{
                    startActivity(intent);
                }catch (Exception e){
                    Toast.makeText(getContext(),"No Apps found",Toast.LENGTH_LONG).show();
                }

            }
        });

        //Web Intent
        Button faceBookButton = view.findViewById(R.id.faceBook);
        faceBookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.facebook.com/"));
                try{
                    startActivity(intent);
                }catch (Exception e){
                    Toast.makeText(getContext(),"No Apps found",Toast.LENGTH_LONG).show();
                }

            }
        });
        //Share Button

        Button shareButton = view.findViewById(R.id.shareButton);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(android.content.Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,"Want to eat delicious Fried Ice Cream");
                try {
                    startActivity(Intent.createChooser(intent, "Share via"));
                }catch (Exception e){
                    Toast.makeText(getContext(),"No Apps found",Toast.LENGTH_LONG).show();
                }


            }
        });

        //Search Button
        Button searchButton = view.findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_SEARCH);
                try{
                    startActivity(intent);
                }catch (Exception e){
                    Toast.makeText(getContext(),"No Apps found",Toast.LENGTH_LONG).show();
                }

            }
        });

        Animation anim_out = AnimationUtils.loadAnimation(getContext(), R.anim.anim_out);

        view.startAnimation(anim_out);


        return view;
    }
}