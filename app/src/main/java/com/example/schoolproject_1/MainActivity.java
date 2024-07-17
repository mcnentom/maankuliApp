package com.example.schoolproject_1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FoodAdapter foodAdapter;
    private List<Food> foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        foodList = new ArrayList<>();
        foodList.add(new Food(R.drawable.food_1, "Pizza", 9.99));
        foodList.add(new Food(R.drawable.food_2, "Burger", 5.99));
        foodList.add(new Food(R.drawable.food_3, "Pasta", 7.99));
        foodList.add(new Food(R.drawable.food_4, "Leaved Pizza", 10.99));
        foodList.add(new Food(R.drawable.food_5, "KFC", 11.99));



        foodAdapter = new FoodAdapter(this, foodList);
        recyclerView.setAdapter(foodAdapter);
    }
}
