package com.example.lacasadeloshotcakes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class HomeFragment extends Fragment {
OnFragmentInteractionListener listener;
ImageView desayunoImageView;
    public HomeFragment() {
        // Required empty public constructor
    }
    public HomeFragment(OnFragmentInteractionListener _listener) {
      listener =_listener;
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        desayunoImageView = view.findViewById(R.id.DesayunoMenuImageView);
        desayunoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onFragmentInteraction(view.getId());
            }
        });


        return view;
    }
}