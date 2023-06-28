package com.ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        SmartDevice divice = new SmartDevice("Xiaomi", "TLC 5007", "negro");
        SmartPhone phone = new SmartPhone(
                "Xiaomi",
                "11 Lite 5G NE",
                "plateado",
                8192,
                "MIU 13"
        );
        SmartWatch watch = new SmartWatch(
                "Amazfit",
                "Bip U",
                "negro",
                "5 LE",
                false
        );

        System.out.println("Dispositivo:");
        System.out.println("\t" + divice);
        System.out.println("SmartPhone:");
        System.out.println("\t" + phone);
        System.out.println("SmartWatch:");
        System.out.println("\t" + watch);
    }
}
