package com.example.mobile.worldclock;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.mobile.MainActivity;
import com.example.mobile.R;

import java.util.List;

public class WorldClockSelect extends Activity {
    Spinner continent, country;
    private ArrayAdapter<String> arrayAdapter = null;
    ImageView imageView;
    TextView time;
    int hour, min;  //시, 분
    String noon;
    MainActivity mainActivity = new MainActivity();
    WorldClockClass clock = new WorldClockClass();
    int result_hour, result_min;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world_clock_select);
        Intent intent = getIntent();
        continent = (Spinner)findViewById(R.id.continent);
        country = (Spinner)findViewById(R.id.country);
        String continent_name = continent.getSelectedItem().toString();
        imageView = (ImageView)findViewById(R.id.imageView);
        time = (TextView)findViewById(R.id.time);
        hour = intent.getIntExtra("hour", 0);
        min = intent.getIntExtra("min", 0);
        noon = intent.getStringExtra("noon");
        continent.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String array_str[] = null;
                if(l == 0){ array_str = getResources().getStringArray(R.array.asia);
                }else if(l == 1){ array_str = getResources().getStringArray(R.array.europe);
                }else if(l == 2){ array_str = getResources().getStringArray(R.array.north_america);
                }else if(l == 3){ array_str = getResources().getStringArray(R.array.south_america);
                }else if(l == 4){ array_str = getResources().getStringArray(R.array.oceania);
                }else if(l == 5){ array_str = getResources().getStringArray(R.array.africa);}
                ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, array_str);
                country.setAdapter(spinnerArrayAdapter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Log.d("superdroid", "onNothingSelected");
            }
        });
        country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int temp_hour = hour; int temp_min = min; String temo_noon = noon;
                if (country.getSelectedItem().toString().equals("도쿄")) { imageView.setImageResource(R.drawable.japan);
                } else if (country.getSelectedItem().toString().equals("서울")) {
                    imageView.setImageResource(R.drawable.korea);
                    controlTime(hour, min, 2, 0, noon);     //시간 조정하기
                } else if (country.getSelectedItem().toString().equals("베이징")) {    //-1
                    imageView.setImageResource(R.drawable.china);
                } else if (country.getSelectedItem().toString().equals("시드니")) {    //+2
                    imageView.setImageResource(R.drawable.australia);
                } else if (country.getSelectedItem().toString().equals("웰링턴")) {    //+4
                    imageView.setImageResource(R.drawable.newzealand);
                } else if (country.getSelectedItem().toString().equals("런던")) {     //-9
                    imageView.setImageResource(R.drawable.england);
                } else if (country.getSelectedItem().toString().equals("파리")) {     //-8
                    imageView.setImageResource(R.drawable.france);
                } else if (country.getSelectedItem().toString().equals("베를린")) {    //-8
                    imageView.setImageResource(R.drawable.germany);
                } else if (country.getSelectedItem().toString().equals("다카르")) {    //-9
                    imageView.setImageResource(R.drawable.senegal);
                } else if (country.getSelectedItem().toString().equals("나이로비")) {   //-6
                    imageView.setImageResource(R.drawable.kenya);
                } else if (country.getSelectedItem().toString().equals("케이프타운")) {  //-7
                    imageView.setImageResource(R.drawable.rsa);
                } else if (country.getSelectedItem().toString().equals("뉴욕")) {       //-14
                    imageView.setImageResource(R.drawable.usa);
                } else if (country.getSelectedItem().toString().equals("오타와")) {     //-14
                    imageView.setImageResource(R.drawable.canada);
                } else if (country.getSelectedItem().toString().equals("로스엔젤레스")) { //-17
                    imageView.setImageResource(R.drawable.usa);
                } else if (country.getSelectedItem().toString().equals("부에노스아이레스")) {   //-12
                    imageView.setImageResource(R.drawable.argentina);
                } else if (country.getSelectedItem().toString().equals("산티아고")) {     //-12
                    imageView.setImageResource(R.drawable.chille);
                } else if (country.getSelectedItem().toString().equals("브라질리아")) {      //-12
                    imageView.setImageResource(R.drawable.brazil); }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void controlTime(int current_hour, int current_min, int diff_hour, int diff_min, String noon){            //textView에 출력까지 가능하도록
        current_hour += diff_hour; current_min += diff_min;
        if(current_hour + diff_hour > 12) {
            noon = changeNoon(noon);
            current_hour -= 12;
        } else if(current_hour + diff_hour < 1) {
            noon = changeNoon(noon);
            current_hour += 12;
        }
        result_hour = current_hour; result_min = current_min;
        time.setText(current_hour + "시 " + current_min + "분");

    }

    public String changeNoon(String str){
        if(str.equals("오전"))
            str = "오후";
        else
            str = "오전";
        return str;
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d("superdroid", "onStart");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d("superdroid", "onPause");
    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent();
        setResult(RESULT_CANCELED);
        finish();
    }

    public void cancel(View view) {
        Intent intent = new Intent();
        setResult(RESULT_CANCELED);
        finish();
    }

    public void save(View view) {
        Intent intent = new Intent();
        clock.setCountry(country.getSelectedItem().toString());
        clock.setNoon(noon);
        clock.setHour(result_hour + "");
        clock.setMin(result_min + "");
        mainActivity.addWorldClock(clock);
        setResult(RESULT_OK);
        finish();
    }
}
