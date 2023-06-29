package com.ejercicios789;

import java.util.ArrayList;
import java.util.LinkedList;

public class EjercicioArrayListLinked {
    public static void main(String[] args) {
        System.out.println("<------>Ejercicio ArrayList y LinkedList<------>");
        ArrayList<String> lstTextos = new ArrayList<String>();

        lstTextos.add("Final Space");
        lstTextos.add("Inside Job");
        lstTextos.add("Dirk Gently");
        lstTextos.add("Black Mirror");
        lstTextos.add("Gumball");

        System.out.println("ArrayList:");

        for (String texto: lstTextos) {
            System.out.println("\t" + texto);
        }

        LinkedList<String> lstLinkedTextos = new LinkedList<String>(lstTextos);

        System.out.println("LinkedList:");
        for (String texto: lstLinkedTextos) {
            System.out.println("\t" + texto);
        }
    }
}
