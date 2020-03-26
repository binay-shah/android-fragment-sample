package com.example.android_fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO (2) Find the view pager that will allow the user to swipe between fragments

        // TODO (3) Create an adapter that knows which fragment should be shown on each page

        // TODO (4) Set the adapter onto the view pager

    }


    /**
     *  TODO (5) setArguments(Bundle args)
     * Instead of having 3 individual Fragment files that do practically the same,
     * you can also pass in a String argument into the Fragment. Then that fragment can contain the logic
     * to change the text displayed in the TextView depending on the String passed into it.
     */
}
