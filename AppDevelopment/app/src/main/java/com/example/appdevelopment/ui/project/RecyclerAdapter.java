package com.example.appdevelopment.ui.project;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
    Context context;
    private OnItemClickListener mListener = null;
    AlertDialog.Builder alertDialog;
    public interface OnItemClickListener{
        void onItemClick(View v, int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){               //클릭리스너 초기화
        this.mListener = listener;
    }

    public RecyclerAdapter(Context context, List<String> str1, List<String> str2){                   //인스턴스변수에 초기화
        this.context = context;
        this.title = str1;
        this.mini_title = str2;
        this.counting = counting;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){           //어떤 레이아웃을 가지고 올건지
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_project_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){      //ViewHolder에 초기화
        holder.largeTextView.setText(title.get(position));
        holder.smallTextView.setText(mini_title.get(position));
    }

    @Override
    public int getItemCount(){
        return title.size();
    }       //list몇개 출력한건지

    public class ViewHolder extends RecyclerView.ViewHolder {       //아이디값 인스턴스 변수에 대입
        public TextView largeTextView;
        public TextView smallTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            largeTextView = itemView.findViewById(R.id.large_textView);
            smallTextView = itemView.findViewById(R.id.small_textView);
            itemView.setOnClickListener(new View.OnClickListener() {     //누르는 이벤트 발생
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    if (pos != RecyclerView.NO_POSITION) {
                        Intent intent = new Intent(v.getContext(), ProjectContents2.class);
                        String str = title.get(pos);
                        String str1 = title.get(pos).toString();    //이름 넘기기
                        intent.putExtra("project_name", title.get(pos).toString());
                        intent.putExtra("number", pos);
                        context.startActivity(intent);
                        notifyItemChanged(pos);
                    }
                }
            });
//            itemView.setLongClickable(true);
//            itemView.setOnLongClickListener(new View.OnLongClickListener() {
//                @Override
//                public boolean onLongClick(View view) {
//                    int pos = getAdapterPosition();
////                    alertDialog = new AlertDialog.Builder(context);
////                    alertDialog.setMessage("프로젝트 일정 생성");
////                    alertDialog.setTitle(title.get(pos).toString());
////                    alertDialog.setView(R.layout.new_project_dialog);
////
////                    alertDialog.setPositiveButton("일정 생성하기", new DialogInterface.OnClickListener() {
////                        @Override
////                        public void onClick(DialogInterface dialogInterface, int i) {
////
////                            dialogInterface.dismiss();
////                        }
////                    });
////                    alertDialog.show();
//                    return true;
//                }
//            });
        }
    }
}

