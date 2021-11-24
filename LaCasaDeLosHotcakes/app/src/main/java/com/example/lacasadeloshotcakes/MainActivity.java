package com.example.lacasadeloshotcakes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener {

    ImageView desayunosImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.contenedor_principal, new PromoFragment())
                .commit();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.contenedor_inferior, new MenuFragment())
                .commit();


    }

    @Override
    public void onFragmentInteraction(int clickedId) {
        switch (clickedId) {
            case R.id.promo_image_view:

                getSupportFragmentManager()
                        .beginTransaction()
                        .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                        .addToBackStack(null)
                        .replace(R.id.contenedor_principal, new PromoFragment())
                        .commit();

                 break;

            case R.id.home_image_view:

                getSupportFragmentManager()
                        .beginTransaction()
                        .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                        .addToBackStack(null)
                        .replace(R.id.contenedor_principal, new HomeFragment())
                        .commit();

                break;

            case R.id.reserva_image_view:

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contenedor_principal, new ReservaFragment())
                        .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                        .addToBackStack(null)
                        .commit();

                break;

            case R.id.DesayunoMenuImageView:

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contenedor_principal, new DesayunosFragment(this))
                        .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                        .addToBackStack(null)
                        .commit();

                break;

        }
    }

    @Override
    public void alEscogerPlatillo(Platillo p) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.contenedor_principal, new DetallesPlatilloFragment(p,this))
                .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left)
                .addToBackStack(null)
                .commit();
    }
}