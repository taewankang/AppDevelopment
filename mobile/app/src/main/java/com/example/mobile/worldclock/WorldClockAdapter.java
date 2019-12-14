package com.example.mobile.worldclock;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mobile.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class WorldClockAdapter extends BaseAdapter {
    Context mContext = null;
    List<WorldClockClass> data ;
    LayoutInflater mInflater = null;

    public WorldClockAdapter(Context context, List<WorldClockClass> data){
        mContext = context;
        this.data = data;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public WorldClockClass getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View itemLayout = mInflater.inflate(R.layout.activity_world_clock_list, null);
        TextView country_view = (TextView)itemLayout.findViewById(R.id.country);
        TextView time_view = (TextView)itemLayout.findViewById(R.id.time);

        WorldClockClass worldClockClass = new WorldClockClass();
        String country = data.get(position).getCountry();
        String time = data.get(position).getNoon() + " " + data.get(position).getHour() + "시, " + data.get(position).getMin() + "분";
        country_view.setText(country);
        time_view.setText(time);
        return itemLayout;
    }
}
