package com.example.friedicecream.RecyclerView;

import android.widget.ImageView;

public class Term {
    private int imageRecycler;
    private String nameRecycler;
    private String name2Recycler;
    private String image2Recycler;
    private String descRecycler;

    public Term(String name2Recycler, String image2Recycler, String descRecycler) {
        this.name2Recycler = name2Recycler;
        this.image2Recycler = image2Recycler;
        this.descRecycler = descRecycler;
    }

    public Term(int imageRecycler, String nameRecycler) {
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

    public String getDescRecycler() {
        return descRecycler;
    }

    public void setDescRecycler(String descRecycler) {
        this.descRecycler = descRecycler;
    }

    public String getName2Recycler() {
        return name2Recycler;
    }

    public void setName2Recycler(String name2Recycler) {
        this.name2Recycler = name2Recycler;
    }

    public String getImage2Recycler() {
        return image2Recycler;
    }

    public void setImage2Recycler(String image2Recycler) {
        this.image2Recycler = image2Recycler;
    }
}
