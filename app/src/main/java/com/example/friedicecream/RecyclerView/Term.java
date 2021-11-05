package com.example.friedicecream.RecyclerView;

import android.widget.ImageView;

public class Term {
    private int imageRecycler;
    private int nameRecycler;

    public Term(int imageRecycler, int nameRecycler) {
        this.imageRecycler = imageRecycler;
        this.nameRecycler = nameRecycler;
    }

    public int getImageRecycler() {
        return imageRecycler;
    }

    public void setImageRecycler(int imageRecycler) {
        this.imageRecycler = imageRecycler;
    }

    public int getNameRecycler() {
        return nameRecycler;
    }

    public void setNameRecycler(int nameRecycler) {
        this.nameRecycler = nameRecycler;
    }
}
