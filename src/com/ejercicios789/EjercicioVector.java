package com.ejercicios789;

import java.util.Vector;

public class EjercicioVector {
    public static void main(String[] args) {
        System.out.println("<------>Ejercicio Vectores<------>");
        System.out.println("Ejercicio Vector de 5 elementos, quitar 2º y 3º:");
        Vector<String> vector = new Vector<String>();

        vector.add("Good Omens");
        vector.add("La Biblia de los Caídos");
        vector.add("Shadow Hunters");
        vector.add("Erebos");
        vector.add("Elfen lied");

        System.out.println("Vector inicial:");
        System.out.println(vector);

        vector.remove(1);
        vector.remove(1);

        System.out.println("Vector final:");
        System.out.println(vector);
        System.out.println("Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.:");
        System.out.println("Respuesta:\n\tSe ocupa más memoria de la necesaría");
    }
}
