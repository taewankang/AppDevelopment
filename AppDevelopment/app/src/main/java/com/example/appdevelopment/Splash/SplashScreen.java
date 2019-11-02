package com.example.appdevelopment.Splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.appdevelopment.MainActivity;
import com.example.appdevelopment.R;

public class SplashScreen extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        Handler hd = new Handler();
        hd.postDelayed(new splashHandler(), 1000);
    }
    
    private class splashHandler implements Runnable{
        public void run(){
            startActivity(new Intent(getApplication(), MainActivity.class));
            SplashScreen.this.finish();
        }
    }
    
}
