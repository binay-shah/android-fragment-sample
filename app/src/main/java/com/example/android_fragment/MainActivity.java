package com.example.android_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FragmentManager fm = getSupportFragmentManager();


        Fragment firstFragment = new FirstFragment();

        fm.beginTransaction()
                .add(R.id.fragment_container, firstFragment)
                .commit();
    }

    // TODO (3) Create a method to load fragments
}
