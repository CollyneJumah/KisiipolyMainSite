package com.example.kisii_national_polytechnic;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class classFaq extends Fragment {
    private TextView quest1,ans1,quest2,ans2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_faq, container, false);
        View v = inflater.inflate(R.layout.fragment_faq, container, false);

        quest1 = (TextView) v.findViewById(R.id.q1);
//        quest2 = (TextView) v.findViewById(R.id.q2);
        ans1 = (TextView) v.findViewById(R.id.a1);
//        ans2 = (TextView) v.findViewById(R.id.a2);

        quest1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ans1.setVisibility(v.VISIBLE);
                return true;
            }
        });

     return v;
    }
}
