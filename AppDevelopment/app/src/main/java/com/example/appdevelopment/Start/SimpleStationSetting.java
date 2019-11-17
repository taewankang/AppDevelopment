package com.example.appdevelopment.Start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.appdevelopment.Login;
import com.example.appdevelopment.R;

public class SimpleStationSetting extends AppCompatActivity {
    String name;
    TextView textView;
    Spinner line, station;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_station_setting);
        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        textView = (TextView)findViewById(R.id.name);
        textView.setText(name + " 님, 자신의 위치와 가장 가까운 역을 선택해주세요");
        line = (Spinner)findViewById(R.id.line);
        station = (Spinner)findViewById(R.id.station);
//        http://www.masterqna.com/android/7673/%EC%8A%A4%ED%94%BC%EB%84%88%EC%9D%98-%EC%84%A0%ED%83%9D%EB%90%9C-%EA%B0%92%EC%9D%84-%EB%B3%80%EC%88%98%EC%97%90-%EC%A0%80%EC%9E%A5%ED%95%98%EA%B8%B0-string%ED%98%95
//        line.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                Spinner spinner;
//                String str = (String)line.getSelectedItem();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });
    }


    public void setting_finish(View view) { //설정 값을 디비에 넣을 부분
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void skip(View view) {       //그냥 넘어감
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }


}
