package com.example.oderdragone.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.example.oderdragone.R;

public class home_Activity extends AppCompatActivity {

    private Button tess;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tess = findViewById(R.id.goingbtn);

        tess.setOnClickListener(view -> {
            // Create intent to navigate to discover_page activity
            Intent intent1 = new Intent(home_Activity.this, discover_page.class);
            startActivity(intent1); // Start the activity
        });
    }
}
