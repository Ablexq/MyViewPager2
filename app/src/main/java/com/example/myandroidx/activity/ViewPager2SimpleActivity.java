package com.example.myandroidx.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.example.myandroidx.adapter.MyAdapter;
import com.example.myandroidx.R;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class ViewPager2SimpleActivity extends AppCompatActivity implements MyAdapter.OnItemClickListener {

    private ViewPager2 mVp;
    private List<Integer> list = new ArrayList<Integer>();
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        if (list != null) list.clear();
        list.add(Color.RED);
        list.add(Color.GRAY);
        list.add(Color.BLUE);
        list.add(Color.YELLOW);
        list.add(Color.CYAN);
        list.add(Color.LTGRAY);
        list.add(Color.MAGENTA);
        list.add(Color.WHITE);
        mVp = (ViewPager2) findViewById(R.id.view_pager);
        adapter = new MyAdapter(this, list);
        mVp.setAdapter(adapter);
        adapter.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(int position) {
        Toast.makeText(getApplication(), "当前position=" + (position), Toast.LENGTH_SHORT).show();
        switch (position){
            case 0:
                //mVp.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
                break;
            case 1:
                list.set(position, Color.GREEN);
                adapter.notifyDataSetChanged();
                break;
            case 2:
                mVp.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
                break;
            case 3:
                mVp.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
                break;
        }
    }
}
