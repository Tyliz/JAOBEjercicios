package com.ejercicio4;

public class SmartDevice {
    String marca;
    String modelo;
    String color;


    public SmartDevice(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String toString() {
        return String.format(
                "Marca: %s, Modelo: %s, Color: %s",
                marca,
                modelo,
                color
        );
    }
}
