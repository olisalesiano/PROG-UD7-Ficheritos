package net.salesianos.mesa;

import java.io.Serializable;

public class Table implements Serializable { // serializable para que se guarde en bytes el progreso
    private String color;
    private int numLegs;

    public Table(String color, int numLegs) {
        this.color = color;
        this.numLegs = numLegs;
    }

    @Override
    public String toString() {
        return "Mesa de color " + color + " con " + numLegs + " patas.";
    }
}
