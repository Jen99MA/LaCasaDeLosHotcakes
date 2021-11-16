package com.example.lacasadeloshotcakes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class DesayunosActivity extends AppCompatActivity {

    //Declaro y asigno mi lista de platillos
    List<Platillo> platillos = new ArrayList<>();

    //Coneccion nerviosa del Recycle View
    RecyclerView menuRecycleview;

    //Crear la variable del adaptador de peliculas
    AdaptadorPlatillos adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desayunos);

        platillos.add(new Platillo("Hotcakes con Helado", "4 Hotcakes con una bola de helado del sabor de su preferencia (Chocolate, Vainilla, Fresa", "Fresa, Huevo, Leche", "$150", R.drawable.hotcakeshelado, R.drawable.e4));
        platillos.add(new Platillo("Hamburgesa", "Jugosa Hamburguesa de carne de res de 225gr, acompañada con las más frescas verduras y una proción de papas a la francesa", "Trigo, Soya, Leche, Huevo", "$150", R.drawable.hamburguesa, R.drawable.e5));
        platillos.add(new Platillo("Enmoladas", "Platillo compuesto por 5 enmoladas rellenas de pollo y bañadas con mole poblano", "Crema", "$150", R.drawable.enmoladas, R.drawable.e5));
        platillos.add(new Platillo("Hotcakes con Fresa", "Disfrute de 4 Hotcakes clasicos acompañados por fresas fileteadas para acompañar cada bocado", "Trigo, Soya, Leche, Huevo, Fresas", "$150", R.drawable.fresas1, R.drawable.e4));
        platillos.add(new Platillo("Arrachera y Chilaquiles", "Pruebe nuestro corte de 170gr de jugosa carne con Chilaquiles rojos o verdes", "Crema", "$150", R.drawable.arracherachilaquiles, R.drawable.e3));
        platillos.add(new Platillo("Chalupas", "Concientase con uno de nuestros antojitos más comunes. 5 Chalupas de diferentes salsas (Roja o Verde) acompañada con cebolla y carne (res, pollo, cerdo)", "Libre de Alergias", "$150", R.drawable.chalupas, R.drawable.e5));
        platillos.add(new Platillo("Enchiladas", "Disfrute 5 enchiladas rellenas de pollo bañadas en salsa roja o verde, acompañado de un poco de crema", "Libre de Alergias", "$150", R.drawable.enchiladas, R.drawable.e4));
        platillos.add(new Platillo("Hotcakes Clásicos", "Nuestra receta clásica es una maravilla. Acompñaelos con diferentes toppings y jarabes", "Trigo, Soya, Leche, Huevo, Nueces", "$150", R.drawable.hotcakes1, R.drawable.e4));
        platillos.add(new Platillo("Pan Dulce", "Concientase de una variedad de 7 panes dulces para acompañar su bebida", "Trigo, Huevo, Leche", "$150", R.drawable.pandulce, R.drawable.e3));
        platillos.add(new Platillo("Taquitos Dorados", "Deleitese con 5 taquitos dorados, pueden estar rellenos de tinga, papa o queso", "Crema, Huevo", "$150", R.drawable.taquitosdorados, R.drawable.e5));
        platillos.add(new Platillo("Tostadas", "2 grandes tostadas de tinga o pollo acompñadas de una capa de frijoles refritos, lechuga y crema al gusto", "Crema", "$150", R.drawable.tostadas, R.drawable.e3));

        menuRecycleview = findViewById(R.id.desayunos_RecyclerView);

        adaptador = new AdaptadorPlatillos(platillos, new AdaptadorPlatillos.OnItemClickListener(){
            @Override
            public void onItemClick(Platillo p) {
                Intent intent = new Intent(DesayunosActivity.this, DetallesPlatillo.class);
                intent.putExtra("platilloEscogido",p);
                startActivity(intent);
            }
        });
       menuRecycleview.setAdapter(adaptador);
    }
}