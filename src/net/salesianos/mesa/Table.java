package net.salesianos.mesa;

import java.io.Serializable;

public class Mesa implements Serializable {
    private String color;
    private int numLegs;

    public Mesa(String color, int numLegs) {
        this.color = color;
        this.numLegs = numLegs;
    }

    @Override
    public String toString() {
        return "Mesa de color " + color + " con " + numLegs + " patas.";
    }
}
