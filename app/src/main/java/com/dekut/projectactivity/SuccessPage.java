package com.dekut.projectactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SuccessPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successpage);

        // Get the food name from the intent
        Intent intent = getIntent();
        String foodName = intent.getStringExtra("foodName");

        // Show the success toast message
        Toast.makeText(this, getString(R.string.order_success_message, foodName), Toast.LENGTH_SHORT).show();

        // Set up the return to menu button
        Button returnToMenuButton = findViewById(R.id.returnToMenuButton);
        returnToMenuButton.setOnClickListener(v -> {
            // Navigate back to the main menu
            Intent menuIntent = new Intent(SuccessPage.this, HomePage.class);
            startActivity(menuIntent);
        });
    }
}
