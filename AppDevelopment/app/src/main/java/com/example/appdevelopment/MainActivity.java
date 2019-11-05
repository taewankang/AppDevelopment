package com.example.appdevelopment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.appdevelopment.Start.SignUp;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signUp(View v){
        intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }

    public void login(View v){
        intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
