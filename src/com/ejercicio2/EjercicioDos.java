package com.ejercicio2;

public class EjercicioDos {
    public static double CalcularPrecioIva(double precio) {
        double iva = 0.15D;
        return precio + (precio * iva);
    }
}

