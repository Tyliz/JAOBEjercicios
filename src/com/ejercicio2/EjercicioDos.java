package com.ejercicio2;

import java.util.Scanner;

public class EjercicioDos {
    public static void PedirPrecio() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor introuzca el precio:");
        double precio = scanner.nextDouble();
        System.out.println("El precio con el iva es: " + CalcularPrecioIva(precio));
    }

    public static double CalcularPrecioIva(double precio) {
        double iva = 0.15D;
        return precio + (precio * iva);
    }
}

