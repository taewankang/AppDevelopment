package com.example.mobile;

import android.os.Bundle;
import android.util.Log;

import com.example.mobile.worldclock.WorldClockClass;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    AlarmManage alarmManage;
    public static List<AlarmManage> list = new ArrayList<>();
    private DateFormat noon = new SimpleDateFormat("a");
    private DateFormat hour = new SimpleDateFormat("HH");
    private DateFormat minute = new SimpleDateFormat("mm");
    private DateFormat second = new SimpleDateFormat("ss");

    public static List<WorldClockClass> clock = new ArrayList<WorldClockClass>();
    int time = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(navView, navController);
        if(noon.format(Calendar.getInstance().getTime()) == "오후")
            time += 43200;
        time += Integer.parseInt(hour.format(Calendar.getInstance().getTime())) * 3600;
        time += Integer.parseInt(minute.format(Calendar.getInstance().getTime())) * 60;
        time += Integer.parseInt(second.format(Calendar.getInstance().getTime()));
        Log.d("superdroid", time + "");
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    public List<WorldClockClass> getClock(){
        return clock;
    }

    public void setWorldClock(List<WorldClockClass> clock){
        this.clock = clock;
    }

    public void addWorldClock(WorldClockClass clock){       //리스트에 목록 추가
        this.clock.add(clock);
    }
}

