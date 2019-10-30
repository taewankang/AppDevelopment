package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText id, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id=(EditText)findViewById(R.id.id);
        password=(EditText)findViewById(R.id.password);
    }

    public void joinClick(View v){
        try {
            startActivity(new Intent(getApplication(), Menu.class));
        }catch(Exception e){
            Log.e("super", e.getMessage());
        }

    }

    public void signUp(View v){
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName("com.example.app", "com.example.app.SignUp");
        intent.setComponent(componentName);
        startActivity(intent);
    }

    public void findInfo(View v){
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName("com.example.app", "com.example.app.SignUp");
        intent.setComponent(componentName);
        startActivity(intent);

    }
}
