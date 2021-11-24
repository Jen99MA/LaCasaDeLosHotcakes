package com.example.lacasadeloshotcakes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class PromoFragment extends Fragment implements View.OnClickListener {

   RecyclerView PromocionesRecyclerView;
    OnFragmentInteractionListener listener;


    public PromoFragment() {
        // Required empty public constructor
    }

    public PromoFragment(OnFragmentInteractionListener _listener) {

        listener = _listener;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_promo,container,false);

        PromocionesRecyclerView = v.findViewById(R.id.promociones_RecyclerView);

        // Inflate the layout for this fragment
        return v;
    }

    @Override
    public void onClick(View view) {
        listener.onFragmentInteraction(view.getId());

    }
}