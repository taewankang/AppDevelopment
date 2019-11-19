package com.example.appdevelopment.ui.member;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdevelopment.R;

public class RecyclerAdapterMember extends RecyclerView.Adapter<RecyclerAdapterMember.ViewHolder> {
    Context context;
    public void RecyclerAdpaterMember(Context context){
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_member_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){

    }

    @Override
    public int getItemCount(){return 1;}

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View itemView){
            super(itemView);
        }
    }
}
