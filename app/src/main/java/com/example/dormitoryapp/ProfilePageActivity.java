package com.example.dormitoryapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dormitoryapp.documentation.DocumentationActivity;

public class ProfilePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        ImageView imageView = findViewById(R.id.imageView4);

        imageView.setBackgroundResource(R.drawable.logo);

        Button btnDocumentation = findViewById(R.id.button2);
        Button btnKezekshilik = findViewById(R.id.button3);

        btnDocumentation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), DocumentationActivity.class);
                startActivity(i);
            }
        });

        btnKezekshilik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), DocumentationActivity.class);
                startActivity(i);
            }
        });

        ImageButton btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}