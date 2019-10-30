package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SignUp extends AppCompatActivity {
    TextView id, school, password, name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        id=(TextView)findViewById(R.id.id);
        name=(TextView)findViewById(R.id.name);
        school=(TextView)findViewById(R.id.school);
        password=(TextView)findViewById(R.id.password);
        id.setText("");
        name.setText("");
        school.setText("");
        password.setText("");
    }

    public void submitClick(View v){
        Toast toast;
        if(id.getText().toString().equals("")){
            toast = Toast.makeText(getApplicationContext(), "아이디를 입력하세요", Toast.LENGTH_LONG);
            toast.show();
        }else if(name.getText().toString().equals("")){
            toast = Toast.makeText(getApplicationContext(), "이름을 입력하세요", Toast.LENGTH_LONG);
            toast.show();
        }else if(school.getText().toString().equals("")){
            toast = Toast.makeText(getApplicationContext(), "학교를 입력하세요", Toast.LENGTH_LONG);
            toast.show();
        }else if(password.getText().toString().equals("")){
            toast = Toast.makeText(getApplicationContext(), "비밀번호를 입력하세요", Toast.LENGTH_LONG);
            toast.show();
        }else {
            finish();
        }
    }
}
