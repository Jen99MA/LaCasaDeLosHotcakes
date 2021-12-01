package com.example.lacasadeloshotcakes;

import java.io.Serializable;

public class Promo implements Serializable {

    public String promo, descripcionPromo;
    public int direccionImagenPromo;

    public Promo(String _promo, String _descripcionPromo, int _direccionImagenPromo)
    {
        promo = _promo;
        descripcionPromo = _descripcionPromo;
        direccionImagenPromo = _direccionImagenPromo;
    }
}
