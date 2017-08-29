package com.example.thagadur.android_session10_assignment2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Thagadur on 8/23/2017.
 */

public class FragmentTwo extends Fragment {
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_layout_2, container, false);
        textView = (TextView) view.findViewById(R.id.layout_two_text);
        return view;
    }

    //update the text respectively
    public void updateInfo(String name) {
        textView.setText(name);
    }
}
