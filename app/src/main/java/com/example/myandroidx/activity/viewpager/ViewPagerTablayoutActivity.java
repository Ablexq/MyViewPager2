package com.example.myandroidx.activity.viewpager;

import android.os.Bundle;

import com.example.myandroidx.activity.BaseActivity;
import com.example.myandroidx.adapter.ViewPagerAdapter;
import com.example.myandroidx.fragment.FiveFragment;
import com.example.myandroidx.fragment.FourFragment;
import com.example.myandroidx.fragment.OneFragment;
import com.example.myandroidx.R;
import com.example.myandroidx.fragment.ThreeFragment;
import com.example.myandroidx.fragment.TwoFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerTablayoutActivity extends BaseActivity {

    private ArrayList<Fragment> fragmentList;
    private ArrayList<String> list_Title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vp_tab);

        ViewPager viewPager = (ViewPager) this.findViewById(R.id.viewpager);
        TabLayout tabLayout = (TabLayout) this.findViewById(R.id.tablayout);
        viewPager.setOffscreenPageLimit(5);
        fragmentList = new ArrayList<>();
        list_Title = new ArrayList<>();
        fragmentList.add(new OneFragment());
        fragmentList.add(new TwoFragment());
        fragmentList.add(new ThreeFragment());
        fragmentList.add(new FourFragment());
        fragmentList.add(new FiveFragment());
        list_Title.add("one");
        list_Title.add("two");
        list_Title.add("three");
        list_Title.add("four");
        list_Title.add("five");
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), this, fragmentList, list_Title));
        tabLayout.setupWithViewPager(viewPager);//此方法就是让tablayout和ViewPager联动
    }
}
