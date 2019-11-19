package com.example.appdevelopment.ui.project;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.appdevelopment.R;
import com.example.appdevelopment.Start.ScheduleOneHour;

public class NewProjectDialog extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_project_dialog);
        button = (Button)findViewById(R.id.set_schedule);
    }
}
