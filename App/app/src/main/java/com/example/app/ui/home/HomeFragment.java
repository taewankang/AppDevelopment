package com.example.app.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.app.fromhomefragment.AddAlarm;
import com.example.app.fromhomefragment.AddProject;
import com.example.app.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private HomeViewModel homeViewModel;
    ImageButton add_button, alarm_button, subway_button;
    private Spinner spinner;
    private ArrayList<String> arr = new ArrayList<>();
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        add_button = view.findViewById(R.id.add_image_button);
        alarm_button = view.findViewById(R.id.alarm_image_button);


//        subway_button = view.findViewById(R.id.subway_image_button);
        spinner = view.findViewById(R.id.spinner);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), AddProject.class));
            }
        });

        alarm_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getActivity(), AddAlarm.class));
            }
        });

        arr.add("새로운 프로젝트 추가");


//        subway_button.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//
//            }
//        });

        return view;
    }
}