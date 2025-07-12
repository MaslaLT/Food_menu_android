package com.maselart.foodmenu;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class StarterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_starter);

        ListView starterListView = findViewById(R.id.list_view_starters);

        Dish[] dishes = {
                new Dish("Starter", "Main description", 999),
                new Dish("Starter 2", "Main description", 799),
                new Dish("Starter 3", "Main description", 799)
        };

        ArrayAdapter<Dish> dishAdapter = new ArrayAdapter<Dish>(this, android.R.layout.simple_list_item_1, dishes);

        starterListView.setAdapter(dishAdapter);
    }
}