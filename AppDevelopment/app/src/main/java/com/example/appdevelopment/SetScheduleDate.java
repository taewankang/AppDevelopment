package com.example.appdevelopment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.style.TtsSpan;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.NumberPicker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SetScheduleDate extends AppCompatActivity {
    long now = System.currentTimeMillis();
    Date date = new Date(now);
    SimpleDateFormat simple_year = new SimpleDateFormat("yyyy");
    SimpleDateFormat simple_month = new SimpleDateFormat("MM");
    SimpleDateFormat simple_day = new SimpleDateFormat("dd");
    String str_year = simple_year.format(date);
    String str_month = simple_month.format(date);
    String str_day = simple_day.format(date);

    NumberPicker noon, hour, minute;        //NumberPicker에서 선택된 오전.후, 시간, 분
    String[] minute_arr = new String[60];     //분에 들어갈 데이터
    CalendarView calendarView;
    int set_year, set_month, set_day;       //선택된 년, 월, 일
    int selected_noon, selected_hour, selected_min; //선택된 오전, 후,  시간, 분
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_schedule_date);
        Log.d("superdroid", "onCreate");
        noon = (NumberPicker)findViewById(R.id.noon);
        hour = (NumberPicker)findViewById(R.id.hour);
        minute = (NumberPicker)findViewById(R.id.minute);

        noon.setDisplayedValues(new String[]{"오전", "오후"});
        noon.setMinValue(0);
        noon.setMaxValue(1);

        hour.setDisplayedValues(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"});
        hour.setMinValue(0);
        hour.setMaxValue(11);

        for(int i=0; i<60; i++){
            minute_arr[i] = Integer.toString(i);
        }
        minute.setDisplayedValues(minute_arr);
        minute.setMinValue(0);
        minute.setMaxValue(59);
        Log.d("superdroid", "onCreate2");

        calendarView = (CalendarView)findViewById(R.id.calendarView);
        set_year = Integer.parseInt(str_year);
        set_month = Integer.parseInt(str_month) - 1;
        set_day = Integer.parseInt(str_day);

        Log.d("superdroid", "simple: " + str_year + " " + str_month + " " + str_day);
    }

    @Override
    public void onStart() {
        super.onStart();

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                set_year = year;
                set_month = month;
                set_day = day;
            }
        });

        noon.setOnValueChangedListener(new NumberPicker.OnValueChangeListener(){
            @Override
            public void onValueChange(NumberPicker numberPicker, int old_value, int new_value) {
                selected_noon = new_value;
            }
        });

        hour.setOnValueChangedListener(new NumberPicker.OnValueChangeListener(){
            @Override
            public void onValueChange(NumberPicker numberPicker, int old_value, int new_value) {
                selected_hour = new_value;
            }
        });

        minute.setOnValueChangedListener(new NumberPicker.OnValueChangeListener(){
            @Override
            public void onValueChange(NumberPicker numberPicker, int old_value, int new_value) {
                selected_min = new_value;
            }
        });
    }

    public void setting_finish(View view) {
        Intent intent = new Intent();
        intent.putExtra("selected_year", set_year);
        intent.putExtra("selected_month", set_month);
        intent.putExtra("selected_day", set_day);
        intent.putExtra("selected_noon", selected_noon);
        intent.putExtra("selected_hour", selected_hour);
        intent.putExtra("selected_min", selected_min);
        setResult(RESULT_OK, intent);
        finish();
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent();
        setResult(RESULT_CANCELED);
        finish();
    }
}
