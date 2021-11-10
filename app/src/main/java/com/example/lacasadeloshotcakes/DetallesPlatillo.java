package com.example.lacasadeloshotcakes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetallesPlatillo extends AppCompatActivity {

    ImageView platillo, calificacion;
    TextView titulo, detalles, alergias, precio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_platillo);

        platillo = findViewById(R.id.platillo_image_view);
        calificacion = findViewById(R.id.calificacion_image_view);
        titulo = findViewById(R.id.titulo_text_view);
        detalles = findViewById(R.id.detalles_text_view);
        alergias = findViewById(R.id.dalergias_text_view);
        precio = findViewById(R.id.precio_text_view);

        Intent intentEntrante = getIntent();

        Platillo platilloEntrante = (Platillo) intentEntrante.getSerializableExtra("platilloEscogido");

        titulo.setText(platilloEntrante.titulo);
        detalles.setText(platilloEntrante.detalles);
        alergias.setText(platilloEntrante.dalergias);
        precio.setText(platilloEntrante.precio);

        platillo.setImageResource(platilloEntrante.direccionImagenPlatillo);
        calificacion.setImageResource(platilloEntrante.direcconImagenCalificacion);

    }
}