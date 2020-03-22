package com.example.android_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a fragment1



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO (3) Create a fragment 1 instance and display it using the Fragment manager

        FragmentManager fm = getSupportFragmentManager();


        Fragment firstFragment = new FirstFragment();

        fm.beginTransaction()
                .add(R.id.fragment_container1, firstFragment)
                .commit();



        Fragment secondFragment = new SecondFragment();
        fm.beginTransaction()
                .add(R.id.fragment_container2, secondFragment)
                .commit();



    }
}
