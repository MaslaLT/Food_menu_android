package com.maselart.foodmenu;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class DessertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dessert);

        ListView desertListView = findViewById(R.id.list_view_deserts);

        Dish[] dishes = {
                new Dish("Desert", "Main description", 999),
                new Dish("Desert 2", "Main description", 799),
                new Dish("Desert 3", "Main description", 799)
        };

        ArrayAdapter<Dish> dishAdapter = new ArrayAdapter<Dish>(this, android.R.layout.simple_list_item_1, dishes);

        desertListView.setAdapter(dishAdapter);

    }
}