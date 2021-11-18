package com.example.lacasadeloshotcakes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

//Hola Moni ¿Cómo estás? c:

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class MenuFragment extends Fragment implements View.OnClickListener {

ImageView promo_ImageView, home_ImageView, reserva_ImageView;
OnFragmentInteractionListener listener;


    public MenuFragment() {
        // Required empty public constructor
    }

    public MenuFragment(OnFragmentInteractionListener _listener) {

listener = _listener;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_menu,container,false);

       promo_ImageView = v.findViewById(R.id.promo_image_view);
       home_ImageView = v.findViewById(R.id.home_image_view);
       reserva_ImageView = v.findViewById(R.id.reserva_image_view);

        promo_ImageView.setOnClickListener(this);
        home_ImageView.setOnClickListener(this);
        reserva_ImageView.setOnClickListener(this);


        // Inflate the layout for this fragment
        return v;
    }

    @Override
    public void onClick(View view) {
        listener.onFragmentInteraction(view.getId());

}
}