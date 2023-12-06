package com.edu.voquoctinh.myfoodapp.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.edu.voquoctinh.myfoodapp.R;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                                ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_home_fragment,container,false);
        return root;
    }
}