package com.example.appdevelopment.ui.project;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdevelopment.R;

import java.util.ArrayList;
import java.util.List;

public class ProjectFragment extends Fragment implements View.OnClickListener {
    Button button;
    Bundle bundle;
    Context context;
    RecyclerView recyclerView;
    List<String> title = new ArrayList<String>();
    List<String> mini_title = new ArrayList<String>();
    List<Button> button_list = new ArrayList<Button>();
//    title: 제목  minititle: 소제목
    int counting = 1;
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
                startActivityForResult(intent, 0);
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 0){
            String result = data.getStringExtra("string");
            String project_name = data.getStringExtra("project_name");
            title.add(project_name);
            mini_title.add("OKAY");
            RecyclerAdapter recyclerAdapters = new RecyclerAdapter(title, mini_title);
            recyclerView = getActivity().findViewById(R.id.recyclerView);

            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            recyclerView.setAdapter(recyclerAdapters);
        }
    }
}

