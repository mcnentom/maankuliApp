package com.dekut.projectactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        setupOrderButton(R.id.pizzaOrderButton, "Pizza", "$10", R.drawable.pizza_image);
        setupOrderButton(R.id.chickenOrderButton, "Chicken", "$8", R.drawable.chicken_image);
        setupOrderButton(R.id.bergerOrderButton, "Berger", "$7", R.drawable.berger_image);
        setupOrderButton(R.id.sandwichOrderButton, "Sandwich", "$6", R.drawable.sandwich_image);
        setupOrderButton(R.id.coffeeOrderButton, "Coffee", "$3", R.drawable.coffee_image);
        setupOrderButton(R.id.cocktailOrderButton, "Cocktail", "$5", R.drawable.cocktail_image);
        setupOrderButton(R.id.indianTeaOrderButton, "Indian Tea", "$2", R.drawable.indian_tea_image);

    }

    private void setupOrderButton(int buttonId, String foodName, String foodPrice, int foodImage) {
        Button orderButton = findViewById(buttonId);
        orderButton.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, OrderPage.class);
            intent.putExtra("foodName", foodName);
            intent.putExtra("foodPrice", foodPrice);
            intent.putExtra("foodImage", foodImage);
            startActivity(intent);
        });
    }
}
