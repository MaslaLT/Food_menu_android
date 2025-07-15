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
                new Dish("Herb-Crusted Chicken Supreme", "Oven-roasted chicken breast coated in fresh herbs, served with garlic mash and seasonal vegetables.", 1199),
                new Dish("Seared Salmon Teriyaki", "Pan-seared salmon glazed with house-made teriyaki sauce, served on a bed of jasmine rice.", 1299),
                new Dish("Spicy Moroccan Lamb Tagine", "Slow-cooked lamb with apricots, almonds, and warm spices, served with couscous.", 1399),
                new Dish("Creamy Tuscan Chicken", "Grilled chicken in a sun-dried tomato and spinach cream sauce over linguine pasta.", 1199),
                new Dish("Beef Stroganoff Deluxe", "Tender beef strips in a rich mushroom cream sauce over buttered egg noodles.", 1099),
                new Dish("Crispy Skin Duck Breast", "Pan-roasted duck breast with cherry balsamic reduction, served with wild rice pilaf.", 1499),
                new Dish("Mediterranean Grilled Vegetable Stack", "Layers of zucchini, eggplant, and bell pepper with basil pesto and goat cheese.", 999),
                new Dish("Black Pepper Ribeye Steak", "12oz ribeye grilled to perfection with cracked peppercorn crust and steak fries.", 1599),
                new Dish("Thai Red Curry Chicken", "Spicy coconut curry with tender chicken, bell peppers, and bamboo shoots over rice.", 1099),
                new Dish("BBQ Pulled Pork Platter", "Slow-cooked pulled pork in smoky BBQ sauce, served with creamy slaw and cornbread.", 999),
                new Dish("Spinach & Ricotta Stuffed Shells", "Pasta shells filled with ricotta and spinach, baked in a garlic tomato sauce.", 949),
                new Dish("Korean Bulgogi Bowl", "Marinated beef with sesame glaze, served over rice with kimchi and a fried egg.", 1049)
        };


        ArrayAdapter<Dish> dishAdapter = new ArrayAdapter<Dish>(this, android.R.layout.simple_list_item_1, dishes);

        mainCourseListView.setAdapter(dishAdapter);
    }
}