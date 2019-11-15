package com.example.appdevelopment.ui.member;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.appdevelopment.Menu;
import com.example.appdevelopment.R;

public class MemberFragment extends Fragment {
    String name;
    TextView name_textView;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_member, container, false);
        name_textView = (TextView)view.findViewById(R.id.name);
        return view;
    }

    public void  onStart(){
        super.onStart();
        name_textView.setText(Menu.getID());
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
