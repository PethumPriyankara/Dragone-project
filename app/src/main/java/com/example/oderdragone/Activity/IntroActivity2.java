package com.example.oderdragone.Activity; // Change this to your package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.oderdragone.R;

public class IntroActivity2 extends AppCompatActivity {
    private EditText emailInput, passwordInput;
    private Button loginButton;
    private TextView move;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro2); // Ensure this matches your XML file name

        emailInput = findViewById(R.id.editTextText3);
        passwordInput = findViewById(R.id.editTextTextPassword);
        loginButton = findViewById(R.id.button21);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailInput.getText().toString().trim();
                String password = passwordInput.getText().toString().trim();

                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(IntroActivity2.this, "Please enter email and password", Toast.LENGTH_SHORT).show();
                } else if (email.equals("admin") && password.equals("123456")) { // Replace with real validation
                    Toast.makeText(IntroActivity2.this, "Login Successful", Toast.LENGTH_SHORT).show();

                    // Navigate to home_Activity
                 setContentView(R.layout.activity_home);

                    loginButton.setOnClickListener(view -> {
                        Intent intent1=new Intent(IntroActivity2.this, home_Activity.class);
                    });
                } else {
                    Toast.makeText(IntroActivity2.this, "Invalid email or password", Toast.LENGTH_SHORT).show();

                }

            }


        });
        move=findViewById(R.id.textView10);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IntroActivity2.this, create_Activity2.class);
                startActivity(intent);
            }
        });
    }
}
