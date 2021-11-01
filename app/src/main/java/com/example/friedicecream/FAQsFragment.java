package com.example.friedicecream;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FAQsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FAQsFragment extends Fragment {
    ListView listView;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FAQsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FAQsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FAQsFragment newInstance(String param1, String param2) {
        FAQsFragment fragment = new FAQsFragment();
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
        View view = inflater.inflate(R.layout.fragment_f_a_qs, container, false);
        listView = view.findViewById(R.id.faqList);
        ArrayList<FAQs> fAQsList = new ArrayList<>();
        fAQsList.add(new FAQs(R.drawable.one, R.string.question_one, R.string.answer_one));
        fAQsList.add(new FAQs(R.drawable.two, R.string.question_two,R.string.answer_two));
        fAQsList.add(new FAQs(R.drawable.three,R.string.question_three, R.string.answer_three));
        fAQsList.add(new FAQs(R.drawable.four,R.string.question_four, R.string.answer_four));
        fAQsList.add(new FAQs(R.drawable.five,R.string.question_five, R.string.answer_five));
        fAQsList.add(new FAQs(R.drawable.six, R.string.question_six, R.string.answer_six));



        listView.setAdapter(new CustomListViewAdopter(getContext(), fAQsList));
        return view;
    }
    }
