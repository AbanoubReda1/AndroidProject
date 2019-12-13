package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    EditText password;
    CheckBox showpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    //////////////


        password = findViewById(R.id.password);
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

    public void gotohome (View view)
    {
        Intent go=new Intent(this,MainActivity.class);
        startActivity(go);
    }

}
