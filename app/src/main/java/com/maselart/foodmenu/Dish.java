package com.maselart.foodmenu;

import androidx.annotation.NonNull;

public class Dish {
    String title;
    String description;
    int price;

    public Dish(String title, String description, int price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
