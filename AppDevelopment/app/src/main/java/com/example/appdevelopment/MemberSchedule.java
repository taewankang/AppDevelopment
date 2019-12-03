package com.example.appdevelopment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberSchedule extends AppCompatActivity {
    Map<String, Map<String, List<Integer>>> map= new HashMap<String, Map<String, List<Integer>>>();
    Map<String, List<Integer>> map2 = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_schedule);
//        map2 = map.get("Scheduler");
    }

    @Override
    public void onStart(){
        super.onStart();
        if(map2.containsKey("Monday")) {
            list = map2.get("Monday");
            if (list.contains(1)) {
                textView = (TextView) findViewById(R.id.one_one);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(2)) {
                textView = (TextView) findViewById(R.id.two_one);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(3)) {
                textView = (TextView) findViewById(R.id.three_one);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(4)) {
                textView = (TextView) findViewById(R.id.four_one);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(5)) {
                textView = (TextView) findViewById(R.id.five_one);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(6)) {
                textView = (TextView) findViewById(R.id.six_one);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(7)) {
                textView = (TextView) findViewById(R.id.seven_one);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(8)) {
                textView = (TextView) findViewById(R.id.eight_one);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(9)) {
                textView = (TextView) findViewById(R.id.nine_one);
                textView.setBackgroundResource(R.color.project_Color);
            }
        }
        Log.d("superdroid", "TWO");

        if(map2.containsKey("Tuesday")) {
            list = map2.get("Tuesday");
            if (list.contains(1)) {
                textView = (TextView) findViewById(R.id.one_two);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(2)) {
                textView = (TextView) findViewById(R.id.two_two);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(3)) {
                textView = (TextView) findViewById(R.id.three_two);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(4)) {
                textView = (TextView) findViewById(R.id.four_two);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(5)) {
                textView = (TextView) findViewById(R.id.five_two);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(6)) {
                textView = (TextView) findViewById(R.id.six_two);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(7)) {
                textView = (TextView) findViewById(R.id.seven_two);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(8)) {
                textView = (TextView) findViewById(R.id.eight_two);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(9)) {
                textView = (TextView) findViewById(R.id.nine_two);
                textView.setBackgroundResource(R.color.project_Color);
            }
        }
        if(map2.containsKey("Wednesday")) {
            list = map2.get("Wednesday");
            if (list.contains(1)) {
                textView = (TextView) findViewById(R.id.one_three);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(2)) {
                textView = (TextView) findViewById(R.id.two_three);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(3)) {
                textView = (TextView) findViewById(R.id.three_three);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(4)) {
                textView = (TextView) findViewById(R.id.four_three);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(5)) {
                textView = (TextView) findViewById(R.id.five_three);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(6)) {
                textView = (TextView) findViewById(R.id.six_three);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(7)) {
                textView = (TextView) findViewById(R.id.seven_three);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(8)) {
                textView = (TextView) findViewById(R.id.eight_three);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(9)) {
                textView = (TextView) findViewById(R.id.nine_three);
                textView.setBackgroundResource(R.color.project_Color);
            }
        }
        if(map2.containsKey("Thursday")) {
            list = map2.get("Thursday");
            if (list.contains(1)) {
                textView = (TextView) findViewById(R.id.one_four);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(2)) {
                textView = (TextView) findViewById(R.id.two_four);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(3)) {
                textView = (TextView) findViewById(R.id.three_four);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(4)) {
                textView = (TextView) findViewById(R.id.four_four);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(5)) {
                textView = (TextView) findViewById(R.id.five_four);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(6)) {
                textView = (TextView) findViewById(R.id.six_four);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(7)) {
                textView = (TextView) findViewById(R.id.seven_four);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(8)) {
                textView = (TextView) findViewById(R.id.eight_four);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(9)) {
                textView = (TextView) findViewById(R.id.nine_four);
                textView.setBackgroundResource(R.color.project_Color);
            }
        }
        if(map2.containsKey("Friday")) {
            list = map2.get("Friday");
            if (list.contains(1)) {
                textView = (TextView) findViewById(R.id.one_five);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(2)) {
                textView = (TextView) findViewById(R.id.two_five);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(3)) {
                textView = (TextView) findViewById(R.id.three_five);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(4)) {
                textView = (TextView) findViewById(R.id.four_five);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(5)) {
                textView = (TextView) findViewById(R.id.five_five);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(6)) {
                textView = (TextView) findViewById(R.id.six_five);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(7)) {
                textView = (TextView) findViewById(R.id.seven_five);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(8)) {
                textView = (TextView) findViewById(R.id.eight_five);
                textView.setBackgroundResource(R.color.project_Color);
            }
            if (list.contains(9)) {
                textView = (TextView) findViewById(R.id.nine_five);
                textView.setBackgroundResource(R.color.project_Color);
            }
        }

    }


    public void finish(View view) {
        Intent intent = new Intent();
        setResult(RESULT_CANCELED);
        finish();
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent();
        setResult(RESULT_CANCELED);
        finish();
    }

}
