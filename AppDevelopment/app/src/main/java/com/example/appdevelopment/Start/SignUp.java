package com.example.appdevelopment.Start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.appdevelopment.R;

public class SignUp extends AppCompatActivity {
    EditText id, password, email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        id=(EditText)findViewById(R.id.name);
        password=(EditText)findViewById(R.id.password);
        email=(EditText)findViewById(R.id.email);
    }

    public void signUpFinish(View v){
        Intent intent = new Intent(this, SimpleSetting.class);
        String str = id.getText().toString();
        intent.putExtra("id", str);
        startActivity(intent);
    }
}
