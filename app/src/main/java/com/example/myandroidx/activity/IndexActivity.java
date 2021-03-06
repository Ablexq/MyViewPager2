package com.example.myandroidx.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myandroidx.R;
import com.example.myandroidx.activity.drawlayout.DrawerLayoutActivity;
import com.example.myandroidx.activity.viewpager.ViewPager2SimpleActivity;
import com.example.myandroidx.activity.viewpager.ViewPager2TablayoutActivity;
import com.example.myandroidx.activity.viewpager.ViewPagerTablayoutActivity;

import androidx.annotation.Nullable;

public class IndexActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }

    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                startActivity(new Intent(IndexActivity.this, ViewPager2SimpleActivity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(IndexActivity.this, ViewPager2TablayoutActivity.class));
                break;
            case R.id.btn3:
                startActivity(new Intent(IndexActivity.this, ViewPagerTablayoutActivity.class));
                break;
            case R.id.btn4:
                startActivity(new Intent(IndexActivity.this, CoordinateActivity.class));
                break;
                case R.id.btn5:
                startActivity(new Intent(IndexActivity.this, DrawerLayoutActivity.class));
                break;
        }
    }
}
