package com.example.myandroidx.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myandroidx.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ThreeFragment extends androidx.fragment.app.Fragment {
    private static final String TAG = ThreeFragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView==========" + 3);

        return inflater.inflate(R.layout.fragment_three, container, false);
    }
}
