package com.example.wind.weixin6_0;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by wind on 17-6-27.
 */

public class TabFragment extends Fragment {

    private String mTitle="Default";
    public static final String TITLE="title";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {

        if(getArguments()!=null){
            mTitle=getArguments().getString(TITLE);
        }
        TextView tv=new TextView(getActivity());
        tv.setBackgroundColor(0xffffffff);
        tv.setTextColor(0xff000000);
        tv.setTextSize(20);
        tv.setGravity(Gravity.CENTER);
        tv.setText(mTitle);

        return tv;
    }
}
