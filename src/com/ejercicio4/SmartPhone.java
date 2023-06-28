package com.ejercicio4;

public class SmartPhone extends SmartDevice {
    int ramMB;
    String sistema;

    public SmartPhone(String marca, String modelo, String color, int ramMB, String sistema) {
        super(marca, modelo, color);
        this.ramMB = ramMB;
        this.sistema = sistema;
    }

    @Override
    public String toString() {
        return String.format("%s, Memoria RAM: %d MB, Sistema: %s",
                super.toString(),
                ramMB,
                sistema
        );
    }
}
