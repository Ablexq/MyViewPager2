package com.example.myandroidx.activity;

import android.os.Bundle;

import com.example.myandroidx.adapter.ViewPagerAdapter;
import com.example.myandroidx.fragment.OneFragment;
import com.example.myandroidx.R;
import com.example.myandroidx.fragment.TwoFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerTablayoutActivity extends AppCompatActivity {

    private ArrayList<Fragment> fragmentList;
    private ArrayList<String> list_Title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vp_tab);

        ViewPager viewPager = (ViewPager) this.findViewById(R.id.viewpager);
        TabLayout tabLayout = (TabLayout) this.findViewById(R.id.tablayout);

        fragmentList = new ArrayList<>();
        list_Title = new ArrayList<>();
        fragmentList.add(new OneFragment());
        fragmentList.add(new TwoFragment());
        list_Title.add("one");
        list_Title.add("two");
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), this, fragmentList, list_Title));
        tabLayout.setupWithViewPager(viewPager);//此方法就是让tablayout和ViewPager联动
    }
}
