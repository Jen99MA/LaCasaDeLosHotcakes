package com.example.lacasadeloshotcakes;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DetallesPlatilloFragment extends Fragment {

    ImageView platillo, calificacion;
    TextView titulo, detalles, alergias, precio;

OnFragmentInteractionListener listener;
Platillo platilloEntrante;
    public DetallesPlatilloFragment() {
        // Required empty public constructor
    }
    public DetallesPlatilloFragment(Platillo p, OnFragmentInteractionListener _listener) {
        listener =_listener;
        platilloEntrante = p;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalles_platillo, container, false);

        platillo = view.findViewById(R.id.platillo_image_view);
        calificacion = view.findViewById(R.id.calificacion_image_view);
        titulo = view.findViewById(R.id.titulo_text_view);
        detalles = view.findViewById(R.id.detalles_text_view);
        alergias = view.findViewById(R.id.dalergias_text_view);
        precio = view.findViewById(R.id.precio_text_view);



        titulo.setText(platilloEntrante.titulo);
        detalles.setText(platilloEntrante.detalles);
        alergias.setText(platilloEntrante.dalergias);
        precio.setText(platilloEntrante.precio);

        platillo.setImageResource(platilloEntrante.direccionImagenPlatillo);
        calificacion.setImageResource(platilloEntrante.direcconImagenCalificacion);
return view;
    }
}