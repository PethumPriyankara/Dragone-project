package com.example.oderdragone.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;  // Import Log for debugging
import com.google.android.material.button.MaterialButton;

import androidx.appcompat.app.AppCompatActivity;
import com.example.oderdragone.R;

public class wishActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish2); // Ensure this layout exists

        // Find "Buy Now" button by ID
        MaterialButton buyNowButton = findViewById(R.id.tBtn);

        // Set OnClickListener for "Buy Now" button
        buyNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Log button click for debugging
                Log.d("BuyNowButton", "Button clicked");
                // Navigate to overt_two activity
                Intent intent = new Intent(wishActivity2.this, overt_two.class);
                startActivity(intent);
            }
        });
    }
}
