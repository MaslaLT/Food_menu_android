package com.maselart.foodmenu;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainCourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_course);

        ListView mainCourseListView = findViewById(R.id.list_view_main_courses);

        Dish[] dishes = {
                new Dish("Main meanl", "Main description", 999),
                new Dish("Main meanl 2", "Main description", 799),
                new Dish("Main meanl 3", "Main description", 799)
        };

        ArrayAdapter<Dish> dishAdapter = new ArrayAdapter<Dish>(this, android.R.layout.simple_list_item_1, dishes);

        mainCourseListView.setAdapter(dishAdapter);
    }
}