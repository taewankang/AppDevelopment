package com.example.appdevelopment.ui.project;

import android.content.Context;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdevelopment.Menu;
import com.example.appdevelopment.R;

import java.util.ArrayList;
import java.util.List;

public class ProjectFragment extends Fragment implements View.OnClickListener {
    Button button;
    Bundle bundle;
    Context context;
    RecyclerView recyclerView;
    TextView name_textView;
    static List<String> title = new ArrayList<String>();
    static List<String> mini_title = new ArrayList<String>();
//    title: 제목  minititle: 소제목
    int counting = 1;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_project, container, false);//Menu에서 데이터 불러오기
        context = container.getContext();
        button = (Button)view.findViewById(R.id.add);
        button.setOnClickListener(this);
        title = Menu.get_Title();
        mini_title = Menu.get_mini_title();

        name_textView = (TextView)view.findViewById(R.id.name);
        return view;
    }

    public static List<String> getTitle(){ return title;}
    public static List<String> getMiniTitle(){return mini_title;}
    @Override
    public void onStart(){
        super.onStart();
        addViewer();
        name_textView.setText(Menu.getID());
        Toast.makeText(getContext(), title.size() + " ", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onStop(){
        super.onStop();
        Toast.makeText(getContext(), "onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Toast.makeText(getContext(), "onDestroy()", Toast.LENGTH_LONG).show();
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
            addViewer();
        }
    }

    public void addViewer(){
        RecyclerAdapter recyclerAdapters = new RecyclerAdapter(context, title, mini_title);
        recyclerView = getActivity().findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(recyclerAdapters);
    }
}

