package com.example.appdevelopment.ui.project;

<<<<<<< HEAD
import android.app.AlertDialog;
import android.content.DialogInterface;
=======
>>>>>>> 195a4d0b793c9c40d5a52b9017fb41357775f937
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
<<<<<<< HEAD
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
=======
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
>>>>>>> 195a4d0b793c9c40d5a52b9017fb41357775f937

import com.example.appdevelopment.R;

public class ProjectFragment extends Fragment {
<<<<<<< HEAD
    Button button;
    Bundle bundle;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_project, container, false);
        button = (Button)view.findViewById(R.id.add);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });
=======
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_project, container, false);
>>>>>>> 195a4d0b793c9c40d5a52b9017fb41357775f937
        return view;
    }
}
