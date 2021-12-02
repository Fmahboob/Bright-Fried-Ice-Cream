package com.example.friedicecream.ViewPager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.friedicecream.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FactFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FactFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final int ARG_PARAM2 = R.drawable.ic_baseline_contacts_24;
    private static final String ARG_PARAM3 = "param3";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private int mParam2;
    private String mParam3;

    public FactFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @param param3 Parameter 3.
     * @return A new instance of fragment FactFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FactFragment newInstance(String param1, int param2, String param3) {
        FactFragment fragment = new FactFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putInt(String.valueOf(ARG_PARAM2), param2);
        args.putString(ARG_PARAM3, param3);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getInt(String.valueOf(ARG_PARAM2));
            mParam3 = getArguments().getString(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fact, container, false);

        //Inflate the layout for this fragment
        TextView fact = view.findViewById(R.id.titleFact);
        ImageView fact1 = view.findViewById(R.id.imageFact);
        TextView fact2 = view.findViewById(R.id.descFact);
        if (mParam1 != null && mParam3 != null) {
            fact.setText(mParam1);
            fact1.setImageResource(mParam2);
            fact2.setText(mParam3);

        }
        return view;
    }
}