package com.example.user.carisupir;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class HomeFragment extends Fragment implements View.OnClickListener {

    Button btn_order;
    View v;


    public HomeFragment() {
        // Required empty public constructor


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       v = inflater.inflate(R.layout.fragment_home, container, false);

        btn_order = (Button) v.findViewById(R.id.btn_order);
        btn_order.setOnClickListener(this);


       return v;



    }


    @Override
    public void onClick(View v) {


    }
}
