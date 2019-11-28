package com.example.appdevelopment.ui.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.appdevelopment.Menu;
import com.example.appdevelopment.R;

import java.util.ArrayList;
import java.util.List;

public class ProjectContents2 extends AppCompatActivity {
    private final int SET_SCHEDULE = 0;
    String project_name;        //프로젝트 이름
    TextView textView;
    Button button;
    Context context;
    boolean open = false;
    Menu menu;
    List<ToDo> todo_list;
    LinearLayout linearLayout, horizontal_linear_schedule;
    int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_contents2);
        Intent intent = getIntent();
        project_name = intent.getStringExtra("project_name");
        Log.d("superdroid", "here");
        pos = intent.getIntExtra("number", 0);
        Log.d("superdroid", "wow: " + pos + " ");
        textView = (TextView)findViewById(R.id.project_name);
        textView.setText(project_name);
        button = (Button)findViewById(R.id.add);
        linearLayout = (LinearLayout)findViewById(R.id.linear_schedule);
        horizontal_linear_schedule = (LinearLayout)findViewById(R.id.horizontal_linear_schedule);
        context = this;
        //비어있는거 넣어주기
        todo_list = Menu.get_todo_map(pos);
    }

    @Override
    public void onStart(){
        super.onStart();
    }

    public void add_schedule(View view) {
        open = false;
        linearLayout.setVisibility(View.GONE);
        Intent intent = new Intent(this, NewSchedule.class);
        intent.putExtra("project_name", project_name);
        startActivityForResult(intent, SET_SCHEDULE);
    }

    @Override
    public void onActivityResult(int requestCode, int requireCode, Intent data){
        super.onActivityResult(requestCode, requireCode, data);
        if(requestCode == SET_SCHEDULE){
            if(requireCode == RESULT_OK){
                int year = data.getIntExtra("selected_year", 0);
                int month = data.getIntExtra("selected_month", 0);
                int day = data.getIntExtra("selected_day", 0);
                int noon = data.getIntExtra("selected_noon", 0);
                int hour = data.getIntExtra("selected_hour", 0);
                int min = data.getIntExtra("selected_min", 0);
                String location = data.getStringExtra("selected_location");
                int meeting = data.getIntExtra("selected_meeting", 0);
                String memo = data.getStringExtra("selected_memo");
                String str_noon;
                if(noon == 0)
                    str_noon = "오전";
                else
                    str_noon = "오후";
                ToDo todo = new ToDo(year, month, day, hour, min, location, str_noon, memo, meeting);
                if(todo_list.size() == 0)
                    todo_list.add(todo);
                Menu.set_todo_map(pos, todo_list);
            }
        }
    }

    public void open_click(View view) {
        if(open == false) {
            open = true;
            linearLayout.setVisibility(View.GONE);
        }
        else {
            open = false;
            linearLayout.setVisibility(View.VISIBLE);
            open_function();
        }
    }

    public void open_function(){
        horizontal_linear_schedule.removeAllViews();
        for(ToDo todo : todo_list){
            TextView textView1 = new TextView(this);
            textView1.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            String date = todo.get_year() + "년 " + todo.get_month() + "월 " + todo.get_day() + "일";
            String time = todo.get_noon() + " " + todo.get_hour() + "시 " + todo.get_min() + "분 "; //todo.get_noon() 다시 보기
            String location = todo.get_location();
            String memo = todo.get_memo();
            int meeting = todo.get_meeting();
            textView1.setText("\n" + date + " " + time + "\n" + "만나는 장소: " + location + "\n메모: " + memo + "\n미리 알림: " + meeting + "시간 전");
            horizontal_linear_schedule.addView(textView1);
        }
    }
}
