package com.ejercicios789;

public class EjercicioErrores {
    public static void main(String[] args) {
        System.out.println("<------>Ejercicio de Errores<------>");
        System.out.println("Se ejecuta el metodo DividirPorCero:");
        DividePorCero();
    }

    public static void DividePorCero() {
        try {
            throw new ArithmeticException("Esto no puede hacerse");
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Demo de código");
        }
    }
}
