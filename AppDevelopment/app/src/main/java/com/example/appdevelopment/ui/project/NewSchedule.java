package com.example.appdevelopment.ui.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.appdevelopment.R;
import com.example.appdevelopment.SetScheduleDate;

public class NewSchedule extends AppCompatActivity {
    private final int SET_TIME = 0;
    String project_name, location_index;
    TextView title;
    Spinner location, alarm_time;
    int selected_year, selected_month, selected_day, selected_noon, selected_hour, selected_min;
    int meeting_index;      //만나는 위치 인덱스 값, 만나는 시간 인덱스 값
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_schedule);
        Intent intent = getIntent();
        project_name = intent.getStringExtra("project_name");
        title = (TextView)findViewById(R.id.project_name);
        title.setText(project_name);
        location = (Spinner)findViewById(R.id.location);
        alarm_time = (Spinner)findViewById(R.id.alarm_time);
        editText = (EditText)findViewById(R.id.editText);
        location.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {
                    case 0:     //첫번째 지하철 역
                        location_index = "0";
                        break;
                    case 1:
                        location_index = "1";
                        break;
                    case 2:
                        location_index = "2";
                        break;
                    case 3:
                        location_index = "3";
                        break;
                    case 4:     //온라인
                        location_index = "4";
                        break;
                    case 5:     //직접 입력
                        location_index = "5";
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        alarm_time.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch(position){
                    case 0:     //하루 전
                        meeting_index = 24;
                        break;
                    case 1:     //12시간 전
                        meeting_index = 12;
                        break;
                    case 2:     //6시간 전
                        meeting_index = 6;
                        break;
                    case 3:     //1시간 전
                        meeting_index = 1;
                        break;
                    case 4:     //30분 전
                        meeting_index = 30;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void setTime(View view) {
        Intent intent = new Intent(this, SetScheduleDate.class);
        startActivityForResult(intent, SET_TIME);
    }

    @Override
    public void onActivityResult(int requestCode, int requireCode, Intent data) {
        super.onActivityResult(requestCode, requireCode, data);
        if(requestCode == SET_TIME){
            if(requireCode == RESULT_OK) {  //제대로 된 데이터 값 저장
                selected_year = data.getIntExtra("selected_year", 0);
                selected_month = data.getIntExtra("selected_month", 0) + 1; //원래 달 - 1값이 저장
                selected_day = data.getIntExtra("selected_day", 0);
                selected_noon = data.getIntExtra("selected_noon", 0);   //0은 오전 1은 오후
                selected_hour = data.getIntExtra("selected_hour", 0) + 1;   //원래 시간 - 1
                selected_min = data.getIntExtra("selected_min", 0);
            }
        }
    }

    public void finish_setting(View view) {        //설정 완료 버튼을 눌렀을 때
        Intent intent = new Intent();
        Log.d("superdroid", "finish_setting");
        intent.putExtra("selected_year", selected_year);
        intent.putExtra("selected_month", selected_month);
        intent.putExtra("selected_day", selected_day);
        intent.putExtra("selected_noon", selected_noon);
        intent.putExtra("selected_hour", selected_hour);
        intent.putExtra("selected_min", selected_min);
        intent.putExtra("selected_location", location_index);
        intent.putExtra("selected_meeting", meeting_index);
        intent.putExtra("selected_memo", editText.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }

    @Override
    public void onBackPressed(){            //뒤로 가기 버튼을 눌렀을 때
        Intent intent = new Intent();
        setResult(RESULT_CANCELED, intent);
        finish();
    }
}
