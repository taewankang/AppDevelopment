package com.example.appdevelopment.ui.project;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.appdevelopment.MainActivity;
import com.example.appdevelopment.R;

import java.util.ArrayList;
import java.util.List;

public class ProjectFragment extends Fragment implements View.OnClickListener {
    Button button;
    Bundle bundle;
    Context context;
    LinearLayout linear_project;
    LinearLayout.LayoutParams lp;
    Button button_list;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_project, container, false);
        context = container.getContext();
        button = (Button)view.findViewById(R.id.add);
        button.setOnClickListener(this);
        linear_project = (LinearLayout)view.findViewById(R.id.linear_project);
        lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        return view;
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.add:
                Intent intent = new Intent(getContext(), AddProject.class);
                startActivityForResult(intent, 0);
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 0){
            String result = data.getStringExtra("string");
            Toast.makeText(context, result, Toast.LENGTH_LONG).show();
            Button but = new Button(context);
            but.setText(result);
            linear_project.addView(but, lp);
        }
    }
}
