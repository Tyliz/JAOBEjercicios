package com.ejercicios789;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioPropio {
    public static void main(String[] args) {
        System.out.println("<------>Ejercicio Custom<------>");
        Escuchar();
    }

    public static void Escuchar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("presiona 'h' para ayuda");
        String input = "";
        boolean terminar = false;

        do {
            input = scanner.next();
            terminar = input.equals("Q");

            if (terminar) {
                terminar = true;
                break;
            }

            if (input.equals("h")) {
                System.out.println("presiona 'Q' para salir");
                System.out.println("presiona 'c' para  copiar un archivo");
                System.out.println("presiona 's' para  guardar una lista de series en un archivo.");
                continue;
            }

            if (input.equals("c")) {
                terminar = CopiarArchivo();
                MostrarMensaje(terminar);
                continue;
            }

            if (input.equals("s")) {
                terminar = GuardarSeries();
                MostrarMensaje(terminar);
                continue;
            }

            scanner.reset();
        } while (!terminar);
    }

    public static void MostrarMensaje(boolean terminar) {
        System.out.println(terminar? "Hasta pronto :)": "Desea realizar algo más? presione 'h' para ayudarlo.");
    }

    public static boolean CopiarArchivo() {
        boolean terminarPrograma = false;
        boolean terminarCopiar = false;
        do {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("presiona 'q' si deseas regresar");
                System.out.println("Ingresa la ruta del archivo a copiar por favor:");

                String input = scanner.nextLine();
                if (input.equals("q")) {
                    terminarCopiar = true;
                    break;
                }

                if (input.equals("Q")) {
                    terminarCopiar = true;
                    terminarPrograma = true;
                    break;
                }

                String fileIn = input;
                System.out.println("Ingrese la ruta donde se copiará:");
                String fileOut = scanner.nextLine();

                InputStream in = new FileInputStream(fileIn);
                BufferedInputStream bufferInput = new BufferedInputStream(in);

                OutputStream out = new FileOutputStream(fileOut);
                BufferedOutputStream bufferOutput = new BufferedOutputStream(out);
                int dato;

                while ((dato = bufferInput.read()) != -1) {
                    bufferOutput.write(dato);
                }
                bufferInput.close();
                bufferOutput.close();

                System.out.println("El archivo fue copiado con exito.");
                terminarCopiar = true;
            } catch (FileNotFoundException ex) {
                System.out.println("El archivo a copiar no existe, intentalo de nuevo;");
            } catch (IOException ex) {
                System.out.println("Lo sentimos ocurrio un problema al copiar, intentalo de nuevo;");
                System.out.println("o presiona 'q' para regresar o 'Q' para salir.");
            }
        } while (!terminarCopiar);

        return terminarPrograma;
    }

    public static boolean GuardarSeries() {
        boolean terminarPrograma = false;
        boolean terminarSeries = false;

        ArrayList<String> lstSeries = new ArrayList<String>();

        lstSeries.add("Final Space");
        lstSeries.add("Inside Job");
        lstSeries.add("Dirk Gently");
        lstSeries.add("Black Mirror");
        lstSeries.add("Gumball");

        do {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("presiona 'q' si deseas regresar");
                System.out.println("Ingresa la ruta donde se guardaran lan series, por favor:");

                String input = scanner.nextLine();

                if (input.equals("q")) {
                    terminarSeries = true;
                    break;
                }

                if (input.equals("Q")) {
                    terminarSeries = true;
                    terminarPrograma = true;
                    break;
                }

                String fileOut = input;
                PrintStream print = new PrintStream(fileOut);

                for (String serie: lstSeries)
                    print.println(serie);

                System.out.println("El archivo se guardo con exito.");
                terminarSeries = true;
            } catch (Exception ex) {
                System.out.println("Lo sentimos ocurrio un problema al guardar, intentalo de nuevo;");
                System.out.println("o presiona 'q' para regresar o 'Q' para salir.");
            }
        } while (!terminarSeries);

        return terminarPrograma;
    }
}
