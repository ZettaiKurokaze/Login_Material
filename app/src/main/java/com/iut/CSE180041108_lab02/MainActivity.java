package com.iut.CSE180041108_lab02;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button loginBtn = findViewById(R.id.loginButton);
        EditText inputUser = findViewById(R.id.inputUsername);
        EditText inputPass = findViewById(R.id.inputPassword);
        TextInputLayout editUser = findViewById(R.id.editUsername);
        TextInputLayout editPass = findViewById(R.id.editPassword);

        loginBtn.setOnClickListener(view -> {
            boolean flag = true;
            String username = inputUser.getText().toString();
            String password = inputPass.getText().toString();
            if(username.isEmpty()) {
                editUser.setError("*Username Required");
                flag=false;
            }
            else{
                editUser.setErrorEnabled(false);
            }
            if(password.isEmpty()) {
                editPass.setError("*Password Required");
                flag=false;
            }
            else{
                editPass.setErrorEnabled(false);
            }

            if(flag) {
                Intent home_page_intent = new Intent(getApplicationContext(), MainActivity2.class);
                home_page_intent.putExtra("com.iut.CSE180041108_lab02", username);
                startActivity(home_page_intent);
            }
        });
    }
}