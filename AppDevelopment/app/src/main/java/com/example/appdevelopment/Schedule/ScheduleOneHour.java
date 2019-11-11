package com.example.appdevelopment.Schedule;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.appdevelopment.R;

public class ScheduleOneHour extends AppCompatActivity {
    boolean[][] scheduler = new boolean[10][6];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_one_hour);
        for(int i=0; i<10; i++){
            for(int j=0; j<6; j++)
                scheduler[i][j] = false;
        }
    }

    public void add(View view) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("스케줄 추가");
        alertDialog.show();
    }

    public void onClick(View view) {
        switch(view.getId()){
            case R.id.one_one:
                changeColor(1,1, view);
                break;
            case R.id.one_two:
                changeColor(1, 2, view);
                break;
            case R.id.one_three:
                changeColor(1,3, view);
                break;
            case R.id.one_four:
                changeColor(1,4, view);
                break;
            case R.id.one_five:
                changeColor(1,5, view);
                break;
            case R.id.two_one:
                changeColor(2,1, view);
                break;
            case R.id.two_two:
                changeColor(2,2, view);
                break;
            case R.id.two_three:
                changeColor(2,3, view);
                break;
            case R.id.two_four:
                changeColor(2,4, view);
                break;
            case R.id.two_five:
                changeColor(2,5, view);
                break;

            case R.id.three_one:
                changeColor(3,1, view);
                break;
            case R.id.three_two:
                changeColor(3,2, view);
                break;
            case R.id.three_three:
                changeColor(3,3, view);
                break;
            case R.id.three_four:
                changeColor(3,4, view);
                break;
            case R.id.three_five:
                changeColor(3,5, view);
                break;

            case R.id.four_one:
                changeColor(4,1, view);
                break;
            case R.id.four_two:
                changeColor(4,2, view);
                break;
            case R.id.four_three:
                changeColor(4,3, view);
                break;
            case R.id.four_four:
                changeColor(4,4, view);
                break;
            case R.id.four_five:
                changeColor(4, 5, view);
                break;

            case R.id.five_one:
                changeColor(5, 1, view);
                break;
            case R.id.five_two:
                changeColor(5, 2, view);
                break;
            case R.id.five_three:
                changeColor(5, 3, view);
                break;
            case R.id.five_four:
                changeColor(5, 4, view);
                break;
            case R.id.five_five:
                changeColor(5, 5, view);
                break;

            case R.id.six_one:
                changeColor(6, 1, view);
                break;
            case R.id.six_two:
                changeColor(6, 2, view);
                break;
            case R.id.six_three:
                changeColor(6, 3, view);
                break;
            case R.id.six_four:
                changeColor(6, 4, view);
                break;
            case R.id.six_five:
                changeColor(6, 5, view);
                break;

            case R.id.seven_one:
                changeColor(7, 1, view);
                break;
            case R.id.seven_two:
                changeColor(7, 2, view);
                break;
            case R.id.seven_three:
                changeColor(7, 3, view);
                break;
            case R.id.seven_four:
                changeColor(7, 4, view);
                break;
            case R.id.seven_five:
                changeColor(7, 5, view);
                break;

            case R.id.eight_one:
                changeColor(8, 1, view);
                break;
            case R.id.eight_two:
                changeColor(8, 2, view);
                break;
            case R.id.eight_three:
                changeColor(8, 3, view);
                break;
            case R.id.eight_four:
                changeColor(8, 4, view);
                break;
            case R.id.eight_five:
                changeColor(8, 5, view);
                break;

            case R.id.nine_one:
                changeColor(9, 1, view);
                break;
            case R.id.nine_two:
                changeColor(9, 2, view);
                break;
            case R.id.nine_three:
                changeColor(9, 3, view);
                break;
            case R.id.nine_four:
                changeColor(9, 4, view);
                break;
            case R.id.nine_five:
                changeColor(9, 5, view);
                break;
        }
    }
    
    public void changeColor(int i, int j, View view){
        if(scheduler[i][j] == false) {
            view.setBackground(ContextCompat.getDrawable(this, R.drawable.scheduler_button_background));
            scheduler[i][j] = true;
        }else{
            view.setBackground(ContextCompat.getDrawable(this, R.drawable.border_line));
            scheduler[i][j] = false;
        }
    }
}