package com.example.appdevelopment.ui.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.appdevelopment.R;

public class NewProjectFragment extends DialogFragment {
    EditText editText;
    Button button1, button2;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_project, container, false);
        editText= (EditText)view.findViewById(R.id.add_member_textview);
        button1 = (Button)view.findViewById(R.id.add_member_button);
        button2 = (Button)view.findViewById(R.id.make_project);
        button1.setOnClickListener(new View.OnClickListener(){  //멤버 추가 버튼
            @Override
            public void onClick(View view) {

            }
        });

        button2.setOnClickListener(new View.OnClickListener(){  //프로젝트 시작 버튼
            @Override
            public void onClick(View view) {

            }
        });
        return view;
    }
}
