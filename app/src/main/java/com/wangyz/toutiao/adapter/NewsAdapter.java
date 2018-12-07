package com.wangyz.toutiao.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.TextView;

import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.wangyz.toutiao.R;
import com.wangyz.toutiao.bean.db.News;
import com.wangyz.toutiao.view.ContentActivity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author wangyz
 * NewsAdapter
 */
public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private Context mContext;

    private List<News> mList = new ArrayList<>();

    public void setList(List<News> list) {
        mList.clear();
        mList.addAll(list);
        notifyDataSetChanged();
    }

    public NewsAdapter(Context mContext, List<News> list) {
        this.mContext = mContext;
        mList.addAll(list);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_news, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        News model = mList.get(i);
        viewHolder.mTitle.setText(model.title);
        viewHolder.mAuthor.setText(model.author_name);
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date date = format.parse(model.date);
            format = new SimpleDateFormat("HH:mm");
            viewHolder.mTime.setText(format.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        boolean wifiConnected = NetworkUtils.isWifiConnected();
        RequestOptions requestOptions = new RequestOptions().placeholder(R.drawable.loading).error(R.drawable.load_failed);
        if (wifiConnected) {
            AbsListView.LayoutParams params = new AbsListView.LayoutParams(ScreenUtils.getScreenWidth(), DensityUtil.dp2px(170));
            viewHolder.itemView.setLayoutParams(params);

            viewHolder.mThumbnail.setVisibility(View.GONE);
            viewHolder.mThumbnail1.setVisibility(View.VISIBLE);
            Glide.with(mContext).load(model.thumbnail_pic_s).apply(requestOptions).into(viewHolder.mThumbnail1);
            if (!TextUtils.isEmpty(model.thumbnail_pic_s02)) {
                viewHolder.mThumbnail2.setVisibility(View.VISIBLE);
                Glide.with(mContext).load(model.thumbnail_pic_s02).apply(requestOptions).into(viewHolder.mThumbnail2);
            }
            if (!TextUtils.isEmpty(model.thumbnail_pic_s03)) {
                viewHolder.mThumbnail3.setVisibility(View.VISIBLE);
                Glide.with(mContext).load(model.thumbnail_pic_s03).apply(requestOptions).into(viewHolder.mThumbnail3);
            }
        } else {
            AbsListView.LayoutParams params = new AbsListView.LayoutParams(ScreenUtils.getScreenWidth(), DensityUtil.dp2px(90));
            viewHolder.itemView.setLayoutParams(params);
            viewHolder.mThumbnail.setVisibility(View.VISIBLE);
            viewHolder.mThumbnail1.setVisibility(View.GONE);
            viewHolder.mThumbnail2.setVisibility(View.GONE);
            viewHolder.mThumbnail3.setVisibility(View.GONE);
            Glide.with(mContext).load(model.thumbnail_pic_s).apply(requestOptions).into(viewHolder.mThumbnail);
        }

        viewHolder.mItem.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, ContentActivity.class);
            intent.putExtra("url", model.url);
            mContext.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_news)
        ConstraintLayout mItem;
        @BindView(R.id.item_news_tv_title)
        TextView mTitle;
        @BindView(R.id.item_news_tv_author)
        TextView mAuthor;
        @BindView(R.id.item_news_tv_time)
        TextView mTime;
        @BindView(R.id.item_news_iv_thumbnail)
        ImageView mThumbnail;
        @BindView(R.id.item_news_iv_thumbnail1)
        ImageView mThumbnail1;
        @BindView(R.id.item_news_iv_thumbnail2)
        ImageView mThumbnail2;
        @BindView(R.id.item_news_iv_thumbnail3)
        ImageView mThumbnail3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
