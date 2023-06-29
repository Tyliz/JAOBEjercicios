package com.ejercicios789;

public class EjercicioArrayBidimencional {
    public static void main(String[] args) {
        System.out.println("<------>Ejercicio Array Bidimencional de Numeros Enteros<------>");

        Integer[][] mtxNumeros = new Integer[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("La matriz de numeros es:");
        for (Integer[] fila: mtxNumeros) {
            System.out.print("|");
            for (Integer numero: fila) {
                System.out.print(numero + "|");
            }
            System.out.print("\n");
        }
    }
}
