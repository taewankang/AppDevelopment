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
<<<<<<< HEAD
        intent.putExtra("ID", ID.getText().toString());
=======
>>>>>>> 195a4d0b793c9c40d5a52b9017fb41357775f937
        startActivity(intent);
    }

    public void loginGoogle(View v){

    }
}
