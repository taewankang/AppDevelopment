package com.example.app.ui.calendar;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import com.example.app.R;
public class SubCalendar extends AppCompatActivity {
    Button button;
    LinearLayout linear;
    Context context;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_calendar);
        button = (Button)findViewById(R.id.button);
        linear = (LinearLayout)findViewById(R.id.linear);
        context = this;
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Button button2 = new Button(context);
                button2.setText("새로 생성");
                linear.addView(button2);
            }
        });
    }
}
