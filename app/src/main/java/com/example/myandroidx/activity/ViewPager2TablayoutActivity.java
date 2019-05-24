package com.example.myandroidx.activity;

import android.os.Bundle;

import com.example.myandroidx.fragment.OneFragment;
import com.example.myandroidx.R;
import com.example.myandroidx.TabLayoutMediator;
import com.example.myandroidx.fragment.TwoFragment;
import com.example.myandroidx.adapter.ViewPager2Adapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

public class ViewPager2TablayoutActivity extends AppCompatActivity {

    private ArrayList<Fragment> fragmentList;
    private ArrayList<String> list_Title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager2 = (ViewPager2) this.findViewById(R.id.viewpager);
        TabLayout tabLayout = (TabLayout) this.findViewById(R.id.tablayout);

        fragmentList = new ArrayList<>();
        list_Title = new ArrayList<>();
        fragmentList.add(new OneFragment());
        fragmentList.add(new TwoFragment());
        list_Title.add("one");
        list_Title.add("two");

        viewPager2.setAdapter(new ViewPager2Adapter(this,list_Title));
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.OnConfigureTabCallback() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(list_Title.get(position));
            }
        }).attach();
    }
}
