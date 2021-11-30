package com.example.friedicecream.RecyclerView;

import android.widget.ImageView;

public class IceCreamItem {
    private int imageRecycler;
    private String nameRecycler;


    public IceCreamItem(int imageRecycler, String nameRecycler) {
        this.imageRecycler = imageRecycler;
        this.nameRecycler = nameRecycler;
    }

    public int getImageRecycler() {
        return imageRecycler;
    }

    public void setImageRecycler(int imageRecycler) {
        this.imageRecycler = imageRecycler;
    }

    public String getNameRecycler() {
        return nameRecycler;
    }

    public void setNameRecycler(String nameRecycler) {
        this.nameRecycler = nameRecycler;
    }

}
