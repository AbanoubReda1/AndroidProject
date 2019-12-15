package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {

    Database db;
    EditText name,password,email;
    Button regi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        db=new Database(this);
        name=(EditText)findViewById(R.id.fullname);
        password=(EditText)findViewById(R.id.password);
        email=(EditText)findViewById(R.id.email);
        regi=(Button)findViewById(R.id.register);
        regi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nam=name.getText().toString();
                String pass=password.getText().toString();
                String eml=email.getText().toString();

                if (nam.equals("")||pass.equals("")||eml.equals("")){
                    Toast.makeText(getApplicationContext(),"Field are empty",Toast.LENGTH_SHORT).show();

                }
                else {
                   Boolean chkemail=db.ckemail(eml);
                   if (chkemail==true){
                       Boolean insert=db.insert(eml,pass,nam);
                       if (insert==true){
                           Toast.makeText(getApplicationContext(),"Successfully register",Toast.LENGTH_SHORT).show();
                       }
                   }

                   else
                       Toast.makeText(getApplicationContext(),"email is already exists",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void gotologin (View view)
    {
        Intent go=new Intent(this,Login.class);
        startActivity(go);
    }

}
