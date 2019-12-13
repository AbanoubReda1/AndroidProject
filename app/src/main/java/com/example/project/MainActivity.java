package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    //very important to ******* start page ***********//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotosport(View view)
    {
        Intent go=new Intent(this,Sport.class);
        startActivity(go);
    }

    public void gotologin (View view)
    {
        Intent go=new Intent(this,Login.class);
        startActivity(go);
    }
    public void gotRegistraion (View view)
    {
        Intent go=new Intent(this,Registration.class);
        startActivity(go);
    }
    public void gotfan (View view)
    {
        Intent go=new Intent(this,fan.class);
        startActivity(go);
    }
    public void gotmap (View view)
    {
        Intent go=new Intent(this,MapsActivity.class);
        startActivity(go);
    }
    public void gotpol (View view)
    {
        Intent go=new Intent(this,Main2Activity.class);
        startActivity(go);
    }
    public void gotpol2 (View view)
    {
        Intent go=new Intent(this,Main3Activity.class);
        startActivity(go);
    }
//    drop down list
//    private Spinner spinner1;
//    private Button registration;
//
//    public void addListenerOnSpinnerItemSelection() {
//        spinner1 = (Spinner) findViewById(R.id.spinner1);
//        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
//    }
//
//    // get the selected dropdown list value
//    public void addListenerOnButton() {
//
//        spinner1 = (Spinner) findViewById(R.id.spinner1);
//
//        registration = (Button) findViewById(R.id.register);
//
//        registration.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                Toast.makeText(MainActivity.this,
//                        "OnClickListener : " +
//                                "\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()) ,
//                        Toast.LENGTH_SHORT).show();
//            }
//
//        });
//    }
}

