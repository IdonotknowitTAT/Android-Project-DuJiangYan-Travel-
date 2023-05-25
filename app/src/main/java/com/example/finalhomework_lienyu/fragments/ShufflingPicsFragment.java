package com.example.finalhomework_lienyu.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.finalhomework_lienyu.R;


public class ShufflingPicsFragment extends Fragment {
    private int ImgId;
    private ImageView imageView;

    public ShufflingPicsFragment(int imgId) {
        ImgId = imgId;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_shuffling_pics, container, false);
        imageView = view.findViewById(R.id.imageView_shufflingItem);
        imageView.setImageResource(ImgId);
        return view;
    }
}