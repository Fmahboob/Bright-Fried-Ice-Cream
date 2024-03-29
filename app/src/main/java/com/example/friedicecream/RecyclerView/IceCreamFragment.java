package com.example.friedicecream.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.friedicecream.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link IceCreamFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class IceCreamFragment extends Fragment {
    private ArrayList<IceCreamItem> iceCreamItems;

    public IceCreamFragment(ArrayList<IceCreamItem> iceCreamItems) {
        this.iceCreamItems = iceCreamItems;
    }

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public IceCreamFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FlavourFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static IceCreamFragment newInstance(String param1, String param2) {
        IceCreamFragment fragment = new IceCreamFragment();
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
    /*
    * IceCreams name image and price that will go to RecyclerView
    * Change the price from us to can
    * Change the griddle from phone view to tablet view

     */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_ice_cream, container, false);
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        String currency = sharedPreferences.getString("currency", "us");
        ArrayList<IceCreamItem> iceCreamItems = new ArrayList<>();
        if(currency.equalsIgnoreCase("us")){
            iceCreamItems.add(new IceCreamItem(R.drawable.cherry, "Cherry", 2.99));
            iceCreamItems.add(new IceCreamItem(R.drawable.kiwi, "Kiwi", 3.99));
            iceCreamItems.add(new IceCreamItem(R.drawable.pear, "Pear", 2.99));
            iceCreamItems.add(new IceCreamItem(R.drawable.plum, "Plum", 2.99));
            iceCreamItems.add(new IceCreamItem(R.drawable.choclate, "Chocolate", 2.99));
            iceCreamItems.add(new IceCreamItem(R.drawable.oreo, "Oreo", 2.99));
        }
        if(currency.equalsIgnoreCase("can")) {
            iceCreamItems.add(new IceCreamItem(R.drawable.cherry, "Cherry", 3.99));
            iceCreamItems.add(new IceCreamItem(R.drawable.kiwi, "Kiwi", 4.99));
            iceCreamItems.add(new IceCreamItem(R.drawable.pear, "Pear", 3.99));
            iceCreamItems.add(new IceCreamItem(R.drawable.plum, "Plum", 3.99));
            iceCreamItems.add(new IceCreamItem(R.drawable.choclate, "Chocolate", 3.99));
            iceCreamItems.add(new IceCreamItem(R.drawable.oreo, "Oreo", 3.99));
        }

        RecyclerView recyclerView = view.findViewById(R.id.termRecyclerView);


        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        boolean grid = sharedPreferences.getBoolean("grid", false);

        if(grid){
            GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
            recyclerView.setLayoutManager(layoutManager);
        }
        else {
            LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
            recyclerView.setLayoutManager(layoutManager);
        }


        recyclerView.setAdapter(new CustomRecyclerViewAdapter(iceCreamItems));




        return view;
    }
}