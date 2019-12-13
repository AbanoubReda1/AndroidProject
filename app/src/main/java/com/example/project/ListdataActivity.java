package com.example.project;

import android.content.Intent;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class ListdataActivity extends AppCompatActivity {
TextView listdata;
    TextView subdata;
ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listdata);

        listdata = findViewById(R.id.listdata);
        subdata = findViewById(R.id.subtitle);
        imageView = findViewById(R.id.imageView);

        Intent intent = getIntent();

        subdata.setText(intent.getStringExtra("sub"));

        listdata.setText(intent.getStringExtra("name"));
    imageView.setImageResource(intent.getIntExtra("image",0));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
            if (item.getItemId() == android.R.id.home) {
                onBackPressed();
            }
            return super.onOptionsItemSelected(item);

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
