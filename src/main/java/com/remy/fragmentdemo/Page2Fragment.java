package com.remy.fragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Page2Fragment extends Fragment {
    private Button button;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.page2layout, container, false);
        button = view.findViewById(R.id.buttonP2Action);
        button.setOnClickListener( v -> {
            System.out.println("page 2 action");
        });
        return view;
    }
}
