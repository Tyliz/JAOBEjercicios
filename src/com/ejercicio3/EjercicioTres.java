package com.ejercicio3;

public class EjercicioTres {
    public static void main(String[] args) {
        String[] lstTextos = {"Hola,", "este", "es", "un", "texto", "concatenado"};

        System.out.println(ConcatenarTextos(lstTextos));
    }

    private static String ConcatenarTextos(String[] lstTextos) {
        String resultado = "";

        for (String texto: lstTextos) {
            resultado += " " + texto;
        }

        return resultado;
    }
}
