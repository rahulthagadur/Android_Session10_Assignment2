package com.example.thagadur.android_session10_assignment2;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Thagadur on 8/23/2017.
 */

public class FramgmentOne extends Fragment {

    Button layout1, layout2, layout3, layout4;
    SetFragmaentNameOne setFragmaentNameOne;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_layout_1, container, false);
        //Initialise with the Button ID
        layout1 = (Button) view.findViewById(R.id.layout_1);
        layout2 = (Button) view.findViewById(R.id.layout_2);
        layout3 = (Button) view.findViewById(R.id.layout_3);
        layout4 = (Button) view.findViewById(R.id.layout_4);

        //Setting text on Button click
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = "Layout 1";
                setFragmaentNameOne.setName(name);
            }
        });
        //Setting text on Button click
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = "Layout 2";
                setFragmaentNameOne.setName(name);
            }
        });
        //Setting text on Button click
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = "Layout 3";
                setFragmaentNameOne.setName(name);
            }
        });
        //Setting text on Button click
        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = "Layout 4";
                setFragmaentNameOne.setName(name);
            }
        });
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            setFragmaentNameOne = (SetFragmaentNameOne) activity;

        } catch (Exception e) {

        }
    }

    //Created interace with function for sending information to other fragments(here it is fragment two)
    //fragmentTwo will override this function to get the name
    public interface SetFragmaentNameOne {
        public void setName(String name);
    }
}



