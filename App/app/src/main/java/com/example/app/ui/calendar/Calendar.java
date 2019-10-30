package com.example.app.ui.calendar;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.app.R;

public class Calendar extends Fragment {
    Button button;
//    LinearLayout.LayoutParams linear;
    LinearLayout lay;
    Context context;
    private int count = 0;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_calendar, container, false);
        button = (Button)view.findViewById(R.id.button);
        lay = (LinearLayout)view.findViewById(R.id.linear);
//        linear = (LinearLayout.LayoutParams)view.getLayoutParams();
//        linear.width=LinearLayout.LayoutParams.WRAP_CONTENT;
//        linear.height=LinearLayout.LayoutParams.WRAP_CONTENT;
        lay.setOrientation(LinearLayout.VERTICAL);
        context = getActivity();
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                
                Button button2 = new Button(context);
                button2.setText("새로 생성");
                lay.addView(button2);
            }
        });

        return view;
    }
}
