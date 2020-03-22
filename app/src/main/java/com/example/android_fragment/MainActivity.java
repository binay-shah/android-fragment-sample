package com.example.android_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO (2) Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.view_pager);


        // TODO (3) Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        // TODO (4) Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

    }
}
