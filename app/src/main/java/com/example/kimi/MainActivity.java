package com.example.kimi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.midi.MidiDeviceService;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button login;
    private Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                finish();
                startActivity(intent);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                finish();
                startActivity(intent);
            }
        });

    }

    private void init(){
        login = findViewById(R.id.buttonLogin);
        signup = findViewById(R.id.buttonLogin);
    }
}