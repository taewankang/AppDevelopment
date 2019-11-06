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
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.appdevelopment.MainActivity;
import com.example.appdevelopment.R;

public class ProjectFragment extends Fragment implements View.OnClickListener {
    Button button;
    Bundle bundle;
    Context context;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_project, container, false);
        context = container.getContext();
        button = (Button)view.findViewById(R.id.add);
        button.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.add:
                Intent intent = new Intent(getContext(), AddProject.class);
                startActivity(intent);

//                NewProjectFragment projectFragment = new NewProjectFragment();
//                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id., projectFragment);
//                fragmentTransaction.addToBackStack(null);
//                fragmentTransaction.commit();
                break;
        }
    }
}
