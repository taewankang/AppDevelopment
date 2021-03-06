package com.example.appdevelopment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.example.appdevelopment.ui.alarm.AlarmFragment;
import com.example.appdevelopment.ui.project.ProjectFragment;
import com.example.appdevelopment.ui.project.ToDo;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu extends AppCompatActivity {
    Intent intent;
    static String ID;
    Bundle bundle = new Bundle();
    FragmentTransaction fragmentTransaction;
//    프로젝트 변수
    private static List<String> project_title = new ArrayList<String>();
    private static List<String> project_mini_title = new ArrayList<String>();
    private static Map<String, List<String>> name_list = new HashMap<>();
    private static Map<String, List<String>> email_list = new HashMap<>();
    private static List<ToDo> todo_list = new ArrayList<>();
    private static Map<String, List<ToDo>> todo_map = new HashMap<>();  //
    private static List<ToDo> all_list = new ArrayList<>();
    private static List<String> title_list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        intent = getIntent();
        ID = intent.getStringExtra("ID");
        BottomNavigationView navView = findViewById(R.id.nav_view);
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(navView, navController);
    }

    @Override
    public void onStart(){
        super.onStart();
        AlarmFragment.changeID(ID);

    }

    @Override
    public void onPause(){
        super.onPause();
    }

    @Override
    public void onStop(){
        super.onStop();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
    }

    public static String getID(){
        return ID;
    }

    public static void setProjectList(List<String> title, List<String> mini_title){
        project_title = ProjectFragment.getTitle();
        project_mini_title = ProjectFragment.getMiniTitle();
    }

    public static List<String> get_Title(){return project_title;}
    public static List<String> get_mini_title(){return project_mini_title;}

    public static void set_member_list(String project_name, List<String> member_list){ name_list.put(project_name, member_list); }
    public static Map<String, List<String>> get_member_list(){return name_list;}

    public static Map<String, List<String>> get_Email_list(){return email_list;}
    public static void set_todo(ToDo todo){
        todo_list.add(todo);
    }

    public static void setTodoMap(Map<String, List<ToDo>> todo_map){
        todo_map = todo_map;
    }

    public static Map<String, List<ToDo>> get_todo_map(){
        return todo_map;
    }
    public static List<ToDo> get_todo(){return todo_list;}

    //모든 할일들을 저장한 데이터
    public static void setAllList(ToDo list){   //추가 됨
        all_list.add(list);
    }
    public static List<ToDo> getAllList(){return all_list;}

    public static void setTitleList(String str){
        title_list.add(str);
    }

    public static List<String> getTitleList(){return title_list;}
}
