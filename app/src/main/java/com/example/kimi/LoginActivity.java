package com.example.kimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class LoginActivity extends AppCompatActivity {

    private EditText emailET, passET;
    private Button loginB;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();

        loginB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginUser();
            }
        });
    }

    private void init()
    {
        loginB = findViewById(R.id.buttonLogin);
        emailET = findViewById(R.id.emailEditTV);
        emailET = findViewById(R.id.passEditTV);
        progressBar = findViewById(R.id.progressBar);
    }

    private void loginUser()
    {
        String email = emailET.getText().toString().trim();
        String password = passET.getText().toString().trim();

        if(email.isEmpty()){
            emailET.setError("Email is Required!");
            emailET.requestFocus();
            return;
        }

        if(password.isEmpty()){
            passET.setError("Password is Required!");
            passET.requestFocus();
            return;
        }

        if(password.length() < 6){
            passET.setError("Must have 6 characters");
            passET.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);
    }
}