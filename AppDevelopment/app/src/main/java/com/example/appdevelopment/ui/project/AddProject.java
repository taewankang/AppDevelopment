package com.example.appdevelopment.ui.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.appdevelopment.R;

import java.util.ArrayList;
import java.util.List;

public class AddProject extends AppCompatActivity {
    Button button1;
    EditText editText, edit_project_name;
    LinearLayout linearLayout;
    LinearLayout.LayoutParams params;
    List<String> list = new ArrayList<String>();
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_project);
        editText = (EditText) findViewById(R.id.add_member_textview);
        edit_project_name = (EditText)findViewById(R.id.edit_project_name);
        button1 = (Button)findViewById(R.id.add_member_button);
        linearLayout = (LinearLayout)findViewById(R.id.scroll_linear);
    }

    public void onClick(View view){
        Intent intent = new Intent();
        intent.putExtra("string", editText.getText().toString());
        intent.putExtra("project_name", edit_project_name.getText().toString());
        setResult(0, intent);
        finish();
    }

    public void add_member(View view) {
        list.add(editText.getText().toString());
        TextView textview = new TextView(this);
        TextView textview2 = new TextView(this);
        textview.setTextSize(1, 25);
        textview2.setBackground(ContextCompat.getDrawable(this, R.drawable.border_line2));
        textview.setText(editText.getText().toString());
        editText.setText("");
        linearLayout.addView(textview);
        linearLayout.addView(textview2);
    }
}
