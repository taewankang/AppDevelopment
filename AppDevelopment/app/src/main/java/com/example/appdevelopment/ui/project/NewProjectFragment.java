package com.example.appdevelopment.ui.project;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.appdevelopment.R;

public class NewProjectFragment extends AppCompatActivity {
    EditText editText;
    Button button1, button2;
    Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_new_project);

        editText= (EditText)findViewById(R.id.add_member_textview);
        button1 = (Button)findViewById(R.id.add_member_button);
        button2 = (Button)findViewById(R.id.make_project);
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
    }
}
