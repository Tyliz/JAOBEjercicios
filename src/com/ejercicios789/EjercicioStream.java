package com.ejercicios789;

import java.io.*;
import java.util.Scanner;

public class EjercicioStream {
    public static void main(String[] args) {
        System.out.println("<------>Ejercicio de InputStream y PrintStream<------>");
        System.out.println("Ingrese la ruta del archivo a copiar:");
        Scanner scanner = new Scanner(System.in);
        String fileIn = scanner.nextLine();
        System.out.println("Ingrese la ruta donde se copiará el archivo:");
        String fileOut = scanner.nextLine();

        CopiarArchivo(fileIn, fileOut);
    }

    public static void CopiarArchivo(String fileIn, String fileOut) {
        try {
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
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo a copiar no existe.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
