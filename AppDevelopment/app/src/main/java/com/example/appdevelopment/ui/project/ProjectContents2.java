package com.example.appdevelopment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class ProjectContents2 extends AppCompatActivity {
    String project_name;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_contents2);
        Intent intent = getIntent();
        project_name = intent.getStringExtra("project_name");
        textView = (TextView)findViewById(R.id.project_name);
        textView.setText(project_name);
    }
}
