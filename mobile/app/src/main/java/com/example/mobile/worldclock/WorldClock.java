package com.example.mobile.worldclock;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.mobile.MainActivity;
import com.example.mobile.R;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class WorldClock extends Fragment {
    private static final int RESULT_OK = -1;
    private final int AddWorldClock = 1;
    TextView current_time_textView;
    DateFormat hour_min = new SimpleDateFormat("HH:mm");    //시, 분을 가짐
    DateFormat noon = new SimpleDateFormat("a");            //오전, 오후 나뉨
    Button add, add2;
    String time_string = "", noon_string = "";
    List<WorldClockClass> clock;
    ListView listView = null;
    MainActivity mainActivity = new MainActivity();
    WorldClockAdapter mAdapter = null;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.world_clock, container, false);
        current_time_textView = (TextView)view.findViewById(R.id.current_time_textView);
        time_string = hour_min.format(Calendar.getInstance().getTime());
        noon_string = noon.format(Calendar.getInstance().getTime());
        add = view.findViewById(R.id.add);
        add2 = view.findViewById(R.id.add2);
        clock = mainActivity.getClock();
        listView = (ListView)view.findViewById(R.id.listView);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {        //+버튼
                intentFunc();
            }
        });

        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {        //보라색 버튼
                intentFunc();
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, final int position, long id) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
                alertDialog.setTitle("삭제").setMessage("삭제하시겠습니까?");
                alertDialog.setPositiveButton("확인", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.clock.remove(position);
                    }
                });
                alertDialog.setNegativeButton("취소", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                return true;
            }
        });

        return view;
    }

    public void intentFunc(){       //현재 시간을 보냄
        int hour  = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        int min = Calendar.getInstance().get(Calendar.MINUTE);
        Intent intent = new Intent(getContext(), WorldClockSelect.class);
        intent.putExtra("hour", hour);       //현재 시간을 보냄
        intent.putExtra("min", min);
        intent.putExtra("noon", noon_string);
        startActivityForResult(intent, AddWorldClock);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent){
        super.onActivityResult(requestCode, resultCode, intent);
        if(requestCode == AddWorldClock){
            if(resultCode == RESULT_OK) {
            }
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        String current_time = "현지 시각\n" + noon_string + " " + time_string + "\n";
        current_time_textView.setText(current_time);
        if(clock.size() != 0)
            add2.setVisibility(View.GONE);
        mAdapter = new WorldClockAdapter(getContext(), clock);
        Log.d("superdroid", MainActivity.clock.size() + "");
        listView.setAdapter(mAdapter);
    }
}
