package com.example.appdevelopment.ui.alarm;

<<<<<<< HEAD
import android.content.Intent;
=======
>>>>>>> 195a4d0b793c9c40d5a52b9017fb41357775f937
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
<<<<<<< HEAD
import android.widget.Toast;
=======
>>>>>>> 195a4d0b793c9c40d5a52b9017fb41357775f937

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.appdevelopment.R;

<<<<<<< HEAD

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
=======
public class AlarmFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alarm, container, false);
        return view;
    }
>>>>>>> 195a4d0b793c9c40d5a52b9017fb41357775f937
}
