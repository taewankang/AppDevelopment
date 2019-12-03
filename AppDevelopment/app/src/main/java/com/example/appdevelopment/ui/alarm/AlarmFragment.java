package com.example.appdevelopment.ui.alarm;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;

import com.example.appdevelopment.AlarmLayout;
import com.example.appdevelopment.Menu;
import com.example.appdevelopment.R;
import com.example.appdevelopment.ui.project.ToDo;

import java.util.ArrayList;
import java.util.List;


public class AlarmFragment extends Fragment {
    String name, ID;
    static TextView textView, entry_textView;
    LinearLayout linearLayout;
    LinearLayout.LayoutParams layoutParams;
    AlarmLayout alarmLayout;
    List<ToDo> todo = new ArrayList<>();
    List<String> title_list = new ArrayList<>();
    Context context;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alarm, container, false);
        textView = (TextView)view.findViewById(R.id.name);
        entry_textView = (TextView)view.findViewById(R.id.entry_textView);
        ID = Menu.getID();
        entry_textView.setText("오늘도 힘내세요 " + ID + "님!");
        linearLayout = (LinearLayout)view.findViewById(R.id.project_alarm);
        context = container.getContext();
        todo = Menu.getAllList();
        Log.d("superdroid", "todo: " + todo.size() + " Menu : " + Menu.getAllList().size());
        title_list = Menu.getTitleList();
        Log.d("superdroid", "size: " + title_list.size());
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        textView.setText(Menu.getID());
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        linearLayout.removeAllViews();
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        int i=0;
        for(ToDo todo : todo){
            View view3 = layoutInflater.inflate(R.layout.activity_alarm_layout, null, false);
            view3.setLayoutParams(layoutParams);
            TextView project_name = (TextView)view3.findViewById(R.id.project_name);
            TextView schedule = (TextView)view3.findViewById(R.id.schedule);
            project_name.setText(title_list.get(i));
            i++;
            String project_str;
            if(todo.get_min() == 0)
                project_str = todo.get_month() + "/" + todo.get_day() + " " + todo.get_noon() + " " + todo.get_hour() + "시 ";
            else
                project_str = todo.get_month() + "/" + todo.get_day() + " " + todo.get_noon() + " " + todo.get_hour() + "시 " + todo.get_min() + "분 ";
            if(todo.get_location() != null)
                project_str += todo.get_location();

            schedule.setText(project_str);
            TextView text = new TextView(context);
            text.setLayoutParams(new LinearLayoutCompat.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 30));//띄는 간격
            linearLayout.addView(view3, layoutParams);
            linearLayout.addView(text);
        }
    }


    public static void changeID(String str){
        textView.setText(str);
    }
}
