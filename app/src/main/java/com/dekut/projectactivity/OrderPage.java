package com.dekut.projectactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class OrderPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderpage);

        Intent intent = getIntent();
        String foodName = intent.getStringExtra("foodName");
        String foodPrice = intent.getStringExtra("foodPrice");
        int foodImage = intent.getIntExtra("foodImage", R.drawable.pizza_image);

        ImageView foodImageView = findViewById(R.id.foodImage);
        TextView foodNameView = findViewById(R.id.foodName);
        TextView foodPriceView = findViewById(R.id.foodPrice);
        TextView foodDescriptionView = findViewById(R.id.foodDescription);
        Button orderButton = findViewById(R.id.orderButton);

        foodImageView.setImageResource(foodImage);
        foodNameView.setText(getString(R.string.food_name_template, foodName));
        foodPriceView.setText(getString(R.string.food_price_template, foodPrice));
        foodDescriptionView.setText(getString(R.string.food_description_template, foodName));

        orderButton.setOnClickListener(view -> {
            Intent successIntent = new Intent(OrderPage.this, SuccessPage.class);
            successIntent.putExtra("foodName", foodName);
            startActivity(successIntent);
        });
    }
}
