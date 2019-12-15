package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    EditText password,email;
    CheckBox showpassword;
    Button login;

    Database db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    //////////////


        db=new Database(this);
        password = findViewById(R.id.passwordd);
        email=findViewById(R.id.emaill);
        login=findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eml=email.getText().toString();
                String pass=password.getText().toString();

                Boolean emailpass=db.emailpass(eml,pass);
                if(emailpass==true){
                    login.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent go=new Intent(Login.this, MainActivity.class);
                            startActivity(go);
                        }
                    });


                }
                else
                    Toast.makeText(getApplicationContext(),"Wrong login",Toast.LENGTH_SHORT).show();
            }
        });






        showpassword = findViewById(R.id.showpassword);

        showpassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                else {
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

    }



    public void gotRegistraion (View view)
    {
        Intent go=new Intent(this,Registration.class);
        startActivity(go);
    }


}
