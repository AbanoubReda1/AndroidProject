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

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    Context mcontext;
    List<NewsItem> mData;

    boolean isDark=false;

    public NewsAdapter(Context mcontext, List<NewsItem> mData, boolean isDark) {
        this.mcontext = mcontext;
        this.mData = mData;
        this.isDark = isDark;
    }

    public NewsAdapter(Context mcontext, List<NewsItem> mData) {
        this.mcontext = mcontext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View layout;
        layout= LayoutInflater.from(mcontext).inflate(R.layout.item_news,viewGroup,false);
        return new NewsViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder newsViewHolder, int position) {


        newsViewHolder.img_user.setAnimation(AnimationUtils.loadAnimation(mcontext,R.anim.anim));
        newsViewHolder.container.setAnimation(AnimationUtils.loadAnimation(mcontext,R.anim.anmi2));

        newsViewHolder.tv_title.setText(mData.get(position).getTitle());
        newsViewHolder.tv_content.setText(mData.get(position).getContent());
        newsViewHolder.tv_data.setText(mData.get(position).getDate());
        newsViewHolder.img_user.setImageResource(mData.get(position).getUserpoto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder{

        TextView tv_title,tv_content,tv_data;
        ImageView img_user;
        RelativeLayout container;
        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            container=itemView.findViewById(R.id.container);
            tv_title=itemView.findViewById(R.id.tv_title);
            tv_content=itemView.findViewById(R.id.tv_description);
            tv_data=itemView.findViewById(R.id.tv_date);
            img_user=itemView.findViewById(R.id.imguser);


            if (isDark) {
                setDarkTheme();
            }

        }
        private void setDarkTheme() {

            container.setBackgroundResource(R.drawable.card_bg_dark);

        }
    }
}
