package com.ejercicios789;

import java.util.Scanner;

public class EjercicioReverse {
    public static void main(String[] args) {
        System.out.println("<------>Ejercicio Reverse<------>");
        System.out.println("Ingrese un texto:");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();

        System.out.println("Resultado: " + reverse(texto));
    }

    public static String reverse(String texto) {
        StringBuilder sBuilder = new StringBuilder(texto);
        return  sBuilder.reverse().toString();
    }
}
