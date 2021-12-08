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
                return FactFragment.newInstance(R.string.cherry_title, R.drawable.cherry, R.string.cherry_desc);
            case 1:
                return FactFragment.newInstance(R.string.kiwi_title, R.drawable.kiwi, R.string.kiwi_desc);
            case 2:
                return FactFragment.newInstance(R.string.chocolate_title, R.drawable.choclate, R.string.chocolate_desc);
            case 3:
                return FactFragment.newInstance(R.string.plum_title, R.drawable.plum, R.string.plum_desc);
          case 4:
              return FactFragment.newInstance(R.string.cookie_cream_title, R.drawable.oreo, R.string.cookie_cream_desc);
            case 5:
              return FactFragment.newInstance(R.string.pear_title, R.drawable.pear, R.string.pear_desc);

            default: return FactFragment.newInstance(0,0,0);
        }
    }


    @Override
    public int getItemCount() {
        return 5;
    }
}
