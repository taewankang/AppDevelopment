package com.example.appdevelopment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText ID, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ID = (EditText)findViewById(R.id.ID);
        password = (EditText)findViewById(R.id.password);
    }

    public void forgetPassword(View v){

    }

    public void login(View v){
        Intent intent = new Intent(this, Menu.class);
        intent.putExtra("ID", ID.getText().toString());
        startActivity(intent);
    }

    public void loginGoogle(View v){

    }
}
