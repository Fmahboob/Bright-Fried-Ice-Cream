package com.example.friedicecream.CartListView;

import com.example.friedicecream.RecyclerView.IceCreamItem;

import java.util.ArrayList;

public class Cart {
    private String menuItemName;
    private String menuItemPrice;


    ArrayList<IceCreamItem> cartItems = new ArrayList<>();

    private static Cart CartInstance = null;
    private Cart(){ };

    public static Cart getInstance() {
        if (CartInstance == null){
            CartInstance = new Cart();
        }
        return CartInstance;
    }



    public String getMenuItemName() {
        return menuItemName;
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;
    }

    public ArrayList<IceCreamItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(ArrayList<IceCreamItem> cartItems) {
        this.cartItems = cartItems;
    }



}
