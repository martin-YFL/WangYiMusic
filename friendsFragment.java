package com.example.a117.wangyimusic;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 117 on 2018/5/18.
 */

public class friendsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
                             savedInstanceState){

        View view = inflater.inflate(R.layout.fragment_friends,container,false);
        return view;
    }
}
