package com.example.android_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * https://developer.android.com/guide/components/fragments
 */

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a fragment1

    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO (3) Create a fragment 1 instance and display it using the Fragment manager
        // TODO (4) dynamically add and replace fragments

    }
}


