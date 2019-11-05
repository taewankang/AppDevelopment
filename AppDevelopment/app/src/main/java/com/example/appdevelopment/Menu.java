package com.example.appdevelopment;

<<<<<<< HEAD
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

import com.example.appdevelopment.ui.alarm.AlarmFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
=======
import android.os.Bundle;
import android.view.Window;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
>>>>>>> 195a4d0b793c9c40d5a52b9017fb41357775f937
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class Menu extends AppCompatActivity {
<<<<<<< HEAD
    Intent intent;
    String ID;
    Bundle bundle = new Bundle();
=======

>>>>>>> 195a4d0b793c9c40d5a52b9017fb41357775f937
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
<<<<<<< HEAD

        intent = getIntent();
        ID = intent.getStringExtra("ID");
        BottomNavigationView navView = findViewById(R.id.nav_view);
=======
        BottomNavigationView navView = findViewById(R.id.nav_view);

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
>>>>>>> 195a4d0b793c9c40d5a52b9017fb41357775f937
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_alarm, R.id.navigation_member, R.id.navigation_project, R.id.navigation_calendar, R.id.navigation_more)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
<<<<<<< HEAD

=======
>>>>>>> 195a4d0b793c9c40d5a52b9017fb41357775f937
//        밑에 놈이 Toolbar를 설정하는 옵션임
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }
<<<<<<< HEAD
    @Override
    public void onStart(){
        super.onStart();
//        AlarmFragment alarm = (AlarmFragment)getSupportFragmentManager().findFragmentById(R.id.navigation_alarm);
        AlarmFragment.changeID(ID);
    }

    @Override
    public void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause()", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop()", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy()", Toast.LENGTH_LONG).show();
    }
=======
>>>>>>> 195a4d0b793c9c40d5a52b9017fb41357775f937
}
