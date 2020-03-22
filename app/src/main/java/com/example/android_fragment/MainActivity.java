package com.example.android_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    private Button replaceButton;
    private Fragment fragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        replaceButton = findViewById(R.id.replace_button);

        replaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(fragment instanceof FirstFragment) {
                    fragment = new SecondFragment();
                    loadFragments(fragment);
                }else if(fragment instanceof SecondFragment){
                    fragment = new FirstFragment();
                    loadFragments(fragment);
                }
            }
        });

        fragment = new FirstFragment();
        loadFragments(fragment);
    }

    // TODO (3) Create a method to load fragments

    public void loadFragments(Fragment fragment){

        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit();
    }

}
