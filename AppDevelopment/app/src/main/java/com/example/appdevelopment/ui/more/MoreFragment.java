package com.example.appdevelopment.ui.more;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.appdevelopment.R;

public class MoreFragment extends Fragment {
    Context context;
    LinearLayout linearLayout;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_more, container, false);
        linearLayout = (LinearLayout)view.findViewById(R.id.my_schedule);
        return view;
    }
}
