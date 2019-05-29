package com.example.myandroidx.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myandroidx.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FourFragment extends androidx.fragment.app.Fragment {
    private static final String TAG = FourFragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView==========" + 4);

        return inflater.inflate(R.layout.fragment_four, container, false);
    }
}
