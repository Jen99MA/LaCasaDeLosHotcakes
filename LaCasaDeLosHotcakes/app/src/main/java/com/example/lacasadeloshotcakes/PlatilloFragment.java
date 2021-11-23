package com.example.lacasadeloshotcakes;

import java.io.Serializable;

public class PlatilloFragment implements Serializable {

    public String titulo, detalles, dalergias,precio;
    public int direccionImagenPlatillo, direcconImagenCalificacion;

    public PlatilloFragment(String _titulo, String _detalles, String _dalergias, String _precio, int _direccionImagenPlatillo, int _direccionImagenClasificacion)
    {
        titulo = _titulo;
        detalles = _detalles;
        dalergias = _dalergias;
        precio = _precio;
        direccionImagenPlatillo = _direccionImagenPlatillo;
        direcconImagenCalificacion = _direccionImagenClasificacion;
    }
}
