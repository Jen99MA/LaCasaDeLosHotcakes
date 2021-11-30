package com.example.lacasadeloshotcakes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class PromocionesFragment extends Fragment {


    OnFragmentInteractionListener listener;


    public PromocionesFragment() {
        // Required empty public constructor
    }
    public PromocionesFragment(OnFragmentInteractionListener _listener) {
        listener =_listener;
    }

    //Declaro y asigno mi lista de promociones
    List<Promo> promociones = new ArrayList<>();

    //Coneccion nerviosa del Recycle View
    RecyclerView menuRecycleview;

    //Crear la variable del adaptador de promociones
    AdaptadorPromos adaptador;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_promociones, container, false);

        promociones.add(new Promo("2 x 1 en Hotcakes Clásicos", "Selecciona tu sabor favorito de hotcakes clásicos y obten otra orden completamente gratis", R.drawable.promo));
        promociones.add(new Promo("Envio Gratis", "Disfruta tus alimentos favoritos desde la comodidad de tu hogar con el envió totalmente ¡Gratis!", R.drawable.promodos));
        promociones.add(new Promo("Malteada Gratis", "Acompaña tus Hotcakes con una de nuestras deliciosas malteadas, en la compra de unos Hotcakes Especiales será completamente gratis", R.drawable.promotres));
        promociones.add(new Promo("Club Sandwitch", "Llevate el sandwitch de tu preferencia y acompañalas con una orden de  papas a la francesa por solo $75", R.drawable.promocuatro));

        menuRecycleview = view.findViewById(R.id.promociones_RecyclerView);

        adaptador = new AdaptadorPromos(promociones, new AdaptadorPromos.OnItemClickListener(){
            @Override
            public void onItemClick(Promo p) {

                listener.alEscogerPromo(p);
            }
        });
        menuRecycleview.setAdapter(adaptador);
        return view;
    }
}