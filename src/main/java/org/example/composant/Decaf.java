package org.example.composant;

public class Decaf extends Boisson {
    public Decaf() {
        description = "Déca";
    }

    @Override
    public double cout() {
        return 8;
    }
}