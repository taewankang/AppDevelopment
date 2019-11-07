package com.example.appdevelopment.ui.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.appdevelopment.R;

public class AddProject extends AppCompatActivity {
    Button button1;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_project);
        editText = (EditText) findViewById(R.id.add_member_textview);
        button1 = (Button)findViewById(R.id.add_member_button);
    }

    public void onClick(View view){
        Intent intent = new Intent();
        intent.putExtra("string", editText.getText());
        setResult(0, intent);
        finish();
    }
}
