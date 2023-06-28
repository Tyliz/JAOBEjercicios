package com.ejercicio4;

public class SmartWatch extends SmartDevice {
    String bluetooth;
    boolean nfc;

    public SmartWatch(String marca, String modelo, String color, String bluetooth, boolean nfc) {
        super(marca, modelo, color);
        this.bluetooth = bluetooth;
        this.nfc = nfc;
    }

    @Override
    public String toString() {
        return String.format("%s, Bluetooth: %s MB, NFC: %s",
                super.toString(),
                bluetooth,
                nfc? "Si": "No"
        );
    }
}
