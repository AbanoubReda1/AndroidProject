package com.example.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsAdapter2 extends RecyclerView.Adapter<NewsAdapter2.NewsViewHolder> {

    Context mcontext2;
    List<NewsItem2> mData2;


    public NewsAdapter2(Context mcontext2, List<NewsItem2> mData2) {
        this.mcontext2 = mcontext2;
        this.mData2 = mData2;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View layout;
        layout= LayoutInflater.from(mcontext2).inflate(R.layout.item_news2,viewGroup,false);
        return new NewsViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder newsViewHolder, int position) {


        newsViewHolder.img_user2.setAnimation(AnimationUtils.loadAnimation(mcontext2,R.anim.anim));
        newsViewHolder.container2.setAnimation(AnimationUtils.loadAnimation(mcontext2,R.anim.anmi2));

        newsViewHolder.tv_title2.setText(mData2.get(position).getTitle2());
        newsViewHolder.tv_content2.setText(mData2.get(position).getContent2());
        newsViewHolder.tv_data2.setText(mData2.get(position).getDate2());
        newsViewHolder.img_user2.setImageResource(mData2.get(position).getUserpoto2());
    }

    @Override
    public int getItemCount() {
        return mData2.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder{

        TextView tv_title2,tv_content2,tv_data2;
        ImageView img_user2;
        RelativeLayout container2;
        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            container2=itemView.findViewById(R.id.container2);
            tv_title2=itemView.findViewById(R.id.tv_title2);
            tv_content2=itemView.findViewById(R.id.tv_description2);
            tv_data2=itemView.findViewById(R.id.tv_date2);
            img_user2=itemView.findViewById(R.id.imguser2);

        }
    }
}
