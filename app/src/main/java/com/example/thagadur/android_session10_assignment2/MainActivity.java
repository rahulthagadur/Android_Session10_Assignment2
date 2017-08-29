package com.example.thagadur.android_session10_assignment2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.name;

public class MainActivity extends AppCompatActivity implements FramgmentOne.SetFragmaentNameOne {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Overrided function of interface FramgmentOne.SetFragmaentNameOne
    @Override
    public void setName(String name) {
        //Create object of fragment2 and call updateInfo function of it
        FragmentTwo fragmentTwo = (FragmentTwo) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        fragmentTwo.updateInfo(name);
    }
}

