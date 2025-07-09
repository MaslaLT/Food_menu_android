package com.maselart.foodmeniu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        CardView cardViewMainMeals = findViewById(R.id.card_view_main_courses);
        CardView cardViewStarters = findViewById(R.id.card_view_starters);
        CardView cardViewDeserts = findViewById(R.id.card_view_desserts);

        cardViewMainMeals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCourseActivity.class);
                startActivity(mainCoursesActivityIntent);
            }
        });

        cardViewStarters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sraterActivityIntent = new Intent(MainActivity.this, StarterActivity.class);
                startActivity(sraterActivityIntent);
            }
        });

        cardViewDeserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dessertActivityIntent = new Intent(MainActivity.this, DessertActivity.class);
                startActivity(dessertActivityIntent);
            }
        });

    }
}