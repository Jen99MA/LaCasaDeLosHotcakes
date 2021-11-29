package com.example.lacasadeloshotcakes;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class DetallePromoFragment extends Fragment {
//public class DetallePromoActivity extends AppCompatActivity {

    ImageView promo;
    TextView titulo, detalles;


    OnFragmentInteractionListener listener;
    Promo promoEntrante;
    public DetallePromoFragment() {
        // Required empty public constructor
    }
    public DetallePromoFragment(Promo p, OnFragmentInteractionListener _listener) {
        listener =_listener;
        promoEntrante = p;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalles_promo, container, false);

        promo = view.findViewById(R.id.promocion_image_view);
        titulo = view.findViewById(R.id.tituloPromo_text_view);
        detalles = view.findViewById(R.id.tdescripcionPromo_text_view);



        titulo.setText(promoEntrante.promo);
        detalles.setText(promoEntrante.descripcionPromo);


        promo.setImageResource(promoEntrante.direccionImagenPromo);
        return view;
    }
}