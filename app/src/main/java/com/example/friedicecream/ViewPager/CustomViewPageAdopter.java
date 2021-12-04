package com.example.friedicecream.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.friedicecream.R;

public class CustomViewPageAdopter extends FragmentStateAdapter {
    public CustomViewPageAdopter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return FactFragment.newInstance("Cherry Rolled Ice Cream:", R.drawable.cherry, "Rolled ice cream filled with delicious pieces of fresh cherries.");
            case 1:
                return FactFragment.newInstance("Kiwi Rolled Ice Cream:d", R.drawable.kiwi, "Rolled Ice Cream filled with fine cut pieces of kiwi, topped with chocolate syrup.");
            case 2: return FactFragment.newInstance("Pear Rolled Ice Cream:", R.drawable.pear, "Vanilla flavoured ice cream filled with finely cut pieces of savory pears");
            case 3: return FactFragment.newInstance("Plum Rolled Ice Cream: ", R.drawable.plum, "Rolled ice cream filled with exquisite pieces of sweet plums");

          case 4: return FactFragment.newInstance("Oreo Rolled Ice Cream:", R.drawable.oreo, "Vanilla flavoured ice cream topped with chunks of oreos and chocolate syrup, with one final piece of oreo at the top.");

            default: return FactFragment.newInstance("404: Fragment not found", 21, "");
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
