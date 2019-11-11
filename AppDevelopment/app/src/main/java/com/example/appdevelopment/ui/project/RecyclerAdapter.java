package com.example.appdevelopment.ui.project;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdevelopment.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    String largetext, smalltext;
    ImageView imageView;
    List<String> title = new ArrayList<String>();
    List<String> mini_title = new ArrayList<String>();
    int counting = 0;
    public RecyclerAdapter(List<String> str1, List<String> str2){
        this.title = str1;
        this.mini_title = str2;
        this.counting = counting;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_project_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        holder.largeTextView.setText(title.get(position));
        holder.smallTextView.setText(mini_title.get(position));
    }

    @Override
    public int getItemCount(){
        return title.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public TextView largeTextView;
        public TextView smallTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            Log.i("superdroid", "here");
            imageView = itemView.findViewById(R.id.imageView);
            largeTextView = itemView.findViewById(R.id.large_textView);
            smallTextView = itemView.findViewById(R.id.small_textView);
        }
    }
}