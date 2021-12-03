package com.example.friedicecream.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class CustomViewPageAdopterr2 extends FragmentStateAdapter {

    public CustomViewPageAdopterr2(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return FactFragment.newInstance("", 1, "");
            case 1:
                return FactFragment.newInstance("dfdsd", 2, "Comment often and be as detailed as possible");
//            case 2: return FactFragment.newInstance("Name variables and classes with descriptive names");
//            case 3: return FactFragment.newInstance("Don't be afraid to make mistakes. This is how we learn");
//
//           case 4: return FactFragment.newInstance("Shorter code does not mean better code");default: return FactFragment.newInstance("404: Fragment not found");

            default: return FactFragment.newInstance("404: Fragment not found", 21, "");
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
