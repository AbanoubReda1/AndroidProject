package com.example.project;

import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

public class Sport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        ViewPager viewPager = findViewById(R.id.viewpager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);
    }
}