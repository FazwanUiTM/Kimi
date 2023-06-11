package com.example.kimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class SignUpActivity extends AppCompatActivity {

    private EditText usernameEditTV, emailEditTV, passEditTV, conPassEditTV;
    private Button signupB;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        init();

        signupB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signupUser();
            }
        });
    }

    private void init()
    {
        usernameEditTV = findViewById(R.id.usernameEditTV);
        emailEditTV = findViewById(R.id.emailEditTV);
        passEditTV = findViewById(R.id.passEditTV);
        conPassEditTV = findViewById(R.id.conPassEditTV);
        signupB = findViewById(R.id.buttonSignup);
        progressBar = findViewById(R.id.progressBar);

    }

    private void signupUser()
    {
        String username = usernameEditTV.getText().toString().trim();
        String email = emailEditTV.getText().toString().trim();
        String password = passEditTV.getText().toString().trim();
        String confirmPassword = conPassEditTV.getText().toString().trim();

        if(username.isEmpty()){
            usernameEditTV.setError("Username is Required!");
            usernameEditTV.requestFocus();
            return;
        }

        if(email.isEmpty()){
            emailEditTV.setError("Email is Required!");
            emailEditTV.requestFocus();
            return;
        }

        if(password.isEmpty()){
            passEditTV.setError("Password is Required!");
            passEditTV.requestFocus();
            return;
        }

        if(password.length() < 6){
            passEditTV.setError("Must has 6 characters");
            passEditTV.requestFocus();
            return;
        }

        if(confirmPassword.isEmpty()){
            conPassEditTV.setError("Password Needs to be Confirmed!!");
            conPassEditTV.requestFocus();
            return;
        }

        if(!confirmPassword.equals(password)){
            conPassEditTV.setError("Password Does Not Match!");
            conPassEditTV.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);
    }
}