package com.example.appdevelopment.ui.alarm;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.appdevelopment.R;


public class AlarmFragment extends Fragment {
    String name, ID;
    static TextView textView;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alarm, container, false);
        textView = (TextView)view.findViewById(R.id.name);
        return view;
    }

    public static void changeID(String str){
        textView.setText(str);
    }
}
