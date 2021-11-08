package com.example.friedicecream.RecyclerView;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
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
    private ArrayList<Term> terms;

    public IceCreamFragment(ArrayList<Term> terms) {
        this.terms = terms;
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_ice_cream, container, false);
        ArrayList<Term> terms = new ArrayList<>();
        terms.add(new Term(R.drawable.cherry, "Cherry"));
        terms.add(new Term(R.drawable.kiwi, "Kiwi"));
        terms.add(new Term(R.drawable.pear, "Pear"));
        terms.add(new Term(R.drawable.plum, "Plum"));
        terms.add(new Term(R.drawable.choclate, "Chocolate"));
        terms.add(new Term(R.drawable.oreo, "Oreo"));
        RecyclerView recyclerView = view.findViewById(R.id.termRecyclerView);




        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
       recyclerView.setLayoutManager(
               new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(new CustomRecyclerViewAdapter(terms));




        return view;
    }
}