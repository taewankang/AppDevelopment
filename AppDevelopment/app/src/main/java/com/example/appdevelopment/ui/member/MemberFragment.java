package com.example.appdevelopment.ui.member;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.appdevelopment.Menu;
import com.example.appdevelopment.R;
import com.example.appdevelopment.ui.project.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;

public class MemberFragment extends Fragment {
    String name;
    TextView name_textView;
    LinearLayout linearLayout;
    Inflater inflater;
    Map<String, List<String>> name_list;
    List<String> project_title= new ArrayList<>();
    MemberList memberList;
    View view;
    Context context;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_member, container, false);
        name_textView = (TextView)view.findViewById(R.id.name);
        linearLayout = (LinearLayout)view.findViewById(R.id.member_linear);
        name_list = Menu.get_member_list();
        context = container.getContext();
        project_title = Menu.get_Title();
        return view;
    }

    public void  onStart(){
        super.onStart();
        view = getView();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        name_textView.setText(Menu.getID());
        for(int i=0; i<project_title.size(); i++){
            view = layoutInflater.inflate(R.layout.member_project__name, null, false);
            TextView textView = (TextView)view.findViewById(R.id.title);
            textView.setText(project_title.get(i));
            linearLayout.addView(view);
            for(int j=0; j<name_list.get(project_title.get(i)).size(); j++) {
                view = layoutInflater.inflate(R.layout.activity_member_list, null, false);
                TextView textView2 = (TextView)view.findViewById(R.id.member);
                textView2.setText(name_list.get(project_title.get(i)).get(j).toString() + "");
                linearLayout.addView(view);
            }
        }
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
