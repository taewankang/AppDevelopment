package com.example.appdevelopment.Start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.appdevelopment.R;

public class SimpleSetting extends AppCompatActivity {
    Intent intent;
    TextView textView;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_setting);
        intent = getIntent();
        name = intent.getStringExtra("id");
        textView = (TextView)findViewById(R.id.textView);
        textView.setText(name + "님, 심플을 시작하기 전에 몇가지 사항을 설정해주세요.");
    }
    public void settingStart(View v){
        Intent intent = new Intent(this, ScheduleOneHour.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}
