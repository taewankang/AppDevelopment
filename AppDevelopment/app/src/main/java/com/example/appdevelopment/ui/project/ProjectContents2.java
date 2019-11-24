package com.example.appdevelopment.ui.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.appdevelopment.R;
import com.example.appdevelopment.ToDo;

public class ProjectContents2 extends AppCompatActivity {
    private final int SET_SCHEDULE = 0;
    String project_name;        //프로젝트 이름
    TextView textView;
    Button button;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_contents2);
        Intent intent = getIntent();
        project_name = intent.getStringExtra("project_name");
        textView = (TextView)findViewById(R.id.project_name);
        textView.setText(project_name);
        button = (Button)findViewById(R.id.add);
        context = this;
    }

    public void add_schedule(View view) {
        Intent intent = new Intent(this, NewSchedule.class);
        intent.putExtra("project_name", project_name);
        startActivityForResult(intent, SET_SCHEDULE);
    }

    @Override
    public void onActivityResult(int requestCode, int requireCode, Intent data){
        super.onActivityResult(requestCode, requireCode, data);
        if(requestCode == SET_SCHEDULE){
            if(requireCode == RESULT_OK){
                Log.d("superdroid", "here");
                int year = data.getIntExtra("selected_year", 0);
                int month = data.getIntExtra("selected_month", 0);
                int day = data.getIntExtra("selected_day", 0);
                String noon = data.getStringExtra("selected_noon");
                int hour = data.getIntExtra("selected_hour", 0);
                int min = data.getIntExtra("selected_min", 0);
                String location = data.getStringExtra("selected_location");
                int meeting = data.getIntExtra("selected_meeting", 0);
                String memo = data.getStringExtra("selected_memo");
                ToDo todo = new ToDo(year, month, day, hour, min, location, noon, memo, meeting);
                Log.d("superdroid", "start: " + year + " " + month + " " + day + " " + hour + " " + min + " " + location + " " + noon + " " + memo + " " + meeting);
           }
        }
    }
}
