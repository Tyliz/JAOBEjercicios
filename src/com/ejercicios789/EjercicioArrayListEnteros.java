package com.ejercicios789;

import java.util.ArrayList;

public class EjercicioArrayListEnteros {
    public static void main(String[] args) {
        System.out.println("<------>ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10<------>");

        ArrayList<Integer> lstEnteros = new ArrayList<Integer>();

        for (int i = 1; i <= 10 ;i++)
            lstEnteros.add(i);

        lstEnteros.removeIf((numero) -> numero % 2 == 0);

        for (int numero: lstEnteros)
            System.out.println("\t" + numero);
    }
}
