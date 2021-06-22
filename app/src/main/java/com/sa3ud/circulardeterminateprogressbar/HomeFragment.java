package com.sa3ud.circulardeterminateprogressbar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;


public class HomeFragment extends Fragment {

    private int progr = 0;

    Button btnIncr, btnDecr;
    TextView tvProgress;
    ProgressBar pbCircular;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View parentView = inflater.inflate(R.layout.fragment_home, container, false);

        btnIncr = parentView.findViewById(R.id.btn_incr);
        btnDecr = parentView.findViewById(R.id.btn_decr);
        pbCircular = parentView.findViewById(R.id.progress_bar);
        tvProgress = parentView.findViewById(R.id.tv_progress);

        updateProgressBar();


        btnIncr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progr <= 90) {
                    progr += 10;
                    updateProgressBar();
                }
            }
        });

        btnDecr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progr >= 10) {
                    progr -= 10;
                    updateProgressBar();
                }
            }
        });


        return parentView;
    }

    private void updateProgressBar() {

        pbCircular.setProgress(progr);
        tvProgress.setText(progr + "%");


    }

}