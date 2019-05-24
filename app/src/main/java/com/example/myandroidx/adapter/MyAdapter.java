package com.example.myandroidx.adapter;


import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.myandroidx.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter {
    private static final String TAG = MyAdapter.class.getSimpleName();

    Context context;
    List<Integer> list;

    public MyAdapter(Context context, List<Integer> list) {
        this.context = context;
        this.list = list;
    }

    private OnItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_pager, parent, false);
        final MyViewHolder mViewHolder = new MyViewHolder(v);
        v.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick((Integer) v.getTag());
                    if ((Integer) v.getTag() == 0) {
                        mViewHolder.mTv.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
                    }
                }
            }
        });
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((MyViewHolder) holder).mLay.setBackgroundColor(list.get(position));
        ((MyViewHolder) holder).mTv.setText("当前 position = " + (position));
        ((MyViewHolder) holder).itemView.setTag(position);
        Log.e(TAG, "onBindViewHolder position:" + position);
    }

    @Override
    public int getItemCount() {
        return list != null ? list.size() : 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        LinearLayout mLay;
        TextView mTv;

        public MyViewHolder(View itemView) {
            super(itemView);
            mLay = (LinearLayout) itemView.findViewById(R.id.item_view_pager_lay);
            mTv = (TextView) itemView.findViewById(R.id.item_view_pager_tv);
        }
    }
}
